package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US04_VehicleContractsPage extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Vehicle Contracts' and contains(@class, 'title title-level-2')]")
    private WebElement vehicleContractsOption;

    @FindBy(xpath = "div[@class='message']")

    private WebElement permissionErrorMessage;

    public US04_VehicleContractsPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void selectVehicleContracts() {
        navigateToModule("Fleet", "Vehicle Contracts");
    }

    public String getPermissionErrorMessage() {
        return permissionErrorMessage.getText();
    }
}
