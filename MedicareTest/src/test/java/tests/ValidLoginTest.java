package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class ValidLoginTest extends BaseTest{

	HomePage homePage;
    LoginPage loginPage;
	
	
	
    @DataProvider(name = "validloginDataProvider")
	    public Object[][] validloginDataProvider(){
	        return new Object[][]{
	                {"kn@gmail.com", "12345", "Kavita Nigam"}
	        };
	    }
	  
	  
	  @Test(dataProvider="validloginDataProvider")
	  public void validLoginTest(String username,String pass,String expectedresult) {
	        homePage = new HomePage(driver);
	        loginPage = new LoginPage(driver);
	        homePage.Login();
	        loginPage.setUserName(username);
	        loginPage.setUserPassword(pass);
	        loginPage.clickLogin();
	        String actualResult=loginPage.getUsername();
	        Assert.assertEquals(expectedresult, actualResult);
	        
	  }

}
