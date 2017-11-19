package com.afomin.test.teamcity;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Titanic {
    public Titanic() {
    }

    public String getVersion() throws IOException {
        Properties properties = new Properties();


        InputStream propertiesStream = getClass().getClassLoader().getResourceAsStream("version.properties");
        if (propertiesStream != null) {
            properties.load(propertiesStream);
            return properties.getProperty("version");
        }
        return "0.0.0-DEFAULT";
    }
}
