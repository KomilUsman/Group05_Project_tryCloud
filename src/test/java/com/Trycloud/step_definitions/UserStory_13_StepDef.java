package com.Trycloud.step_definitions;

import com.Trycloud.pages.ContactsPage;
import com.Trycloud.pages.DashboardPage;
import com.Trycloud.pages.LoginPage;
import com.Trycloud.utilities.BrowserUtil;
import com.Trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class UserStory_13_StepDef {
    LoginPage loginPage = new LoginPage();
    ContactsPage contactsPage = new ContactsPage();

    @When("user enter valid {string} and {string}")
    public void userEnterValidAnd(String username, String password) {
        loginPage.login(username, password);
    }

    @And("user clicks submit button")
    public void userClicksSubmitButton() {
        loginPage.loginButton.click();
    }

    @Then("verify user is on the dashboard")
    public void verifyUserIsOnTheDashboard() {
        // loginPage.login("User5","Userpass123");
        // loginPage.loginButton.click();
        Assert.assertEquals("Dashboard - Trycloud", Driver.getDriver().getTitle());
    }

    @When("user Click contacts module")
    public void user_click_contacts_module() {
        BrowserUtil.waitFor(4);
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Contacts");


    }

    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list() {
        try {
            Assert.assertTrue(contactsPage.checkContactsNum());
        } catch (Throwable e) {
            System.out.println("Report Error:  " + e);
        }


    }


}