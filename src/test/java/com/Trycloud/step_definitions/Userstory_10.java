package com.Trycloud.step_definitions;

import com.Trycloud.pages.FilesPage;
import com.Trycloud.utilities.BrowserUtil;
import com.Trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



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
    public void userUploadFile() throws InterruptedException {
        filesPage.plusIconBtn.click();
        BrowserUtil.waitFor(5);


        String path = "C:\\Users\\MSI\\Desktop\\group05_project_tryCloud\\src\\test\\java\\com\\Trycloud\\ExtraFiles\\Screen Shot 2021-11-09 at 8.02.45 PM.png";
        filesPage.uploadFile1.sendKeys(path);
        BrowserUtil.waitFor(5);



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
