package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMore {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.manage().window().maximize();

    }
}
