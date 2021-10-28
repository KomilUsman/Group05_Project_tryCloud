package com.Trycloud.pages;

import com.Trycloud.utilities.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactsPage {
    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[6]")
    public WebElement contactsModule;

  @FindBy (xpath = "//*[@id=\"contacts-list\"]/div[1]")
    public WebElement contactList;



}