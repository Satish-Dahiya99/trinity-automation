package utilities;

import base.BaseLib;
import org.openqa.selenium.WebDriver;
import pageObjects.ActivateEachService;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Context extends BaseLib {

    private LoginPage loginPage;
    private HomePage homePage;
    private ActivateEachService activateEachService;

    public Context(){
        setUp(FileReaderClass.readData("chromeBrowser"));
    }

    public WebDriver getDriver(){
        return driver;
    }

    public LoginPage getLoginPage(){
        if(loginPage==null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public HomePage getHomePage(){
        if (homePage==null){
            homePage = new HomePage(driver);
        }
        return homePage;
    }

    public ActivateEachService getActivateEachService(){
        if(activateEachService==null){
            activateEachService = new ActivateEachService(driver);
        }
        return activateEachService;
    }
}
