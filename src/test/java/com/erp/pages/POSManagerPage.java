package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class POSManagerPage {
    public POSManagerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='POSManager23']")
    public WebElement posManagerButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='sale.sale_menu_root']")
    public WebElement salesButton;

    @FindBy(className = "o_column_sortable")
    public List<WebElement>quotations;

    @FindBy(xpath = "//a[@data-menu-xmlid='mrp_repair.menu_repair_order']")
    public WebElement repairsButton;

    @FindBy(className = "o_column_sortable")
    public List<WebElement>repairsOrders;


    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement>mainModules;

    @FindBy(xpath = "//a[@data-menu-xmlid='calendar.mail_menu_calendar']")
    public WebElement calendarButton;

    @FindBy(xpath ="//a[@data-menu-xmlid='point_of_sale.menu_point_root']")
    public WebElement pointOfSaleButton;













}
