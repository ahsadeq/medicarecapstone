package tests;



import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;
import com.simplilearn.util.Config;
import com.simplilearn.util.SeleniumDriverManager;

import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    String homePageUrl = Config.getProperty("HOME_PAGE_URL");

    @Parameters({"browser"})
    @BeforeClass
    public void startBrowser(String browser){
        driver = new SeleniumDriverManager().getDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get(homePageUrl);
    }

    @AfterClass
    public void teardownBrowser(){
        driver.quit();
    }

    public void userloginmethod(String username, String password){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
      
        homePage.Login();
        loginPage.setUserName(username);
        loginPage.setUserPassword(password);
        loginPage.clickLogin();
    }}
