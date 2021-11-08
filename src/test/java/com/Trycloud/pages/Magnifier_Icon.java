package com.Trycloud.pages;

import com.Trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Magnifier_Icon {

    public Magnifier_Icon() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div[1]/a")
    public WebElement SearchBtn;

    @FindBy(xpath = "//*[@id=\"header-menu-unified-search\"]/div[2]/div[1]/form/input")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"header-menu-unified-search\"]/div[2]/div/form/input[2]")
    public WebElement resetBtn;

    @FindBy(xpath = "//*[@id=\"header-menu-unified-search\"]/div[2]/ul/li[1]/a/span")
    public List<WebElement> searchResult;


}

