package stepDef;

import base.BaseLib;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.Logger;
import pageObjects.HomePage;
import utilities.Context;

public class HomePageStep {

    Logger log = BaseLib.getLog(this.getClass().getName());
    Context context;
    HomePage homePage;

    public HomePageStep(Context context){
        this.context = context;
        homePage = context.getHomePage();
    }

    @When("user clicks on sandy setup")
    public void userclicksonsandysetup(){
        homePage.navigateToSandySetup();
    }
}
