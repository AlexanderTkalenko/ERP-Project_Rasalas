package com.erp.step_definitions;

import com.erp.pages.LoginPage;
import com.erp.pages.US10_PG_SalesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US10_PG_QuotationsStepDefinition {

US10_PG_SalesPage us10_pg_salesPage = new US10_PG_SalesPage();

    @Given("the user is on the Sales page")
    public void the_user_is_on_the_sales_page() {
        us10_pg_salesPage.salesPage.click();
    }
    @Then("the user selects the Quotations under Orders")
    public void the_user_selects_the_quotations_under_orders() {
        us10_pg_salesPage.quotationsPage.click();
    }
    @Then("the user selects checkbox next to quotation number")
    public void the_user_selects_checkbox_next_to_quotation_number() {
        us10_pg_salesPage.mainQuotationCheckbox.click();
    }

    @Then("verify all checkboxes are selected")
    public void verifyAllCheckboxesAreSelected() {

        for (WebElement each : us10_pg_salesPage.allQuotationCheckboxes) {
            Assert.assertTrue(each.isSelected());
        }

    }

    LoginPage loginPage = new LoginPage();
    @Given("the user is logged in as Sales manager")
    public void theUserIsLoggedInAsSalesManager() {
        loginPage.txt_userName.sendKeys("salesmanager23@info.com");
        loginPage.txt_password.sendKeys("salesmanager");
        loginPage.btn_login.click();
    }



}
