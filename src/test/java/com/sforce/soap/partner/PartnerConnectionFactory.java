package com.sforce.soap.partner;

import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;

public class PartnerConnectionFactory {

//    private static final String ENDPOINT = "http://api-test-wsl5:8081/services/Soap/u/27.0";
    private static final String ENDPOINT = "https://na7.salesforce.com/services/Soap/u/26.0";
    private static PartnerConnection partnerConnection;

    public static synchronized PartnerConnection getPartnerConnection() throws ConnectionException {
        if (partnerConnection == null) {
            ConnectorConfig config = new ConnectorConfig();
            config.setAuthEndpoint(ENDPOINT);
            config.setServiceEndpoint(ENDPOINT);
            config.setManualLogin(true);
            partnerConnection = new PartnerConnection(config);
        }
        return partnerConnection;
    }
}
