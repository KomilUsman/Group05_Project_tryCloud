package java.com.Trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.security.auth.login.Configuration;
import java.com.Trycloud.utilities.ConfigurationReader;
import java.com.Trycloud.utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "submit-form")
    private WebElement loginButton;

    public void goTo(){
        Driver.getDriver().get(ConfigurationReader.read("login_url"));
    }

    public void login (String userNum){

        username.sendKeys(ConfigurationReader.read(userNum + "_username"));
        password.sendKeys(ConfigurationReader.read(userNum + "_password"));
        loginButton.click();

    }
}
