package com.Trycloud.pages;

import com.Trycloud.utilities.BrowserUtil;
import com.Trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TalkPage {
    public TalkPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(css = ".app-navigation-search__input")
    public WebElement searchBox;


    @FindBy(xpath = "//div[@class='acli__content']")
    public List<WebElement> allUser;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div[3]/div/form/div[3]/div/div")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div[3]/div/form/button")
    public WebElement submitBtn;

@FindBy()
    public WebElement verifyTheMsg;
}