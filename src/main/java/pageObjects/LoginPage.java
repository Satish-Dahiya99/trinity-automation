package pageObjects;

import base.BaseLib;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.FileReaderClass;

public class LoginPage extends BasePage{

    @FindBy(id = "EmailId")
    WebElement emailId;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitBtn;

    @FindBy(xpath = "(//div[contains(@class,'radio-primary')])[1]")
    WebElement company;

    @FindBy(xpath = "//*[@id='btnSelectOrganization']")
    WebElement selectAccount;

    Logger log = BaseLib.getLog(this.getClass().getName());

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void userLoginToApplication(){
        emailId.sendKeys(FileReaderClass.readData("lowerEnvUserName"));
        password.sendKeys(FileReaderClass.readData("lowerEnvPassword"));
        submitBtn.click();
        company.click();
        selectAccount.click();
        log.info("User successfully logged in");
    }
}
