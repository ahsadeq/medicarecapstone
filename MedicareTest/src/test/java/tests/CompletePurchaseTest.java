package tests;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.ViewProductsPage;

public class CompletePurchaseTest extends BaseTest{

	HomePage homePage;
	ViewProductsPage viewProductsPage;
	CheckoutPage checkoutPage;
	
	  @DataProvider(name = "validloginDataProvider")
	    public Object[][] loginDataProvider(){
	        return new Object[][]{
	                {"kn@gmail.com", "12345", "Aceclofenac"}
	        };
	    }
	  @DataProvider(name = "cardPaymentdetailsDataProvider")
	    public Object[][] cardPaymentdetailsDataProvider(){
	        return new Object[][]{
	                {"0123456789000000", "10", "24", "666"}
	        };
	    }
	  
	  @Test(dataProvider="validloginDataProvider")
	  public void a_addproduct2cart(String username, String pwd, String product) throws Throwable {
		 
		  Thread.sleep(10000);
		  viewProductsPage= new ViewProductsPage(driver);
		  homePage=new HomePage(driver);
		  userloginmethod(username,pwd);
		  homePage.viewProducts();
		  viewProductsPage.setSearch(product);
		  Thread.sleep(6000);
		  viewProductsPage.clickaddproducttocart();
		  Thread.sleep(6000);
		  
	  }
	  @Test(dataProvider="cardPaymentdetailsDataProvider")
	  public void b_completePurchaseTest(String ccnum,String month_exp,String year_exp,String cvc) {
		  checkoutPage=new CheckoutPage(driver);
		  checkoutPage.clickcheckoutbutton();
		  checkoutPage.clickselectaddressbutton();
		  checkoutPage.setCardnumber(ccnum);
		  checkoutPage.setExpiryMonth(month_exp);
		  checkoutPage.setexpiryyear(year_exp);
		  checkoutPage.setcvvcode(cvc);
		  checkoutPage.clickpaybutton();
		  String expectedmsg=checkoutPage.getorderconfirmation();
		  Assert.assertTrue(expectedmsg.contains("Your Order is Confirmed!!"));
		  
		  
	  }
}
