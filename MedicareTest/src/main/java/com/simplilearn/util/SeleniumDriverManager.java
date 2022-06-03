package com.simplilearn.util;

import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class SeleniumDriverManager {
	
	 WebDriver driver=null;
	 
	 public WebDriver getDriver(){
	        if(driver == null){
	            try {
	                setupRemoteWebdriver();
	            } catch (Throwable throwable) {
	                throwable.printStackTrace();
	            }
	        }
	        return driver;
	    }

	    private void setupRemoteWebdriver() {
	        URL url = null;
	        try {
	            String server=Config.getProperty("hubIP");
	            String port=Config.getProperty("hubPort");

	            url = new URL("http://"+server+":"+port+"/wd/hub");
	        } catch (Throwable e) {
	            e.printStackTrace();
	        }

	        DesiredCapabilities caps = DesiredCapabilities.chrome();
	        caps.setBrowserName("chrome");
	        caps.setPlatform(Platform.WINDOWS);
	        driver = new RemoteWebDriver(url,caps);
	    }

//	    private ChromeDriver setupChromeDriver() {
//	        String projectFolderPath =System.getProperty("user.dir");
//	        String chromeDriverPath = projectFolderPath + "/drivers/chromedriver.exe";
//	        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
//	        return new ChromeDriver();
//
//	    }

}
