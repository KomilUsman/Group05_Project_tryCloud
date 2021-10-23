package com.Trycloud.step_definitions;

import com.Trycloud.pages.DashboardPage;
import com.Trycloud.pages.LoginPage;
import com.Trycloud.utilities.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Userstory_02 {

    LoginPage loginPage = new LoginPage();

    @When("user enter with valid credentials")
    public void user_enter_with_valid_credentials() {

       loginPage.login("user5");
    }

    @When("user enter with valid credentials {string} and {string}")
    public void userEnterWithValidCredentialsAnd(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("Verify user see the following modules")
    public void verify_user_see_the_following_modules(List<String> expectedResult) {

        List<String> actualModules = BrowserUtil.getAllText(new DashboardPage().allModules);

        Assert.assertEquals(expectedResult, actualModules);

    }

}
