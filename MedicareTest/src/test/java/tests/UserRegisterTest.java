package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignUpPage;

public class UserRegisterTest extends BaseTest{
	
	
	HomePage homePage;
	SignUpPage signUpPage;
	
	
	@DataProvider(name="signupDetailsDataProvider")
	public Object[][] signupDetailsDataProvider() {
		return new Object[][]{
			{"Ahmad", "Sadeq", "test123@test@tes","9715555555","123456","USER","SZR Tower","SZR","Dubai","00000","Dubai","UAE"}
	};
	}
	
	@Test (dataProvider="signupDetailsDataProvider")
	public void userRegisterTest(String fname,String lname,String email,String phoneno,String pwd,String role,String address1,String address2,String city,String pcode,String state,String country) {
		
		homePage=new HomePage(driver);
		signUpPage=new SignUpPage(driver);
		
		homePage.Signup();
		signUpPage.setFirstname(fname);
		signUpPage.setLastname(lname);
		signUpPage.setEmail(email);
		signUpPage.setContactnumber(phoneno);
		signUpPage.setPassword(pwd);
		signUpPage.setConfirmpassword(pwd);
		signUpPage.setrole(role);
		signUpPage.clicknextbillingbutton();
		signUpPage.setAddresslineone(address1);
		signUpPage.setAddresslinetwo(address2);
		signUpPage.setCity(city);
		signUpPage.setPostalcode(pcode);
		signUpPage.setState(state);
		signUpPage.setCountry(country);
		signUpPage.clickNextconfirmbutton();
		signUpPage.clickconfirmbutton();
		
		String actualmsg=signUpPage.getWelcomemesage();
		Assert.assertTrue(actualmsg.contains("Welcome!"));
		
		
		
	}

}
