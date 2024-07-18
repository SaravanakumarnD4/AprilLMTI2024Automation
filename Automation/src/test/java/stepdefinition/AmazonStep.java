package stepdefinition;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import reusablecode.LaunchBrowser;
import reusablecode.ReadExcel;

import java.io.IOException;

public class AmazonStep extends LaunchBrowser {

    WebElement iFrame;
    WebElement currecyDrop;

    @Given("User login to the Amazon home page")
    public void AmazonHomePage() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }

    @When("User enter the {string} in the search box")
    public void SearchBox(String name) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(name);
    }

    @And("User clicks on the Search icon")
    public void ClickSearchIcon() {
        driver.findElement(By.id("nav-search-submit-button")).click();

    }

    @Then("User validates the search result with the page title")
    public void TitleValidation() {

        String expResult = "Amazon.in : iPhone";
        String title = driver.getTitle();
        System.out.println(title);

        Assert.assertEquals(expResult, title);

        /*if (title.equals(expResult)) {
            System.out.println("Title is equal");
        } else {
            System.out.println("Title is not equal");
        }*/

    }

    @Given("User navigate to the LearnMore login page")
    public void learnMoreLogin() {
        driver = new ChromeDriver();
        driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
    }

    @When("User enter the username {string} and password {string}")
    public void enterCredential(String Username, String Password) throws IOException {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(ReadExcel.readExcel("Login", 0, 0));
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ReadExcel.readExcel("Login", 1, 0));
    }

    @And("User clicks the Login button")
    public void clickLogin() {
        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }

    @Then("User validates the Login error message")
    public void errorValidation() {
        String expResult = "Invalid Credentials.Please Check Once";
        String actualResult = driver.findElement(By.id("errorMessage")).getText();

        if (actualResult.equals(expResult)) {
            System.out.println(actualResult);
        } else {
            System.out.println("Error Validation failed");
        }
    }

    @When("user hower the mouse on the login")
    public void mouseHower() {

        WebElement b = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a = new Actions(driver);
        a.clickAndHold(b).build().perform();

    }

    @And("user clicks on the category dropdown")
    public void selectDropdown() {

        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select s = new Select(dropdown);
        s.selectByValue("search-alias=fashion");

    }

    @Given("User navigate to the Spicejet home page")
    public void spiceJetHome() {
        driver = new ChromeDriver();
        driver.get("https://book.spicejet.com/");
        driver.manage().window().maximize();
    }

    @When("User clicks on the Currency dropdown")
    public void SelectDropDown() {

        currecyDrop = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        Select currency = new Select(currecyDrop);
        currency.selectByValue("INR");

    }

    @And("User extracts the dropdown values from the currency")
    public void extractDrop() {

        int b = currecyDrop.findElements(By.tagName("option")).size();

        for (int i = 0; i < b; i++) {
            String a = currecyDrop.findElements(By.tagName("option")).get(i).getText();
            System.out.println(a);
        }
    }

    @Given("User navigate to the jquery page")
    public void jquryHome() {

        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
    }


    @When("User performs the drag and drop")
    public void dragAndDrop() {

        iFrame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(iFrame);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions a = new Actions(driver);
        a.dragAndDrop(source, target).build().perform();
    }

    @Given("User extract the table column values")
    public void columnValue() {

        int size = driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::th")).size();

        for (int i = 0; i < size; i++) {

            String colValue = driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::th")).get(i).getText();
            System.out.println(colValue);
        }
    }

}
