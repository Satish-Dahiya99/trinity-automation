package stepDef;

import base.BaseLib;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.Logger;
import utilities.Context;

public class Hooks {

    Context context;
    Logger log = BaseLib.getLog(this.getClass().getName());

    public Hooks(Context context){
        this.context = context;
    }

    @Before
    public void beforeTestStart(){
        log.info("******* Tests started successfully *******");
    }

    @After
    public void afterTestCompletes(){
        //context.getDriver().quit();
        log.info("******* Test Ends ******");
    }
}
