package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.FileReaderClass;

import java.io.FileReader;
import java.util.concurrent.TimeUnit;

public class BaseLib {

    public WebDriver driver;

    public static Logger log;

    public static Logger getLog(String className){
        return LogManager.getLogger(className);
    }

    public void setUp(String browser){

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            if(driver==null){
                driver = new ChromeDriver();
            }
            getLog(this.getClass().getName()).info("Browser Launched..");
            //openUrl();
            getLog(this.getClass().getName()).info("URL opened");

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
            if(driver==null){
                driver = new FirefoxDriver();
            }
            getLog(this.getClass().getName()).info("Browser Launched..");
            //openUrl();
            getLog(this.getClass().getName()).info("URL opened");
        }


    }

    public void openUrl(){
        driver.get(FileReaderClass.readData("lowerENV"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


}
