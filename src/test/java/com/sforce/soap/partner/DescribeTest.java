package com.sforce.soap.partner;

import com.sforce.ws.ConnectionException;
import com.sforce.ws.bind.TypeMapper;
import com.sforce.ws.parser.XmlOutputStream;
import org.apache.log4j.Logger;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.xml.sax.SAXException;

import javax.xml.namespace.QName;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class DescribeTest {

//<<<<<<< HEAD
//    private static final String ENDPOINT = "https://na7.salesforce.com/services/Soap/u/26.0";
    private static final String USER = "dpham@na7.test.salesforce.com";
    private static final String PASSWORD = "salesforce123456";
//=======
    private static final Logger LOGGER = Logger.getLogger(DescribeTest.class);
//    private static final String USER = "api@api.entity.test.org";
//    private static final String PASSWORD = "123456";
    private static final File DATA_DIRECTORY = new File("data");
    private static final File ERROR_DIRECTORY = new File("error");
    private static final String DATE_FORMAT = "yyyyMMddHHmmssZ";
    private static final String ROOT_ELEMENT = "root";
    private static final String CURRENT_RUN = new SimpleDateFormat(DATE_FORMAT, Locale.US).format(new Date());
    private static final String FILE_SUFFIX = "_" + CURRENT_RUN + ".xml";
//>>>>>>> 7182a4bbd50c79d446be20f0cb65bfd24fb47a1c
    private static PartnerConnection partnerConnection;
    private final String objectToTest;

    public DescribeTest(String objectToTest) {
        this.objectToTest = objectToTest;
    }

    @Parameterized.Parameters(name = "Describe{0}")
    public static Collection<Object[]> data() throws Exception {
        partnerConnection = PartnerConnectionFactory.getPartnerConnection();
        loginAndSetSessionHeader();

        DescribeGlobalResult describeGlobalResult = partnerConnection.describeGlobal();
        DescribeGlobalSObjectResult[] sobjects = describeGlobalResult.getSobjects();

        Collection<Object[]> testParameters = new ArrayList<Object[]>(sobjects.length);
        for (DescribeGlobalSObjectResult sobject : sobjects) {
            testParameters.add(new Object[]{sobject.getName()});
        }
        return testParameters;
    }

    @BeforeClass
    public static void createDirectories() {
        if (!DATA_DIRECTORY.exists()) {
            boolean dirCreated = DATA_DIRECTORY.mkdir();
            assertTrue("Could not create data directory", dirCreated);
        }
        if (!ERROR_DIRECTORY.exists()) {
            boolean dirCreated = ERROR_DIRECTORY.mkdir();
            assertTrue("Could not create error directory", dirCreated);
        }
    }

    @AfterClass
    public static void logout() {
        try {
            partnerConnection.logout();
        } catch (ConnectionException e) {
            LOGGER.warn("Could not logout after running test class: " + e.getMessage(), e);
        }
    }

    @Test
    public void describe() throws Exception {
        DescribeSObjectResult describeSObjectResult = partnerConnection.describeSObject(objectToTest);
        assertNotNull(describeSObjectResult);

        File currentRun = new File(DATA_DIRECTORY, describeSObjectResult.getName() + FILE_SUFFIX);
        assertFalse("Trying to write to existing file: " + currentRun.getAbsolutePath(), currentRun.exists());

        File previousRun = loadPreviousRunFile(describeSObjectResult.getName());
        writeOutputFile(describeSObjectResult, currentRun);
        if (previousRun != null) {
            compareFiles(currentRun, previousRun, describeSObjectResult.getName());
            boolean deleteSuccessful = previousRun.delete();
            if (!deleteSuccessful) {
                LOGGER.warn("Could not delete file: " + previousRun.getAbsolutePath());
            }
        } else {
            LOGGER.info("No previous run found for " + describeSObjectResult.getName() + " so no assertions will be performed");
        }
    }

    private void compareFiles(File currentRun, File previousRun, String name) throws SAXException, IOException {
        FileReader previousRunReader = new FileReader(previousRun);
        FileReader currentRunReader = new FileReader(currentRun);
        Diff diff;
        try {
            diff = XMLUnit.compareXML(previousRunReader, currentRunReader);
        } finally {
            closeQuietly(previousRunReader);
            closeQuietly(currentRunReader);
        }
        if (!diff.identical()) {
            File target = new File(ERROR_DIRECTORY, currentRun.getName());
            boolean moveSuccessful = currentRun.renameTo(target);
            if (!moveSuccessful) {
                throw new IllegalStateException("Could not move " + currentRun.getAbsolutePath() + " to " + target.getAbsolutePath());
            }
            fail("Object " + name + " changed its structure since last run: " + diff.toString());
        }
    }

    private void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException ignored) {
        }
    }

    private File loadPreviousRunFile(final String objectName) {
        File[] previousRuns = DATA_DIRECTORY.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().startsWith(objectName + "_");
            }
        });
        if (previousRuns.length > 1) {
            throw new IllegalStateException("More than one previous run found for " + objectName);
        }
        if(previousRuns.length == 1) {
            return previousRuns[0];
        }
        return null;
    }

    private void writeOutputFile(DescribeSObjectResult describeSObjectResult, File outputFile) throws IOException {
        FileOutputStream fos = new FileOutputStream(outputFile);
        XmlOutputStream xmlOutputStream = new XmlOutputStream(fos, "\t");
        try {
            describeSObjectResult.write(new QName(ROOT_ELEMENT), xmlOutputStream, new TypeMapper());
        } finally {
            xmlOutputStream.close();
        }
    }

    private static void loginAndSetSessionHeader() throws Exception {
        LoginResult loginResult = partnerConnection.login(USER, PASSWORD);
        assertFalse("Password expired", loginResult.isPasswordExpired());
        partnerConnection.setSessionHeader(loginResult.getSessionId());
    }
}
