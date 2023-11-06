package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleSelectionPage {

    public VehicleSelectionPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'][normalize-space()='Fleet'] )")
    public WebElement fleetModuleBtn;

    @FindBy(xpath = "(//span[normalize-space()='Vehicles'])")
    public WebElement vehiclesBtn;

    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']//input[@type='checkbox']")
    public WebElement tableHeaderCheckBox;


    @FindBy(css = "table input[type=checkbox]")
    public List<WebElement> allCheckBoxes;


    @FindBy(xpath = "(//input[@type='checkbox'])[24]")
    public WebElement selectedCheckedBox;


}








