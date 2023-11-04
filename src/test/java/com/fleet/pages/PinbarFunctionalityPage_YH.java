package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PinbarFunctionalityPage_YH extends BasePage {


    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement mainHeader;

    @FindBy(xpath = "//p[contains(text(), ' Use pin ')]")
    public WebElement instructionHeader;



    @FindBy(xpath = "//img[contains(@src,'/bundles/oronavigation/images/pinbar-location.jpg')]")
    public  WebElement imageSource;
}
