package com.Trycloud.utilities;

import org.openqa.selenium.By;
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

    public static List<String> getElementsText(List<WebElement> list){
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getAttribute("innerHTML").trim());
        }
        return elemTexts;
    }



    public static List<String> getAllText(List<WebElement> listOfWebElements){

        List<String> allTextList=new ArrayList<>();

        for(WebElement eachElement: listOfWebElements){
            allTextList.add(eachElement.getText());
        }

        return allTextList;
    }


}
