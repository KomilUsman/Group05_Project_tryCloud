package com.Trycloud.step_definitions;

import com.Trycloud.pages.FilesPage;
import com.Trycloud.utilities.BrowserUtil;
import com.Trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import sun.plugin.services.BrowserService;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;


public class Userstory_10 {

    FilesPage filesPage = new FilesPage();

    @Then("verify user can click any button")
    public void verifyUserCanClickAnyButton() {

        filesPage.settingsBtn.click();
        BrowserUtil.waitFor(2);

        filesPage.showRichByCss.click();

    }


    @When("user check the current storage")
    public void userCheckTheCurrentStorage() {
        System.out.println("filesPage.storageBeforeUpload.getText() = " + filesPage.storageBeforeUpload.getText());
    }

    @And("user upload file")
    public void userUploadFile() {
        filesPage.plusIconBtn.click();

        BrowserUtil.waitFor(2);
        filesPage.uploadFile.click();

        String path = "/Users/altanochir./Desktop/Screen Shot 2021-11-03 at 6.08.43 PM.png";
        filesPage.uploadFile.sendKeys(path);
        BrowserUtil.waitFor(3);

    }

    @And("refresh the page")
    public void refreshThePage() {
        Driver.getDriver().navigate().refresh();
    }

    @Then("verify the storage usage is increased")
    public void verifyTheStorageUsageIsIncreased() {

        System.out.println("filesPage.storageAfterUpload.getText() = " + filesPage.storageBeforeUpload.getText());

    }
}
