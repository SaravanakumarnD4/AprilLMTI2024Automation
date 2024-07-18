package reusablecode;

import io.cucumber.java.it.Ed;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LaunchBrowser {

    public static WebDriver driver;

    public static void launchUrl() throws IOException {

        File file = new File("src/main/resources/configuration/frameworkconfig.properties");
        FileInputStream fis = new FileInputStream(file);
        Properties p = new Properties();
        p.load(fis);

        if(p.getProperty("browser").equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        else if (p.getProperty("browser").equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else if (p.getProperty("browser").equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }
        else{
            throw new InvalidArgumentException("Enter valid browser name") ;
        }

        //driver = new ChromeDriver();
        //driver.get("https://jqueryui.com/droppable/");
        driver.get(p.getProperty("url"));
    }
}
