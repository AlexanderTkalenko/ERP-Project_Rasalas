package com.erp.step_definitions;

import com.erp.pages.RepairsPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US11_StepDefs_AlexTk {


    RepairsPage repairsPage = new RepairsPage();


    @When("the user go to the Repairs page")
    public void the_user_go_to_the_repairs_page() {
        repairsPage.repairsPageItself.click();
    }


    @And("the user is select all the repair orders by clicking \"Repair Reference\" checkbox")
    public void theUserIsSelectAllTheRepairOrdersByClickingCheckbox() {
        repairsPage.repairReferenceCheckBox.click();

        for (WebElement each : repairsPage.repairRefAllCheckBoxesList){
            Assert.assertTrue(each.isSelected());
        }
    }



}
