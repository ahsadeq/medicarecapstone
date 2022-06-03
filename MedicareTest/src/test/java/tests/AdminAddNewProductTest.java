package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ManagePage;

public class AdminAddNewProductTest extends BaseTest{	
	
	HomePage homePage;
	LoginPage loginpage;
	ManagePage managepage;

	@DataProvider(name="details")
	public Object [][] detailsDataProvider(){
		return new Object[][] {
			 {"vk@gmail.com", "admin", "Panadol Extra", "Panadol", "Instant Pain Killer", "20", "15",
                 "C:\\Users\\Ahmad\\MedicareTest\\ProductImage\\Panadolextra.jpg", "Pain Reliever"},

		};
	}



@Test(dataProvider="details")
public void AdmindAddNewProductTest(String email,String pwd, String productname,String brand, String description, String unitprice,
        String quantity, String imagepath, String category) throws Throwable{ 
	

    homePage = new HomePage(driver);
    managepage = new ManagePage(driver);
    loginpage = new LoginPage(driver);
    
    
    userloginmethod(email,pwd);
    Thread.sleep(6000);
    homePage.manageProduct();
    
    Thread.sleep(6000);
    
    managepage.setBrandname(brand);
    managepage.setProductName(productname);
   
    managepage.setBranddescription(description);
    managepage.setUnitprice(unitprice);
    managepage.setQuantity(quantity);
    managepage.setUploadfile(imagepath);
    managepage.setCategory(category);
    managepage.clickSave();
    String msg = managepage.getAlertMessage(); 
    System.out.println(msg);
    Assert.assertTrue(msg.contains("Product submitted successfully"));
    loginpage.clickdropdown();
    loginpage.clickLogout();
}



}
	
