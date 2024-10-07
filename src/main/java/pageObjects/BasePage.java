package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class BasePage {

    WebDriver driver;
    String dynamicText = "dynamic_text";

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement prepareWebElementWithDynamicXpath (String xpathValue, String substitutionValue ) {

        return driver.findElement(By.xpath(xpathValue.replace(dynamicText, substitutionValue)));
    }

    public void scrollToElement(WebElement element){
        new Actions(driver).scrollToElement(element).perform();
    }

    public void scrollByGivenAmount(WebElement element){
        int deltaY = element.getRect().y;
        new Actions(driver).scrollByAmount(0 , deltaY).perform();

    }

    public void scrollFromElementFromGivenAmount(WebElement element){
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(element);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 200)
                .perform();
    }

    public void javaScriptExecutorClick(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);

    }

    public void javaScriptToEnterText(WebElement element, String value){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0]. value='"+value+"';", element);

    }

    public String setPastDate(String days){
        int date = Integer.parseInt(days);
        LocalDate today = LocalDate.now();
        LocalDate past = today.minusDays(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return past.format(formatter);


    }
}
