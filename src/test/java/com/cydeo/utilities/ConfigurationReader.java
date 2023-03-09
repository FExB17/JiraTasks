package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // we declare it private, so it is not reachable and static, so it runs directly when the class is called
    private static Properties properties = new Properties();

    static{
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class");
        }
    }

    /**
     * This method will return the acquired value of the given key inside the .properties file
     */
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }



}
