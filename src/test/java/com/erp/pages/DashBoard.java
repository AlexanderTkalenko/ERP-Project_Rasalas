package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashBoard {

    public DashBoard(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li")
    public List<WebElement> menus_modules;


    @FindBy(xpath = "//li[contains(@class, 'o_user_menu')]")
    public WebElement userNameDropDown;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement btn_logOut;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userName_dashboard;

}
