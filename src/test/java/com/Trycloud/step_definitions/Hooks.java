package com.Trycloud.step_definitions;

import com.Trycloud.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setupDriver(){
        System.out.println("This is from @Before inside hook class");
        com.Trycloud.utilities.Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void teardown(Scenario scenario){

        if(scenario.isFailed() ){

            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", "This is what is it");

        }

        System.out.println("This is from @After inside hook class");
        com.Trycloud.utilities.Driver.closeBrowser();

    }

}
