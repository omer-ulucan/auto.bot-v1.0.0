package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Classes.Drivers.driver;

public class WebElements {
    public static WebElement ytElement = driver.findElement(By.cssSelector("//input[@autocapitalize=\"none\"]"));//youtube search bar
    //public static WebElement twElement = driver.findElement(By.className("r-30o5oe"));//twitter search bar
    //public static WebElement twNotiBar = driver.findElement(By.xpath("(//div[@class='css-901oao r-1awozwy r-18jsvk2 r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[2]"));//twitter close notification bar
    //public static WebElement ytVideo = driver.findElement(By.linkText("49:24"));
    //public static WebElement ytStop = driver.findElement(By.tagName("video"));
}