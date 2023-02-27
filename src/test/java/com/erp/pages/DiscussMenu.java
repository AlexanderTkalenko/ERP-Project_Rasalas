package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscussMenu {

    public DiscussMenu(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement message_inbox;

    @FindBy(xpath = "//button[@title='Mark all as read']")
    public WebElement btn_mark_all_read;

    @FindBy(xpath = "//div[contains(@class,'o_searchview')]")
    public WebElement box_search;

    @FindBy(xpath = "//span[@title='Advanced Search...']")
    public WebElement btn_plus_or_advanced_search;

    @FindBy(xpath = "//button[text()=' Filters ']")
    public WebElement dropDown_in_advanced_search_filters;

    @FindBy(xpath = "//button[text()=' Favorites ']")
    public WebElement dropDown_in_advanced_search_favorite;


    @FindBy(xpath = "//div[@data-channel-id='channel_inbox']")
    public WebElement btn_inbox;

    @FindBy(xpath = "//span[.='Starred']")
    public WebElement btn_starred;

    @FindBy(xpath = "//b[.='Channels']")
    public WebElement btn_channels;

    @FindBy(xpath = "//span[@data-type='public']")
    public WebElement btn_add_Channels;

    @FindBy(xpath = "//div[@title='general']//span[@class='o_channel_name']")
    public WebElement btn_general_in_channels;

    @FindBy(xpath = "//div[@data-channel-id='5']//span[@class='o_channel_name']")
    public WebElement btn_projects_tasks_in_channels;

    @FindBy(xpath = "//span[@data-type='dm']")
    public WebElement btn_add_Direct_messages;

    @FindBy(xpath = "//input[@placeholder='User name']")
    public WebElement userName_searchBox_under_directMessages;

    @FindBy(xpath = "//span[@data-type='private']")
    public WebElement btn_add_Private_messages;

    @FindBy(xpath = "//input[@placeholder='Add a private channel']")
    public WebElement addPrivateChannelSearchBox_under_privateMessages;



}
