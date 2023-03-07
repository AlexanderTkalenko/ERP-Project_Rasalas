package com.erp.step_definitions;

import com.erp.pages.LoginPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginAsPOSAndCRM_StepDefinitions {
    LoginPage loginPage= new LoginPage();
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env.url"));

    }
    @When("I login using {string} and {string}")
    public void i_login_using_and(String userName, String password) {
        BrowserUtils.sleep(2);
        loginPage.txt_userName.sendKeys(userName);
        loginPage.txt_password.sendKeys(password);
        loginPage.btn_login.click();
    }
    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String expectedName) {
        System.out.println(loginPage.whoIsLoginIndicator.getText());
        String actualName = loginPage.whoIsLoginIndicator.getText();
        Assert.assertEquals(expectedName,actualName);

    }

}
