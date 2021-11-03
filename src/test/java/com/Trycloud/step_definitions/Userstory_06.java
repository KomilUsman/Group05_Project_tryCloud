package com.Trycloud.step_definitions;

import com.Trycloud.pages.FilesPage;
import io.cucumber.java.en.Then;

public class Userstory_06 {

    FilesPage filesPage=new FilesPage();

    @Then("user clicks the “+” icon on top")
    public void userClicksTheIconOnTop() {
        filesPage.plusIconBtn.click();
    }

    @Then("user clicks “New Folder”")
    public void userClicksNewFolder() {
        filesPage.newFolder.click();
    }

    @Then("user creates a folder name")
    public void userCreatesAFolderName() {
        filesPage.newFolderName.sendKeys("NEW FOLDER");
    }

    @Then("user clicks “Submit“ icon")
    public void userClicksSubmitIcon() {
        filesPage.submitFolder.click();
    }

    @Then("the folder is displayed on the page")
    public void theFolderIsDisplayedOnThePage() {

    }
}