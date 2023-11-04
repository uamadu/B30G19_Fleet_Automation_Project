package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import com.fleet.pages.LoginPage;
import com.fleet.pages.VehiclesPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class US06_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    VehiclesPage vehiclesPage = new VehiclesPage();


    WebDriverWait webDriverWait;
    Actions actions = new Actions(Driver.getDriver());


    //driver
    @Given("user is already logged in as driver")
    public void user_is_already_logged_in_as_driver() {
       loginPage.login(ConfigurationReader.getProperty("driver_username"), ConfigurationReader.getProperty("driver_password"));
         webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(25));

        webDriverWait.until(ExpectedConditions.titleIs("Dashboard"));
    }
    @When("user hover over to Fleet and click Vehicles")
    public void user_hover_over_to_fleet_and_click_vehicles() {


        actions.moveToElement(dashboardPage.fleetButton1).moveToElement(dashboardPage.vehicleButton1).click().perform();

      //  webDriverWait.until(ExpectedConditions.titleContains("Car - Entities"));

    }
    @Then("user is on the All Cars page and hover over to three dots")
    public void user_is_on_the_all_cars_page_and_hover_over_to_three_dots() {
       //actions.moveToElement(vehiclesPage.threeDots);
       BrowserUtils.waitForVisibility(vehiclesPage.threeDots1, 15);
        BrowserUtils.hover(vehiclesPage.threeDots1);

    }
    @Then("user should see below info signs while hovering over")
    public void user_should_see_below_info_signs_while_hovering_over(List<String> ExpectedOptions) {


        actions.moveToElement(vehiclesPage.view).perform();
        boolean answerView = vehiclesPage.view.isDisplayed();
        System.out.println("answerView = " + answerView);

        actions.moveToElement(vehiclesPage.edit).perform();
        boolean answerEdit = vehiclesPage.edit.isDisplayed();
        System.out.println("answerEdit = " + answerEdit);

        BrowserUtils.waitForVisibility(vehiclesPage.delete, 5);
        BrowserUtils.hover(vehiclesPage.threeDots1);
        actions.moveToElement(vehiclesPage.delete).perform();
        boolean answerDelete = vehiclesPage.delete.isDisplayed();
        System.out.println("answerDelete = " + answerDelete);

    }






   //salesManager and storeManager
    @Given("user is already logged in as storeManager")
    public void userIsAlreadyLoggedInAsStoreManager() {
        loginPage.login(ConfigurationReader.getProperty("store_manager_username"), ConfigurationReader.getProperty("store_manager_password"));
        webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(25));

        webDriverWait.until(ExpectedConditions.elementToBeClickable(dashboardPage.fleetButton1));

    }

    @Given("user is already logged in as salesManager")
    public void userIsAlreadyLoggedInAsSalesManager() {
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));
        webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

        webDriverWait.until(ExpectedConditions.elementToBeClickable(dashboardPage.fleetButton1));
    }

    @When("user move to element over to Fleet and click Vehicles")
    public void userMoveToElementOverToFleetAndClickVehicles() {
        actions.moveToElement(dashboardPage.fleetButton1).moveToElement(dashboardPage.vehicleButton2).click().perform();
    }

    @And("user should see below info signs while moving to three dots over")
    public void userShouldSeeBelowInfoSignsWhileMovingToThreeDotsOver() {
        BrowserUtils.waitForVisibility(vehiclesPage.threeDots2, 15);

        actions.moveToElement(vehiclesPage.view).perform();
        boolean answerView = vehiclesPage.view.isDisplayed();
        System.out.println("answerView = " + answerView);

        actions.moveToElement(vehiclesPage.edit).perform();
        boolean answerEdit = vehiclesPage.edit.isDisplayed();
        System.out.println("answerEdit = " + answerEdit);

        //BrowserUtils.waitForVisibility(vehiclesPage.delete2, 5);
        BrowserUtils.hover(vehiclesPage.threeDots1);
        actions.moveToElement(vehiclesPage.delete).perform();
        boolean answerDelete2 = vehiclesPage.delete.isDisplayed();
        System.out.println("answerDelete = " + answerDelete2);



    }

    @Then("user is on the All Cars page and move to  over to three dots")
    public void userIsOnTheAllCarsPageAndMoveToOverToThreeDots() {
        //actions.moveToElement(vehiclesPage.threeDots);
        BrowserUtils.waitForVisibility(vehiclesPage.threeDots2, 15);
        BrowserUtils.hover(vehiclesPage.threeDots2);

        //new lines
        // more lines

    }
}
