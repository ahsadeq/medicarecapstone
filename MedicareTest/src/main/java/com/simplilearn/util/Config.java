package com.simplilearn.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	
	final static  String  PROJECT_PROPERTY_FILE="project.properties";
	
	
	static Properties properties =null;

    static void loadPropertiesIfNotLoadedAlready() throws Throwable {
        if(properties==null) {
            properties = new Properties();

            String propFilepath = System.getProperty("user.dir") + "/src/test/resources/" + PROJECT_PROPERTY_FILE;
            File file = new File(propFilepath); 
            System.out.println(file.exists());

            InputStream ins = new FileInputStream(propFilepath);
            properties.load(ins);
        }
    }

    public static String getProperty(String name) {
        try {
			loadPropertiesIfNotLoadedAlready();
		} catch (Throwable e) {
	
			e.printStackTrace();
		}
        return properties.getProperty(name);
    }
	

}
