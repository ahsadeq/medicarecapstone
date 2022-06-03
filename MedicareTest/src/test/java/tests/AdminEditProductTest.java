package tests;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManagePage;

public class AdminEditProductTest extends BaseTest {
	

	HomePage homePage;
	LoginPage loginpage;
	ManagePage managepage;
	
	@DataProvider(name ="producteditpriceDataProvider")
	public Object[][] producteditpriceDataProvider (){
		return new Object[][] {{"vk@gmail.com","admin","Aceclofenac","100"}};
	}

	
	@Test(dataProvider="producteditpriceDataProvider")
	public void adminEditProductTest(String email,String pwd,String productName,String price) throws Throwable {
		homePage = new HomePage(driver);
	    managepage = new ManagePage(driver);
	    loginpage = new LoginPage(driver);
	    
	    userloginmethod(email,pwd);
	    Thread.sleep(6000);
	    homePage.manageProduct();
	    Thread.sleep(6000);
	    
	    managepage.search(productName);
	    managepage.clickEditbutton1();
	    managepage.setUnitprice(price);
	    managepage.clickSave();
	    String msg=managepage.getAlertMessage();
	    Assert.assertTrue(msg.contains("Product submitted successfully"));
	    System.out.println(msg);
	    
	}
	
	
	
	
}
