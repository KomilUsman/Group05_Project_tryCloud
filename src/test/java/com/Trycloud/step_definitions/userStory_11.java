package com.Trycloud.step_definitions;

import com.Trycloud.pages.DashboardPage;
import com.Trycloud.pages.LoginPage;
import com.Trycloud.pages.TalkPage;
import com.Trycloud.utilities.BrowserUtil;
import com.Trycloud.utilities.ConfigurationReader;
import com.Trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class userStory_11 {

    TalkPage talkPage = new TalkPage();
    String expectedMsg = "Test with Altanochir";


    @Given("user arrives on dashboard pages")
    public void user_arrives_on_dashboard_pages() {
        Driver.getDriver().get(ConfigurationReader.read("url"));
        new LoginPage().loginNew();
    }


    @When("user clicks {string} module")
    public void user_clicks_talk_module(String moduleName) {
        new DashboardPage().navigateToModule(moduleName);
    }


    @Then("Verify the page tile is {string}")
    public void verify_the_page_tile_is_talks_module_s_tile(String expectedTitle) throws InterruptedException {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        Thread.sleep(2300);
    }


    @When("Search a user from search box on the left")
    public void search_a_user_from_search_box_on_the_left() throws InterruptedException {

        talkPage.searchBox.sendKeys("User11");
        talkPage.allUser.get(0).click();
        Thread.sleep(1200);

    }

    @When("Write a message")
    public void write_a_message() throws InterruptedException {
        talkPage.messageBox.sendKeys(expectedMsg);
        Thread.sleep(1200);

    }

    @When("Click submit button")
    public void click_submit_button() throws InterruptedException {
        talkPage.submitBtn.click();
        Thread.sleep(1200);

    }

    @Then("Verify the message is displayed on the conversation log")
    public void verify_the_message_is_displayed_on_the_conversation_log() throws InterruptedException {
        // == 15
        String actualMsg = talkPage.allMessages.get(talkPage.allMessages.size() - 1).getText();

        System.out.println("actualMsg = " + actualMsg);
        System.out.println("expectedMsg = " + expectedMsg);

        Assert.assertEquals(expectedMsg, actualMsg);
        Thread.sleep(1200);

    }


}
