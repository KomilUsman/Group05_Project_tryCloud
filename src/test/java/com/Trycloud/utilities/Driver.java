package com.Trycloud.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.Objects;

public class Driver {
    private static WebDriver obj;

    private Driver() {
    }

    public static WebDriver getDriver() {

        String browserName = com.Trycloud.utilities.ConfigurationReader.read("browser");
        if (Objects.nonNull(System.getProperty("BROWSER"))) {
            browserName = System.getProperty("BROWSER");
            System.out.println("browser type was adjusted");
        }
        if (obj == null) {

            switch (browserName.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    obj = new ChromeDriver();
                    obj.manage().window().maximize();
                    break;

                case "remote-chrome":

                    try {
                        String gridAddress = "35.168.130.26";
                        URL url = new URL("http://" + gridAddress + ":8081/wd/hub");
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("chrome");
                        obj = new RemoteWebDriver(url, desiredCapabilities);
                    } catch (Exception e) {
                        e.printStackTrace();
                        throw new RuntimeException("Failed to create remote session");
                    }
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    obj = new FirefoxDriver();
                    break;

                default:
                    obj = null;
                    System.out.println("Unknown Browser Type! " + browserName);
            }
            return obj;

        } else {
//            System.out.println("You have it just use existing one");
            return obj;

        }

    }

    public static void closeBrowser() {

        if (obj != null) {
            obj.quit();
            obj = null;
        }
    }

}
