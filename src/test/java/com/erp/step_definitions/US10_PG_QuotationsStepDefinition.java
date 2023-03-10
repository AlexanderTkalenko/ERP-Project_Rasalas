package com.erp.step_definitions;

import com.erp.pages.US10_PG_SalesPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US10_PG_QuotationsStepDefinition {

US10_PG_SalesPage us10_pg_salesPage = new US10_PG_SalesPage();

    @And("the user is on the Sales page")
    public void theUserIsOnTheSalesPage() {
        us10_pg_salesPage.salesPage.click();
    }


    @And("the user selects checkbox next to quotation number")
    public void theUserSelectsCheckboxNextToQuotationNumber() {
        us10_pg_salesPage.mainQuotationCheckbox.click();
    }

    @Then("verify all checkboxes are selected")
    public void verifyAllCheckboxesAreSelected() {

        for (WebElement each : us10_pg_salesPage.allQuotationCheckboxes){
            Assert.assertTrue(each.isSelected());
        }

    }



}
