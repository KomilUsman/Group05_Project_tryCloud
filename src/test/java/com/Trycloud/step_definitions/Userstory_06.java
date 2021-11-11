package com.Trycloud.step_definitions;

import com.Trycloud.pages.FilesPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

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
        filesPage.newFolderName.sendKeys("NEW FOLDER2");
    }

    @Then("user clicks “Submit“ icon")
    public void userClicksSubmitIcon() {
        filesPage.submitFolder.submit();
    }

    @Then("the folder is displayed on the page")
    public void theFolderIsDisplayedOnThePage() {
        System.out.println(filesPage.folderTable.findElement(By.partialLinkText("NEW FOLDER2")).getText());
    Assert.assertEquals("NEW FOLDER2", filesPage.folderTable.findElement(By.partialLinkText("NEW FOLDER2")).getText());
    }
}