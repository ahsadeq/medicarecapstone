package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	By about_btn=By.linkText("About");
	By contact_btn=By.linkText("Contact");
	By view_prdct_btn=By.xpath("//a[contains(text(),'View Products')]");
	By signup_btn=By.linkText("Sign Up");
	By login_btn=By.linkText("Login");
	By more_btn=By.xpath("//a[@class='btn btn-primary']");
	By cart=By.xpath("//a[@href='/medicare/cart/show']");
	By logout=By.linkText("logout");
	By dropdown = By.xpath("//a[@class='btn btn-default dropdown-toggle']");
	By manageproduct = By.id("manageProduct");
	
	
	public HomePage(WebDriver driver){
        this.driver=driver;
    }
	
	public void Login(){
        driver.findElement(login_btn).click();
    }
	 public void Signup() {
	        driver.findElement(signup_btn).click();
	    }
	 public void Cart() {
		 driver.findElement(cart).click();
		 
	 }
		public void Logout(){
	        driver.findElement(logout).click();
		}
		public void Contact(){
	        driver.findElement(contact_btn).click();
		}
		public void About(){
	        driver.findElement(about_btn).click();
		}
		public void MoreProducts(){
	        driver.findElement(more_btn).click();
		}
		
		 public void manageProduct() {
			 driver.findElement(manageproduct).click();
			 
		 }
		
		 public void viewProducts() {
			 driver.findElement(view_prdct_btn).click();
			 
		 }
}




 