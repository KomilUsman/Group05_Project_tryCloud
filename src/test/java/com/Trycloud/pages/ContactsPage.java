package com.Trycloud.pages;

import com.Trycloud.utilities.BrowserUtil;
import com.Trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsPage {
    public ContactsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "#contacts-list")
    public WebElement contactsList;

    @FindBy(xpath = "//*[@id='appmenu']/li[6]")
    public WebElement contactsModule;

    @FindBy(xpath = "//*[@id=\"everyone\"]/div/div[1]")
    public WebElement allContactsCount;

    public boolean checkContactsNum() {

        try {
            BrowserUtil.waitFor(4);
            if (this.allContactsCount.getText().contains("5")) {
                System.out.println("5 contacts verified");
                return true;
            } else {
                System.out.println("There were " + allContactsCount.getText() + " contacts");
                return false;
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("there are no contacts");
            return false;
        }


    }
}