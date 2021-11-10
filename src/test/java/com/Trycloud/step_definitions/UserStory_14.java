package com.Trycloud.step_definitions;


import com.Trycloud.pages.Magnifier_Icon;

import com.Trycloud.utilities.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;

public class UserStory_14 {

    ArrayList<String> ar = new ArrayList<>();
    Magnifier_Icon magnifier_icon = new Magnifier_Icon();
    String file = "cucumber.jpg", folder = "NEW FOLDER2", user = "User11";

    @When("User click magnifier icon on the right top")
    public void click_magnifier_icon_on_the_right_top() {
        magnifier_icon.SearchBtn.click();

    }

    @Then("Search any existing file,folder,user name")
    public void search_any_existing_file_folder_user_name() throws InterruptedException {

        for (int i = 0; i <= 2; i++) {
            if (i == 0) {
                magnifier_icon.searchBox.sendKeys(file);
                Thread.sleep(2000);

            } else if (i == 1) {
                magnifier_icon.searchBox.sendKeys(folder);
                Thread.sleep(2000);

            } else {
                magnifier_icon.searchBox.sendKeys(user);
                Thread.sleep(2000);

            }
            ar.add(magnifier_icon.searchResult.get(0).getText());
            magnifier_icon.resetBtn.click();
        }
    }

    @Then("And Verify the app displays the expected result option")
    public void andVerifyTheAppDisplaysTheExpectedResultOption() {
        Assert.assertEquals(file, ar.get(0));
        Assert.assertEquals(folder, ar.get(1));
        Assert.assertEquals(user, ar.get(2));

        for (int i = 0; i < ar.size(); i++) {
            if (i == 0) {
                System.out.println("-------------------------------");
                System.out.println("ExpectedResult " + file);
                System.out.println("ActualResult " + ar.get(i));
                System.out.println("-------------------------------");
            } else if (i == 1) {
                System.out.println("ExpectedResult " + folder);
                System.out.println("ActualResult " + ar.get(i));
                System.out.println("-------------------------------");
            } else if (i == 2) {
                System.out.println("ExpectedResult " + user);
                System.out.println("ActualResult " + ar.get(i));
                System.out.println("-------------------------------");
                Driver.closeBrowser();
            }

        }

    }

    public void closing() {
        Driver.closeBrowser();
    }

}



