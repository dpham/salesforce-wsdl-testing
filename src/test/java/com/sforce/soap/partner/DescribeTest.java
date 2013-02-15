package com.sforce.soap.partner;

import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

@RunWith(Parameterized.class)
public class DescribeTest {

    private static final String ENDPOINT = "https://na7.salesforce.com/services/Soap/u/26.0";
    private static final String USER = "dpham@na7.test.salesforce.com";
    private static final String PASSWORD = "salesforce123456";
    private static PartnerConnection partnerConnection;
    private final String objectToTest;

    public DescribeTest(String objectToTest) {
        this.objectToTest = objectToTest;
    }

    @Parameterized.Parameters(name = "Describe{0}")
    public static Collection<Object[]> data() throws Exception {
        createPartnerConnection();
        loginAndSetSessionHeader();

        DescribeGlobalResult describeGlobalResult = partnerConnection.describeGlobal();
        DescribeGlobalSObjectResult[] sobjects = describeGlobalResult.getSobjects();

        Collection<Object[]> testParameters = new ArrayList<Object[]>(sobjects.length);
        for (DescribeGlobalSObjectResult sobject : sobjects) {
            testParameters.add(new Object[]{sobject.getName()});
        }
        return testParameters;
    }

    @AfterClass
    public static void logout() throws ConnectionException {
        partnerConnection.logout();
    }

    @Test
    public void describe() throws Exception {
        DescribeSObjectResult describeSObjectResult = partnerConnection.describeSObject(objectToTest);
        assertNotNull(describeSObjectResult);
    }

    private static void createPartnerConnection() throws ConnectionException {
        ConnectorConfig config = new ConnectorConfig();
        config.setAuthEndpoint(ENDPOINT);
        config.setServiceEndpoint(ENDPOINT);
        config.setManualLogin(true);
        partnerConnection = new PartnerConnection(config);
    }

    private static void loginAndSetSessionHeader() throws Exception {
        LoginResult loginResult = partnerConnection.login(USER, PASSWORD);
        assertFalse("Password expired", loginResult.isPasswordExpired());
        partnerConnection.setSessionHeader(loginResult.getSessionId());
    }
}
