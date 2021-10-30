package com.Trycloud.step_definitions;

import com.Trycloud.pages.DashboardPage;
import com.Trycloud.pages.FilesPage;
import com.Trycloud.utilities.BrowserUtil;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;

public class Userstory_07 {

    @Then("user go to files page")
    public void userGoToFilesPage() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Files");
    }

    @Then("user clicks delete files option")
    public void userClicksDeleteFilesOption() {
        FilesPage filesPage = new FilesPage();
        BrowserUtil.waitFor(2);
        filesPage.deletedFiles.click();
    }

    @Then("user verifies deleted file is displayed on the page")
    public void userVerifiesDeletedFileIsDisplayedOnThePage() {
        FilesPage filesPage = new FilesPage();

        //ArrayList<WebElement> deletedFileArray = new ArrayList<>();
        //deletedFileArray.addAll(Arrays.asList(filesPage.deletedFileList));
        //System.out.println("filesPage.verificationDeletedFileList.size() = " + filesPage.verificationDeletedFiles.size());

        Assert.assertNotEquals(filesPage.deletedFileNames.size(),0);
        //try {
        //    Assert.assertFalse(filesPage.noDeletedFiles.isDisplayed());
        //}
        //catch(NoSuchElementException    e){
        //    System.out.println("some files available.");
        //}
    }
}
