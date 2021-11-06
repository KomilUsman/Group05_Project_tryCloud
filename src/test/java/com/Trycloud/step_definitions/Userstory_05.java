package com.Trycloud.step_definitions;
import com.Trycloud.pages.DashboardPage;
import com.Trycloud.pages.FilesPage;
import com.Trycloud.utilities.BrowserUtil;
import com.Trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Userstory_05 {
    FilesPage filesPage = new FilesPage();

    @Then("user go to files page")
    public void userGoToFilesPage() {

        filesPage.filesModule.click();
        }



    @Then("user clicks Remove from Favorites")
    public void userclicksRemovefromFavorites(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(filesPage.favoritesfolder).contextClick().perform();





    }
    @Then("user verifies  that the file is removed from Favorites sub-module’s table")
    public  void userverifiesthatthefileisremovedfromFavoritessubmodulestable(){



    }

}
