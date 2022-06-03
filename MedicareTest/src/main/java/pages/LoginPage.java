package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	
	By txt_user= By.xpath("//input[@id='username']");
	By txt_pwd= By.xpath("//input[@id='password']");
	By btn_login=By.xpath("//input[@class='btn btn-primary']");
	By btn_rege=By.xpath("//a[contains(text(),'Register Here')]");
	By cart=By.xpath("//a[@href='/medicare/cart/show']");
	By get_user=By.xpath("//li[@id='userModel']");
	By logout=By.id("logout");
	By dropdown = By.xpath("//a[@class='btn btn-default dropdown-toggle']");
	By msg_invalid=By.xpath("//div[@class='alert alert-danger fade in']");
	By msg_logout=By.xpath("//div[@class='alert alert-success']");
	
	
	  public LoginPage(WebDriver driver) {

	        this.driver=driver;
	    }
	  
	  public void setUserName(String _username)
	    {
	        driver.findElement(txt_user).sendKeys(_username);
	    }
	  
	  public void setUserPassword(String _password)
	    {
	        driver.findElement(txt_pwd).sendKeys(_password);
	    }

	  public void clickLogin(){
	        driver.findElement(btn_login).click();
	    }

	  public String getinvalidmessage(){
	        return getKeyValue(msg_invalid);
	    }
	  
	  public String getUsername() {
		  return getKeyValue(get_user);
	  }

	  public void clickLogout(){
	        click(logout);
	    }
	 
	  
	  public void clickdropdown(){
	        click(dropdown);
	    }
}
