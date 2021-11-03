package com.Trycloud.step_definitions;

import com.Trycloud.pages.ContactsPage;
import com.Trycloud.pages.LoginPage;
import com.Trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
//AC 1
public class Userstory_12 {
    LoginPage loginPage = new LoginPage();
    ContactsPage contactModule = new ContactsPage();

    @Given("user provides valid {string} and {string}")
    public void user_provides_valid_and(String username, String password) {
        loginPage.login(username, password);
        loginPage.loginButton.click();
    }

    @When("user clicks on Contacts module")
    public void user_clicks_on_contacts_module() {
        contactModule.contactsModule.click();
    }

    @Then("user verifies the page title is Contents module's title")
    public void user_verifies_the_page_title_is_contents_module_s_title(String expectedTitle) {

        new ContactsPage().contactsModule.click();

        assertEquals("Contacts", Driver.getDriver().getTitle());

    }
}
