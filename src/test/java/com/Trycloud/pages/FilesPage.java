package com.Trycloud.pages;

import com.Trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {


    @FindBy(xpath = "//ul[@id='appmenu']/li[2]")
    public WebElement filesModule;

    @FindBy(xpath = "//a[@class='name']")
    public List<WebElement> twoFiles;

    @FindBy(xpath = "//th[@id='headerSelection' and @class='column-selection']")
    public WebElement topLeftCheckBox;

    @FindBy(xpath = "//label[@for='select-files-1111']")
    public WebElement firstCheckBox;

    @FindBy(xpath = "//label[@for='select-files-8993']")
    public WebElement secondCheckBox;

    @FindBy(xpath = "//li/a[.='Deleted files']")
    public WebElement deletedFiles;

    @FindBy(xpath = "(//tbody[@id='fileList'])[12]//tr//span[@class='nametext extra-data']/span[@class='innernametext']")
    public List<WebElement> deletedFileNames;

    @FindBy(xpath = "//*[@id=\"app-settings-header\"]/button")
    public WebElement settingsBtn;

    @FindBy(css = "#files-setting-richworkspace")
    public WebElement showRichByCss;

    @FindBy(css = "#quota")
    public WebElement storageBeforeUpload;

    @FindBy(css = ".button.new")
    public WebElement plusIconBtn;

    @FindBy(css = "label.menuitem > span:nth-child(2)")
    public WebElement uploadFile;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a")
    public WebElement favoritesfolder;


    @FindBy(xpath = "//*[@id=\"rightClickMenu\"]/ul/li[1]/a/span[2]")
    public WebElement removeFavorite;

    @FindBy(css = "#app-navigation > ul > li.nav-favorites.ui-droppable.collapsible > a")
    public WebElement favoriteModule;

    @FindBy(xpath = "//div/h2[.='No favorites yet']")
    public WebElement verifyFavoriteRemoved;


    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
