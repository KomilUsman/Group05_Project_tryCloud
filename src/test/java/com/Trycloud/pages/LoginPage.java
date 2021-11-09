package com.Trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.security.auth.login.Configuration;
import com.Trycloud.utilities.ConfigurationReader;
import com.Trycloud.utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    private WebElement usernameBox;

    @FindBy(id = "password")
    private WebElement passwordBox;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement warningMessage;


    public void goTo(){
        Driver.getDriver().get(ConfigurationReader.read("url"));
    }

    public void login (String userNum){

        usernameBox.sendKeys(ConfigurationReader.read(userNum ));
        passwordBox.sendKeys(ConfigurationReader.read(userNum ));
        loginButton.click();

    }
    //Komil created login page
    public void loginNew(){
        usernameBox.sendKeys(ConfigurationReader.read("user5_username" ));
        passwordBox.sendKeys(ConfigurationReader.read("user5_password" ));
        loginButton.click();
    }

    public void login (String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);

    }

}
