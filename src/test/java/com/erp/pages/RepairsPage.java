package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RepairsPage {

    public RepairsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='Repairs']")
    public WebElement repairsPageItself;

    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public List<WebElement> repairsOrderColumnsList;


    @FindBy(xpath = "//th[@class='o_list_record_selector']//input[@type='checkbox']")
    public WebElement repairReferenceCheckBox;


    @FindBy(xpath = "//div[@class='o_content']//input[@type='checkbox']")
    public List<WebElement> repairRefAllCheckBoxesList;




}
