package Classes;

import org.openqa.selenium.Keys;


import static Classes.Drivers.driver;
import static Classes.WebElements.ytElement;

public class Methods{
    public static void goToURL(String url){
        driver.navigate().to(url);
    }
    public static void YouTubeSearch(String url) throws InterruptedException {
        goToURL(url);
        Thread.sleep(3000);
        ytElement.click();
        Thread.sleep(3000);
        ytElement.sendKeys("Java Selenium");
        ytElement.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        ytElement.click();
        ytElement.clear();
        driver.close();
    }
    /*static void TwitterSearch(String url) throws InterruptedException {
        goToURL(url);
        Thread.sleep(3000);
        twElement.click();
        twElement.sendKeys("Java Selenium");
        twElement.sendKeys(Keys.ENTER);
    }*/
}
