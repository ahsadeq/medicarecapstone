package com.simplilearn.util;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	
	final static  String  PROJECT_PROPERTY_FILE="project.properties";
	
	
	static Properties properties =null;

    static void loadPropertiesIfNotLoadedAlready() {
    	

        if(properties == null) {
            properties = new Properties();
            String propertyFilePath = System.getProperty("user.dir") + "/src/test/resources/" + PROJECT_PROPERTY_FILE;
            try {
                InputStream inputStream = new FileInputStream(propertyFilePath);
                properties.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static String getProperty(String name) {
        loadPropertiesIfNotLoadedAlready();
        return properties.getProperty(name);
    }

}


    	
    	
    	
    	
    	
    	
    	
    	
    	
//    	
//        if(properties==null) {
//            properties = new Properties();
//
//            String propFilepath = System.getProperty("user.dir") + "/src/test/resources/" + PROJECT_PROPERTY_FILE;
//            File file = new File(propFilepath); 
//            System.out.println(file.exists());
//
//            InputStream ins;
//			try {
//				ins = new FileInputStream(propFilepath);
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//            properties.load(ins);
//        }
//    }
//
//    public static String getProperty(String name) {
//        try {
//			loadPropertiesIfNotLoadedAlready();
//		} catch (Throwable e) {
//	
//			e.printStackTrace();
//		}
//        return properties.getProperty(name);
//    }
//	
//
//}
