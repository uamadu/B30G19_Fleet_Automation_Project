package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.US04_VehicleContractsPage;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class US04_VehicleContractPage_StepDefs {
    private WebDriver driver = Driver.getDriver();
    private LoginPage loginPage = new LoginPage();
    private US04_VehicleContractsPage vehicleContractsPage = new US04_VehicleContractsPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get("https://qa2.vytrack.com/user/login");
    }

    @When("I login as a store manager or sales manager with username {string} and password {string}")
    public void i_login_as_a_store_manager_or_sales_manager_with_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    @And("I click on the fleet drop")
    public void i_click_on_the_fleet_drop() {
        vehicleContractsPage.navigateToModule("Fleet", "Vehicle Contracts");
    }

    @When("I select the Vehicle Contracts")
    public void i_select_the_vehicle_contracts() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be on the Vehicle Contracts page")
    public void i_should_be_on_the_vehicle_contracts_page() {
        String expectedURL = "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract";
        Assert.assertEquals(expectedURL, driver.getCurrentUrl());
    }

    @When("I login as a driver with username {string} and password {string}")
    public void i_login_as_a_driver_with_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    @When("I click the Vehicle Contracts")
    public void i_click_the_vehicle_contracts() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the app should display {string}")
    public void the_app_should_display(String expectedMessage) {
        String actualMessage = vehicleContractsPage.getPermissionErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }


}
