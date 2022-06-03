package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
	
	By checkout_btn=By.partialLinkText("Checko");
	By removeproduct=By.xpath("a[href=\"/medicare/cart/1/remove\"]");
	By address1=By.xpath("//input[@id='addressLineOne']");
	By address2=By.xpath("//input[@id='addressLineTwo']");
	By city=By.xpath("//input[@id='city']");
	By postalcode=By.xpath("//input[@id='postalCode']");
	By state=By.xpath("//input[@id='state']");
	By country =By.xpath("//input[@id='country']");
	By selectaddress=By.xpath("//a[contains(text(),'Select')]");
	By add_address_btn=By.tagName("button");
	private By cardnum=By.xpath("//input[@id='cardNumber']");
	private By expirymonth=By.xpath("//input[@id='expityMonth']");
	private By expiryyear=By.xpath("//input[@id='expityYear']");
	private By cvc=By.xpath("//input[@id='cvCode']");
	private By pay = By.linkText("Pay");
    private By orderconfirmation_msg = By.xpath("//h3[normalize-space()='Your Order is Confirmed!!']");


    public CheckoutPage(WebDriver driver){
    	this.driver = driver;
    }

    public void ClickRemoveProductBtn() {
    	click(removeproduct);
    }
    	
    public void clickcheckoutbutton(){
        click(checkout_btn);
    }

    public void clickselectaddressbutton(){
        click(selectaddress);
    }

    public void setCardnumber(String _cardnum){
        sendKeyValue(cardnum, _cardnum);
    }

    public void setExpiryMonth(String _expirymonth){
        sendKeyValue(expirymonth, _expirymonth);
    }

    public void setexpiryyear(String _expiryyear){
        sendKeyValue(expiryyear, _expiryyear);
    }

    public void setcvvcode(String _cvc){
        sendKeyValue(cvc, _cvc);
    }

    public void clickpaybutton(){
        click(pay);
    }

    public String getorderconfirmation(){
        return getKeyValue(orderconfirmation_msg);
    }



}