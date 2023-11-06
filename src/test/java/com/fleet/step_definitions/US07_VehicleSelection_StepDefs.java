
package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.VehicleSelectionPage;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class US07_VehicleSelection_StepDefs {

    LoginPage loginPage = new LoginPage();
    VehicleSelectionPage vehicleSelection = new VehicleSelectionPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("the user is on the login page of VyTrack application")
    public void the_user_is_on_the_login_page_of_vy_track_application() {
    }


    @Given("the user logged in as store manager")
    public void theUserLoggedInAsStoreManager() {
        loginPage.login(ConfigurationReader.getProperty("store_manager_username"), ConfigurationReader.getProperty("store_manager_password"));
    }


    @When("user in on the Fleet-Vehicle page")
    public void user_in_on_the_fleet_vehicle_page() throws InterruptedException {
        //using thread.sleep due to low internet connection
        Thread.sleep(10000);

        actions.moveToElement(vehicleSelection.fleetModuleBtn).moveToElement(vehicleSelection.vehiclesBtn).click().perform();

        Thread.sleep(5000);
        String expectedVehSelTitle = "All - Car - Entities - System - Car - Entities - System";
        String actualVehSellTitle = Driver.getDriver().getTitle();

        if (expectedVehSelTitle.contains(actualVehSellTitle)) {
            System.out.println("Vehicle Selection title verification PASSED!");
        } else {
            System.out.println("Vehicle Selection title verification FAILED!!!");
        }
    }


    @Then("user sees all checkboxes as unchecked")
    public void user_sees_all_checkboxes_as_unchecked() {

        boolean allCheckboxesUnchecked = true;

        for (WebElement checkbox : vehicleSelection.allCheckBoxes) {
            if (checkbox.isSelected()) {
                allCheckboxesUnchecked = false;
                break;
            }
        }
        if (allCheckboxesUnchecked) {
            System.out.println("All checkboxes in the table are unchecked before click.");
        } else {
            System.out.println("Not all checkboxes in the table are unchecked before click.");
        }
    }


    @Then("user clicks on first checkbox")
    public void user_clicks_on_first_checkbox() {

        vehicleSelection.tableHeaderCheckBox.click();
    }


    @Then("user sees all cars checked")
    public void user_sees_all_cars_checked() {

        boolean allCheckboxesChecked = true;

        for (WebElement checkbox : vehicleSelection.allCheckBoxes) {
            if (!checkbox.isSelected()) {
                allCheckboxesChecked = false;
                break;
            }
        }
        if (allCheckboxesChecked) {
            System.out.println("All checkboxes in the table are checked.");
        } else {
            System.out.println("After click: All checkboxes in the table are checked.");
        }
    }


    @Then("user clicks in first checkbox")
    public void user_clicks_in_first_checkbox() {

        vehicleSelection.tableHeaderCheckBox.click();
    }


    @Then("user sees all cars unchecked")
    public void user_sees_all_cars_unchecked() {
        boolean allCheckboxesUnchecked = true;

        for (WebElement checkbox : vehicleSelection.allCheckBoxes) {
            if (checkbox.isSelected()) {
                allCheckboxesUnchecked = false;
                break;
            }
        }
        if (allCheckboxesUnchecked) {
            System.out.println("Checkboxes in the table are unchecked after click.");
        } else {
            System.out.println("All checkboxes in the table are unchecked after click.");
        }

    }


    @Then("user clicks on 3rd checkbox to check a car")
    public void user_clicks_on_3rd_checkbox_to_check_a_car() {

        vehicleSelection.selectedCheckedBox.click();
    }


    @Then("user sees the checkbox is checked")
    public void user_sees_the_checkbox_is_checked() {
        boolean isCheckboxChecked = vehicleSelection.selectedCheckedBox.isSelected();

        if (isCheckboxChecked) {
            System.out.println("Selected checkbox is checked.");
        } else {
            System.out.println("Selected checkbox is unchecked.");
        }
    }


    @Given("the user logged in as sales manager")
    public void theUserLoggedInAsSalesManager() {

        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));

    }
}

