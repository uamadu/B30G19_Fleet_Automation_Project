package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.PinbarFunctionalityHomePage_YH;
import com.fleet.pages.PinbarFunctionalityPage_YH;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US03_StepDef {


    LoginPage loginPage = new LoginPage();
    PinbarFunctionalityHomePage_YH homePage = new PinbarFunctionalityHomePage_YH();
    PinbarFunctionalityPage_YH pinbarPage = new PinbarFunctionalityPage_YH();


    @Given("user logged in with {string} and {string}")
    public void user_logged_in_with_and(String username, String password) {
        loginPage.login(username, password);
    }

    @When("user click the “Learn how to use this space” link on the homepage,")
    public void user_click_the_learn_how_to_use_this_space_link_on_the_homepage() {
        homePage.pinbarLink.click();

    }

    @Then("user should see: “How To Use Pinbar”")
    public void user_should_see_how_to_use_pinbar() {

        String actualResult = pinbarPage.mainHeader.getText();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOf(pinbarPage.mainHeader));
        Assert.assertTrue(pinbarPage.mainHeader.isDisplayed());

    }


    @And("user should see “Use the pin icon on the right top corner of page to create fast access link in the pinbar.”")
    public void user_should_see_use_the_pin_icon_on_the_right_top_corner_of_page_to_create_fast_access_link_in_the_pinbar() {

        String expectedResult = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        String actualResult = pinbarPage.instructionHeader.getText();
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Then("users should see an image on the page.")
    public void users_should_see_an_image_on_the_page() {

        String expectedImageSource = "/bundles/oronavigation/images/pinbar-location.jpg";

        Assert.assertTrue(Driver.getDriver().getPageSource().contains(expectedImageSource));

    }
}


