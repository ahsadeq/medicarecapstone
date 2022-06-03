package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	WebDriver driver;

    public void click(By byObject){
         driver.findElement(byObject).click();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }
    
    public String getKeyValue(By byObject){
        return driver.findElement(byObject).getText();
     }
  
    public void sendKeyValue(By byObject,String info) {
    	driver.findElement(byObject).sendKeys(info);
    }
    public void clearText(By byObject){
        driver.findElement(byObject).clear();
    }
   

}
