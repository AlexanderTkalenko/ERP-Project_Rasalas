package com.erp.step_definitions;

import com.erp.pages.CalendarPage;
import com.erp.pages.POSManagerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US14_stepDefinitions {

    POSManagerPage pos_Manager_Page = new POSManagerPage();
    CalendarPage calendarPage = new CalendarPage();

    @When("user clicks on the Calendar page")
    public void user_clicks_on_the_calendar_page() {
        pos_Manager_Page.calendarButton.click();
    }
    @Then("user should see the time starts with {string}")
    public void user_should_see_the_time_starts_with(String string) {
        Assert.assertEquals(string,calendarPage.convertMethod(calendarPage.actualTime).get(0));
    }

    @Then("user should see the time ends with {string}")
    public void user_should_see_the_time_ends_with(String string) {
        Assert.assertEquals(string,calendarPage.convertMethod(calendarPage.actualTime).get(calendarPage.actualTime.size()-1));
    }
    @Then("time increases by one hour")
    public void time_increases_by_one_hour(List<String>expectedTime) {
        Assert.assertEquals(expectedTime, calendarPage.convertMethod(calendarPage.actualTime));
    }


}
