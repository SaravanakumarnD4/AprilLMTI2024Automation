import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paragon {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.paragonsports.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='relative']")).click();
    }
}
