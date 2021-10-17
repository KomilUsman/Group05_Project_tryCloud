package java.com.Trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.com.Trycloud.utilities.Driver;

public class LogoutPage {

    public LogoutPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='expand']")
    private WebElement logoutMenu;

    @FindBy(id = "logout")
    private WebElement logoutButton;

    public void logout(){
    logoutMenu.click();
    logoutButton.click();
    }

}
