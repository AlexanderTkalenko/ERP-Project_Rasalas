package com.erp.pages;


import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> modulesList;

    //Created custom xpath locator to be able to click each of 19 modules. Nazar Kravets
    public static void clickOnEachModule(String module){
        Driver.getDriver().findElement(By.xpath
                ("//span[@class='oe_menu_text' and contains(text(),'" + module + "')]")).click();
    }

}