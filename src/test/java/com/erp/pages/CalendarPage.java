package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CalendarPage {

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='fc-slats']//tbody//tr//span")
    public List<WebElement> actualTime;

    public List<String> convertMethod(List<WebElement>listOfWebElements){
        ArrayList<String>actualTimeString = new ArrayList<>();
        for (WebElement eachWebElement : actualTime){
            actualTimeString.add(eachWebElement.getText());
        }
        return actualTimeString;
    }





}
