package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pages.HomePage;
import pages.LoginPage;

public class InvalidLoginTest extends BaseTest{

	HomePage homePage;
    LoginPage loginPage;
	
	
	
    @DataProvider(name = "invalidloginDataProvider")
	    public Object[][] validloginDataProvider(){
	        return new Object[][]{
	                {"kn@gmail.com", "6666"}
	        };
	    }
	  
	  
	
	@Test(dataProvider="invalidloginDataProvider")
	  public void invalidLoginTest(String username,String pass) {
	        homePage = new HomePage(driver);
	        loginPage = new LoginPage(driver);
	        homePage.Login();
	        loginPage.setUserName(username);
	        loginPage.setUserPassword(pass);
	        loginPage.clickLogin();
	        String actualresult = loginPage.getinvalidmessage();
	        Assert.assertTrue(actualresult.contains("invalid"));
	        
	        
	  }

}
