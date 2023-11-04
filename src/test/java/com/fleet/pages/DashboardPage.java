package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span [contains (text(), 'Fleet')] ) [1]")
    public WebElement fleetButton1;

    //@FindBy(xpath = "(//a[@class='unclickable'])[2]")
    //public WebElement fleetButton2;




    @FindBy(css = ".dropdown-menu-single-item.first")
    public WebElement vehicleButton1;

    @FindBy(xpath = "(//a[.='Vehicles'])")
    public WebElement vehicleButton2;




}
