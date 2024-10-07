package stepDef;

import base.BaseLib;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.Logger;
import pageObjects.LoginPage;
import utilities.Context;

public class LoginPageStep {

    Logger log = BaseLib.getLog(this.getClass().getName());
    Context context;
    LoginPage loginPage;

    public LoginPageStep(Context context){
        this.context = context;
        loginPage = context.getLoginPage();
    }

        @Given("User logins to the application")
        public void userLoginsToTheApplication() {
        context.openUrl();
        loginPage.userLoginToApplication();



        }

}
