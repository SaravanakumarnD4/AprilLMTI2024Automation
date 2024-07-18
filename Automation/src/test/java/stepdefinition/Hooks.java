package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import reusablecode.LaunchBrowser;

import java.io.IOException;

public class Hooks extends LaunchBrowser{

    @Before()
    public void m1() throws IOException {
//        LaunchBrowser l = new LaunchBrowser();
//        l.launchUrl();
        LaunchBrowser.launchUrl();
    }

    @After()
    public void m2(){

    }

    @BeforeStep()
    public void screenShot1(Scenario sc){

        byte [] byteData = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        sc.attach(byteData,"image/png", sc.getName());

    }
}
