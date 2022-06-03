package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagePage extends BasePage {
	
	
	
	By productName=By.xpath("//input[@id=\"name\" and @placeholder=\"Product Name\"]");
	By brandName=By.xpath("//input[@id='brand']");
	By description=By.xpath("//div[@class=\"col-md-8\"]//textarea[@id=\"description\"] ");
	By unitprice=By.xpath("//input[@id='unitPrice']");
	By quantity=By.xpath("//input[@id='quantity']");
	By uploadfile=By.xpath("//input[@id='file']");
	By choosefile=By.xpath("//input[@id='file']");
	By category=By.cssSelector("#categoryId");
	//new category 
	By btn_newcategory=By.xpath("//button[contains(text(),'Add New Category')]");
	By cat_name=By.xpath("//div[@class=\"col-md-8 validate\"]//input[@id=\"name\"]");
	By newdescription=By.xpath("//div[@class=\"col-md-8 validate\"]//textarea[@id=\"description\"]");
	By btn_savecat=By.xpath("//div[@class=\"col-md-offset-4 col-md-4\"]//input[@type=\"submit\"]");
	By catmessage = By.xpath("//div[@class='col-xs-12 col-md-offset-2 col-md-8']");		
	//available Products
	By searchbar=By.xpath("//input[@type='search']");
	By edit_btn1=By.xpath("//a[@class=\"btn btn-primary\"]");

	
	By activate_prdct1=By.xpath("//label[@class=\"switch\"]");

	By activateok=By.xpath("//button[contains(text(),'OK')]");
	By activatecancel=By.xpath("//button[contains(text(),'Cancel')]");
	By activatemsg=By.cssSelector("body.modal-open:nth-child(2) div.bootbox.modal.fade.bootbox-confirm.in div.modal-dialog div.modal-content div.modal-body > div.bootbox-body");
	By btn_ok_closemsg=By.xpath("//button[contains(text(),'OK')]");
	By btn_cancel_closemsg=By.xpath("//button[contains(text(),'Cancel')]");
	By validationfailmsg=By.xpath("//div[contains(text(),'Validation fails for adding the product!')]");
	By activatemsg2=By.cssSelector("div.bootbox.modal.fade.bootbox-alert.in div.modal-dialog div.modal-content div.modal-body > div.bootbox-body");
	
	
	 public ManagePage(WebDriver driver){
	        this.driver = driver;
	    }
	 public void setProductName(String _productname){
	        sendKeyValue(productName, _productname);
	    }

	    public void setBrandname(String _brandname){
	        sendKeyValue(brandName, _brandname);
	    }

	    public void setBranddescription(String _description){
	        sendKeyValue(description, _description);
	    }

	    public void setUnitprice(String _unitprice){
	        clearText(unitprice);
	        sendKeyValue(unitprice, _unitprice);
	    }

	    public void setQuantity(String _quantity){
	        clearText(quantity);
	        sendKeyValue(quantity, _quantity);
	    }

	    public void setUploadfile(String _file){
	        sendKeyValue(uploadfile, _file);
	    }

	    public void setCategory(String _category){
	        sendKeyValue(category, _category);
	    }

	    public void clickSave(){
	        click(btn_savecat);
	    }

	    public void search(String _searchtext){
	        sendKeyValue(searchbar, _searchtext);
	    }

	    public void clickEditbutton1(){
	        click(edit_btn1);
	    }

	    public void clickActivatebutton(){
	        click(activate_prdct1);
	    }

	    public void clickactivatedeactivatebutton(){
	        click(activateok);
	    }

	    public void clickactivatedeactivatecancelbutton(){
	        click(activatecancel);
	    }

	    public String getactivationmessage(){
	        return getKeyValue(activatemsg);
	    }


	    public void clickactivationOK(){

	        click(activateok);
	    }

	    public String getAlertMessage(){
	        return getKeyValue(catmessage);
	    }

	    public void clickAddNewCategory(){
	        click(btn_newcategory);
	    }

	    public void setCategoryName(String _categoryname){
	        sendKeyValue(cat_name, _categoryname);
	    }

	    public void setCategoryDescription(String _categoryDesp){
	        sendKeyValue(newdescription, _categoryDesp);
	    }

	    public void clickSaveCategory(){
	        click(btn_savecat);
	    }

	    public String getCategoryAddedmessage(){
	        return getKeyValue(catmessage);
	    }
	
	
	    public String getactivationmessage2(){
	        return getKeyValue(activatemsg2);
	    }
	
	
}
