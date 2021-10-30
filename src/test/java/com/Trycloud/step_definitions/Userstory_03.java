package com.Trycloud.step_definitions;

import com.Trycloud.pages.FilesPage;
import com.Trycloud.pages.LoginPage;
import com.Trycloud.utilities.BrowserUtil;
import com.Trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Userstory_03 {

    LoginPage loginPage = new LoginPage();

    // AC:1
    @When("user enters with valid credentials {string} and {string}")
    public void user_enters_with_valid_credentials_and(String username, String password) {
        loginPage.login(username, password);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {

        new FilesPage().filesModule.click();

        assertEquals("Files - Trycloud", Driver.getDriver().getTitle());
    }

    // AC:2
    @When("user clicks the top left checkbox of the table")
    public void userClicksTheTopLeftCheckboxOfTheTable() {

        new FilesPage().filesModule.click();
        new FilesPage().topLeftCheckBox.click();

        BrowserUtil.waitFor(2);
    }

    @Then("verify all files are selected")
    public void verifyAllFilesAreSelected() {


       assertTrue(new FilesPage().firstCheckBox.isSelected());
       assertTrue( new FilesPage().secondCheckBox.isSelected() );

    }


}
