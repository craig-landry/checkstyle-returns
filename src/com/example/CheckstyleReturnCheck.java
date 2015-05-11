package com.example;

import java.sql.SQLException;
import java.util.Properties;

public class CheckstyleReturnCheck {
    private final ManagedResource managedResource = new ManagedResource();

    /**
     * This method has a single return.  Inside the method there is a lambda, and that lambda
     * has a return, which it seems that checkstyle is treating has belonging to the
     * getClientInfo method.
     *
     * Checkstyle reports "Return count is 2 (max allowed is 1)."
     */
    public Properties getClientInfo() {
        return managedResource.withConnection(conn -> {
            Properties clientInfo = new Properties();
            try {
                clientInfo = conn.getClientInfo();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return clientInfo;
        });
    }
}
