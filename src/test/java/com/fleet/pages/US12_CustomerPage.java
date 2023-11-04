package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US12_CustomerPage {

    public US12_CustomerPage() {

        PageFactory.initElements(Driver.getDriver() , this);

    }

   @FindBy(xpath = " (//span[contains(text(),'Customers')] )[1]")
    public WebElement customerButton;

    @FindBy(xpath = "(//span[text()='Accounts'])[1]")
    public WebElement accountButton;

    @FindBy(xpath = "//a[@title='Filters']//i")
    public WebElement filterOption;

   @FindBy(xpath = "//span[text()='Account name']")
   public WebElement accountName;


























}
