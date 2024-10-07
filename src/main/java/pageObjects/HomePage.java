package pageObjects;

import base.BaseLib;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(xpath = "//*[text()='SANDY SETUP']/.")
    WebElement snadySetup;


    Logger log = BaseLib.getLog(this.getClass().getName());

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToSandySetup(){
        snadySetup.click();
    }
}
