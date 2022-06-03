package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewProductsPage extends BasePage {
	
	By categories = By.xpath("//a[@class='list-group-item']");
	By antipyretics= By.xpath("a_Antipyretics");
	By analgesics = By.id("a_Analgesics");
	By antibiotics = By.id("a_Antibiotics");
	By painreliever = By.id("a_Plain Reliever");
	By search = By.xpath("//input[@type='search']");
	By productName=By.xpath("//td[normalize-space()='Combiflame']");
	By showProduct2 = By.cssSelector("a[href='/medicare/show/2/product']");
	By editProduct2 = By.cssSelector("a[href='/medicare/manage/2/product']");
	By continueshopping= By.xpath("//a[contains(text(),'Continue Shopping')]");
	By add_product_cart=By.xpath("//tr[@class='odd']//a[@class='btn btn-success']");
	
	
	public ViewProductsPage(WebDriver driver){
        this.driver = driver;
    }
	
	public void setSearch(String _search){
        sendKeyValue(search, _search);
    }

    public String getproductname(){
        return getKeyValue(productName);
    }
    
    public void clickaddproducttocart(){
        
        click(add_product_cart);
    }
	

}
