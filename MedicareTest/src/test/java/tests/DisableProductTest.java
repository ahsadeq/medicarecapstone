package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManagePage;

public class DisableProductTest extends BaseTest {
	
	HomePage homePage;
	LoginPage loginpage;
	ManagePage managepage;

	@DataProvider (name = "productnameDataProvider")
	public Object[][] productnameDataProvider() {
		return new Object[][]{
		{"vk@gmail.com", "admin", "Combiflame"}
		};
	}
	
	@Test(dataProvider = "productnameDataProvider")
	public void enableProductTest(String user,String pwd, String product) throws Throwable {
		
		
		 homePage = new HomePage(driver);
		 managepage = new ManagePage(driver);
		 
		 userloginmethod(user,pwd);
		 homePage.manageProduct();
		 managepage.search(product);
		 managepage.clickActivatebutton();
	
		 	Thread.sleep(5000);
	        String activationmessage = managepage.getactivationmessage();
	        System.out.println(activationmessage);
	        
	        Thread.sleep(10000);
	        
	        if(activationmessage.contains("You want to activate the Product?")) {
	        	 managepage.clickactivatedeactivatecancelbutton();
		            System.out.println("Product is already Disabled!!");
	            

	        }else{
	        	managepage.clickactivatedeactivatebutton();
	            String actualresult = managepage.getactivationmessage2();
	            System.out.println(actualresult);
	            managepage.clickactivationOK();
	            Assert.assertTrue(actualresult.contains("Product Dectivated Successfully"));
	        }
		    
		    
	}
	
	
	}

