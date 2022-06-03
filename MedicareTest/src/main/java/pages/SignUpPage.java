package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage{
	
	By firstname= By.xpath("//input[@id='firstName']");
	By lastname= By.xpath("//input[@id='lastName']");
	By email= By.xpath("//input[@id='email']");
	By contactNum= By.xpath("//input[@id='contactNumber']");
	By pwd= By.xpath("//input[@id='password']");
	By confirmPwd= By.xpath("//input[@id='confirmPassword']");
	By userRole= By.cssSelector("#role1");
	By supplierRole= By.cssSelector("#role2");
	By Next_bill_btn= By.tagName("button");
	
	By address1=By.xpath("//input[@id='addressLineOne']");
	By address2=By.xpath("//input[@id='addressLineTwo']");
	By city=By.xpath("//input[@id='city']");
	By postalcode=By.xpath("//input[@id='postalCode']");
	By state=By.xpath("//input[@id='state']");
	By country=By.xpath("//input[@id='country']");
	
	By btn_back=By.xpath("//button[@name=\"_eventId_personal\"]");
	By btn_next=By.xpath("//button[@name=\"_eventId_confirm\"]");
	
	By btn_confirm_last=By.xpath("//a[contains(text(),'Confirm')]");
	By welcometext = By.xpath("//h1[normalize-space()='Welcome!']");
	
	
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
		
	}


	public void setFirstname(String _firstname) {
		sendKeyValue(firstname, _firstname);
	}

	public void setLastname(String _lastname){
		sendKeyValue(lastname, _lastname);
	}

	public void setEmail(String _email){
		sendKeyValue(email, _email);
	}

	public void setPassword(String _password){
		sendKeyValue(pwd, _password);
	}

	public void setConfirmpassword(String _confirmpassword){
	    sendKeyValue(confirmPwd, _confirmpassword);
	}
	
	public void setContactnumber(String _contact){
	    sendKeyValue(contactNum, _contact);
	}
	
	public void setrole(String _role){
	    if(_role == "USER"){
	        click(userRole);
	    }else{
	        click(supplierRole);
	    }
	}

	public void setAddresslineone(String _addressline1){
	    sendKeyValue(address1, _addressline1);
	}
	
	public void setAddresslinetwo(String _addressline2){
	    sendKeyValue(address2, _addressline2);
	}
	
	public void setCity(String _city){
	    sendKeyValue(city, _city);
	}
	
	public void setPostalcode(String _postalcode){
	    sendKeyValue(postalcode, _postalcode);
	}
	
	public void setState(String _state){
	    sendKeyValue(state, _state);
	}
	
	public void setCountry(String _country){
	    sendKeyValue(country, _country);
	}
	
	public void clickNextconfirmbutton(){
	    click(btn_next);
	}
	
	public void clicknextbillingbutton(){
	    click(Next_bill_btn);
	}
	
	public void clickconfirmbutton(){
	    click(btn_confirm_last);
	}
	
	public String getWelcomemesage(){
	   return getKeyValue(welcometext);
	}
}

