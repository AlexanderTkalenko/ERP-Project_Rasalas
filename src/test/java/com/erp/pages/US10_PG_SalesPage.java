package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US10_PG_SalesPage {

    public US10_PG_SalesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu='445']")
    public WebElement salesPage;


    @FindBy(xpath = "//div[@class='o_content']//div[@class='o_checkbox'][1]")
    public WebElement mainQuotationCheckbox;

    @FindBy(xpath = "//div[@class='o_content']//input[@type='checkbox']")
    public List<WebElement> allQuotationCheckboxes;


}
