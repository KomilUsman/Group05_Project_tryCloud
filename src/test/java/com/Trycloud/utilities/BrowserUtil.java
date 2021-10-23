package com.Trycloud.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtil {

    public static void waitFor(int seconds){

        try {
            Thread.sleep(seconds* 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getAllText(List<WebElement> listOfWebElements){

        List<String> allTextList=new ArrayList<>();

        for(WebElement eachElement: listOfWebElements){
            allTextList.add(eachElement.getText());
        }

        return allTextList;
    }
}
