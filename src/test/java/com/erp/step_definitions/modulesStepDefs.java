package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.LoginPage;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class modulesStepDefs {



    @Given("the user is oo login page")
    public void the_user_is_oo_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env.url"));
    }

    LoginPage loginPage = new LoginPage();

    @Given("the user is logged in as POSmanager")
    public void the_user_is_logged_in_as_po_smanager() {
        loginPage.login(ConfigurationReader.getProperty("pos.manager.username"),ConfigurationReader.getProperty("pos.manager.password"));
    }

    BasePage basePage = new BasePage();


    @Then("verify all enable modules equals {int}")
    public void verifyAllEnableModulesEquals(int numberModules) {
        Assert.assertTrue(basePage.modulesList.size() == numberModules);
    }


}
