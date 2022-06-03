package com.simplilearn.util;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;





public class SeleniumDriverManager {
	
	 WebDriver driver = null;
	 
	 public WebDriver getDriver(String browser) {
	        if(driver == null) {
	            setupRemoteWebDriver(browser);
	        }
	        return driver;
	    }

	 private void setupRemoteWebDriver(String browserName){

	        URL url = null;
	        String server = Config.getProperty("hubIP");
	        String port = Config.getProperty("hubPort");

	        try{
	            url = new URL("http://"+server+":"+port+"/wd/hub");
	        }catch (MalformedURLException e){
	            e.printStackTrace();
	        }
	        DesiredCapabilities capabilities = null;
	        System.out.println("Browser Name: "+browserName);

	        if(browserName.equals("firefox")){
	            capabilities = DesiredCapabilities.firefox();
	            capabilities.setBrowserName(browserName);
	            capabilities.setPlatform(Platform.WINDOWS);
	            driver = new RemoteWebDriver(url, capabilities);
	        }else if(browserName.equals("chrome")){
	            capabilities = DesiredCapabilities.chrome();
	            capabilities.setBrowserName(browserName);
	            capabilities.setPlatform(Platform.WINDOWS);
	            driver = new RemoteWebDriver(url, capabilities);
	        }

	    }
	    
	    
	private void setupChromeDriver() {

	        String projectFolderPath = System.getProperty("user.dir");
	        String chromeDriverpath = projectFolderPath + "/drivers/chromedriver.exe";
	        System.setProperty("webdriver.chrome.driver", chromeDriverpath);
	        driver = new ChromeDriver();

	    }}
