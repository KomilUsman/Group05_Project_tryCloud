package com.Trycloud.step_definitions;

import com.Trycloud.pages.DashboardPage;
import com.Trycloud.pages.FilesPage;
import com.Trycloud.utilities.BrowserUtil;
import com.Trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Userstory_05 {
    FilesPage filesPage = new FilesPage();

    @Then("user clicks Remove from Favorites")
    public void user_clicks_remove_from_favorites() throws InterruptedException {
        Thread.sleep(2000);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(filesPage.favoritesfolder).contextClick().perform();
        Thread.sleep(2000);
        filesPage.removeFavorite.click();
        Thread.sleep(2000);

    }

    @Then("user verifies  that the file is removed from Favorites sub-module’s table")
    public void user_verifies_that_the_file_is_removed_from_favorites_sub_module_s_table() throws InterruptedException {

        filesPage.favoriteModule.click();
        Thread.sleep(2000);
        Assert.assertEquals(filesPage.verifyFavoriteRemoved.getText(), "No favorites yet");


    }



        /*
         @Then("user go to files page")
    public void userGoToFilesPage() {

        filesPage.filesModule.click();
    }


    @Then("user clicks Remove from Favorites")
    public void userclicksRemovefromFavorites() {

         */
}


