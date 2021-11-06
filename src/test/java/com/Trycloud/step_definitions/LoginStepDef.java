package com.Trycloud.step_definitions;

import com.Trycloud.pages.LoginPage;
import com.Trycloud.utilities.ConfigurationReader;
import com.Trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page(){
        Driver.getDriver().get(ConfigurationReader.read("url"));
    }

    @When("user enters login {string} and {string}")
    public void user_enters_login(String username,String password) throws InterruptedException {
        loginPage.login(username,password);
        Thread.sleep(2000);
    }


    @When("user clicks login button")
    public void user_clicks_login_button(){
        loginPage.loginButton.click();
    }

    @Then("user arrives on dashboard page")
    public void user_arrives_on_dashboard_page(){
        Assert.assertEquals("Dashboard - Trycloud", Driver.getDriver().getTitle());
    }

    @Then("user gets error message")
    public void userGetsErrorMessage() {
        Assert.assertEquals("Wrong username or password.",loginPage.warningMessage.getText());
    }
}


