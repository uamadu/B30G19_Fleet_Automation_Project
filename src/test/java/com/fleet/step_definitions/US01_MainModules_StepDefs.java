package com.fleet.step_definitions;

import com.fleet.pages.US01_MainModulesPage_UA;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US01_MainModules_StepDefs {
    US01_MainModulesPage_UA  mainModulesPage = new US01_MainModulesPage_UA();
    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {



            BrowserUtils.sleep(10);

            WebDriverWait wait = new  WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
            wait.until(ExpectedConditions.titleIs("Dashboard"));

            List<String> actualModules = new ArrayList<>();

            for (WebElement eachModule : mainModulesPage.allTopModules) {
                actualModules.add(eachModule.getText());
            }

            Assert.assertEquals(expectedModules,actualModules);

            Driver.closeDriver();
        }
    }






