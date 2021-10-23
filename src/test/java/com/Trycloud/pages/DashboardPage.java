package com.Trycloud.pages;

import com.Trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
