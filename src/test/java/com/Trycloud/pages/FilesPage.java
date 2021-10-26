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

    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
