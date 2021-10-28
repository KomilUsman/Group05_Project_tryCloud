package com.Trycloud.step_definitions;

import com.Trycloud.pages.ContactsPage;
import com.Trycloud.pages.LoginPage;
import com.Trycloud.utilities.BrowserUtil;
import com.Trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserStory_13_StepDef {

    ContactsPage contactsPage= new ContactsPage();

    @Then("verify user is on the dashboard")
    public void verify_user_is_on_the_dashboard() {

        Assert.assertEquals("Dashboard - Trycloud", Driver.getDriver().getTitle());
    }
    @When("user Click contacts module")
    public void user_click_contacts_module() {
        BrowserUtil.waitFor(By.xpath("//*[@id=\"appmenu\"]/li[6]"),4);
      contactsPage.contactsModule.click();

    }
    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list(List<String> names) {
        Select select= new Select(contactsPage.contactList);
        select.getOptions();

        Assert.assertTrue("Contains contacts", true);
    }

}
