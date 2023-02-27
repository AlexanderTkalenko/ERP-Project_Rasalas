package com.erp.pages;



import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public  LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement txt_userName;


    @FindBy(id = "password")
    public WebElement txt_password;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btn_login;


    @FindBy(xpath = "//a[@class='btn btn-link pull-right']")
    public WebElement btn_resetPassword;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement btn_homePage; // "Best solution for startups" message


    public void login(String userNameStr, String passwordStr) {
        txt_userName.sendKeys(userNameStr);
        txt_password.sendKeys(passwordStr);
        btn_login.click();
        // verification that we logged
    }


    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement whoIsLoginIndicator;


}
