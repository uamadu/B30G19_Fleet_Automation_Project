package com.fleet.step_definitions;

import com.fleet.pages.US12_CustomerPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class US12_CustomerPage_StepDefs {

    US12_CustomerPage customerPage = new US12_CustomerPage();

    @Then("User click on the customer button")
    public void userClickOnTheCustomerButton() throws InterruptedException {
        Thread.sleep(3000);
//        BrowserUtils.highlightUtil(customerPage.customerButton);
        BrowserUtils.highlightUtilReturn(customerPage.customerButton).click();
//        customerPage.customerButton.click();
        Thread.sleep(3000);
    }

    @When("The {string} clicks on the Account option")
    public void The_user_clicks_on_the_account_option(String user) throws InterruptedException {
        if (!user.equalsIgnoreCase("Driver")) {
            Thread.sleep(2000);
           BrowserUtils.highlightUtilReturn(customerPage.accountButton).click();
            Thread.sleep(3000);
        }
    }

    @And("The user clicks on the Filter option")
    public void theClicksOnTheFilterOption() throws InterruptedException {
        BrowserUtils.highlightUtilReturn(customerPage.filterOption).click();
        Thread.sleep(3000);

    }

    @Then("The user should see the following {string} filter items")
    public void The_user_should_see_the_following_filter_items( String columnNames) {


      WebElement element = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'"+columnNames+"')]"));

            BrowserUtils.highlightUtil(element);
            Assert.assertTrue(element.isDisplayed());
        }


    @And("The user should see the following filter items")
    public void theShouldSeeTheFollowingFilterItems(DataTable dataTable) throws InterruptedException {

        List<String> names = dataTable.asList(String.class);

        for (String name : names) {
            // assign to a web element for re useAbility
            WebElement element = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + name + "')]"));

            BrowserUtils.highlightUtil(element);
            Assert.assertTrue(element.isDisplayed());
            Thread.sleep(500);
        }
    }
}
