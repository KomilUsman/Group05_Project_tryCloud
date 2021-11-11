package com.Trycloud.step_definitions;

import com.Trycloud.pages.ContactsPage;
import com.Trycloud.pages.LoginPage;
import com.Trycloud.utilities.BrowserUtil;
import com.Trycloud.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
//AC 1
public class Userstory_12 {
    LoginPage loginPage = new LoginPage();
    ContactsPage contactsPage = new ContactsPage();
    @Given("user provides valid {string} and {string}")
    public void user_provides_valid_and(String username, String password) {
        loginPage.login(username, password);
        loginPage.loginButton.click();

    }
    @When("user clicks on Contacts module")
    public void user_clicks_on_contacts_module() {
        contactsPage.contactsModule.click();

    }
    @Then("user verifies the page title is Contents module's title")
    public void user_verifies_the_page_title_is_contents_module_s_title() {
        Assert.assertEquals("Contacts - Trycloud", Driver.getDriver().getTitle());
    }
    //AC2

    @When("user clicks on New Contact button")
    public void user_clicks_on_new_contact_button() {
        new ContactsPage().contactsModule.click();
        new ContactsPage().newContactButton.click();

        BrowserUtil.waitFor(2);


    }
    @When("user fills out the contact info like: Title, Phone, email, address, etc")
    public void user_fills_out_the_contact_info_like_title_phone_email_address_etc() {
        new ContactsPage.newContactInfo();


    }
    @Then("user verifies the contact name is added to the contact list")
    public void user_verifies_the_contact_name_is_added_to_the_contact_list() {

    }




}
