package com.Trycloud.pages;

import com.Trycloud.utilities.BrowserUtil;
import com.Trycloud.utilities.Driver;
import com.github.javafaker.Faker;
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

    @FindBy(xpath = "//*[@id=\"new-contact-button\"]")
    public WebElement newContactButton;

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

    public static class newContactInfo {


        @FindBy(xpath = "//div[@class='vue-recycle-scroller__item-view']")
        private WebElement companyName;

        @FindBy(id = "new-contact-button")
        private WebElement newContactButton;

        @FindBy(id = "contact-title")
        private WebElement title;

        @FindBy(xpath = "//input[@inputmode='tel']")
        private WebElement phone;

        @FindBy(xpath = "//input[@inputmode='email']")
        private WebElement email;

        @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[3]/div/div[2]/input")
        private WebElement postBox;

        @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[3]/div/div[3]/input")
        private WebElement address;

        @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[3]/div/div[5]/input")
        private WebElement postCode;

        @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[3]/div/div[6]/input")
        private WebElement city;

        @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[3]/div/div[7]/input")
        private WebElement state;

        @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[3]/div/div[8]/input")
        private WebElement country;


        public void contactInfo() {

            Faker faker = new Faker();

            companyName.sendKeys("Yurova LLC");

            BrowserUtil.waitFor(1);
            title.sendKeys(faker.company().name());
            BrowserUtil.waitFor(1);
            phone.sendKeys(faker.phoneNumber().cellPhone());
            BrowserUtil.waitFor(1);
            email.sendKeys("yurova@gmail.com");
            BrowserUtil.waitFor(1);
            postBox.sendKeys(faker.address().zipCode());
            BrowserUtil.waitFor(1);
            postCode.sendKeys(faker.address().zipCode());
            BrowserUtil.waitFor(1);
            address.sendKeys(faker.address().streetAddress());
            BrowserUtil.waitFor(1);
            postCode.sendKeys(faker.address().zipCode());
            BrowserUtil.waitFor(1);
            city.sendKeys(faker.address().city());
            BrowserUtil.waitFor(1);
            state.sendKeys(faker.address().state());
            BrowserUtil.waitFor(1);
            country.sendKeys(faker.country().name());
            BrowserUtil.waitFor(1);


        }
    }

}