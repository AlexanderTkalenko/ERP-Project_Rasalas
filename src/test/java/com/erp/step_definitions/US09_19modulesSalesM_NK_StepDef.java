package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US09_19modulesSalesM_NK_StepDef {
    BasePage basePage = new BasePage();


    @And("user is able to see {int} modules")
    public void userIsAbleToSeeModules(int modulesNumSM) {
        Assert.assertEquals(basePage.modulesList.size(), modulesNumSM);
    }

    @Then("user have access to each {string}")
    public void user_have_access_to_each(String module) throws InterruptedException {

        Thread.sleep(3000);
        BasePage.clickOnEachModule(module);

    }


    @Then("module title should contain {string}")
    public void moduleTitleShouldContain(String expectedTitle) throws InterruptedException {
//  WE HAVE 19 MODULES, DEPENDING ON YOUR SCREEN SIZE FEW LAST ONES CAN AUTOMATICALLY HIDE IN THE DROPDOWN,
//  IN THIS CASE THEY WON'T BE ACCESSIBLE

        //Thread.sleep(3000);
        //have to use explicit wait, otherwise title doesn't change fast enough and assertion fails
        BrowserUtils.waitForTitleContains(expectedTitle);
        String actualTitle = Driver.getDriver().getTitle();

        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
}


