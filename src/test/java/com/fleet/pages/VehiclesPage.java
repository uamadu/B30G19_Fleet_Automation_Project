package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage {

    public VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//td[@data-column-label='test']")
    public WebElement threeDots1;

    @FindBy(xpath = "(//td[@data-column-label='test'])[1]")
    public WebElement threeDots2;


    @FindBy(xpath = "(//a[@title='View'])[1]")
    public WebElement view;

    @FindBy(xpath = "(//a[@title='Edit'])[1]")
    public WebElement edit;

    @FindBy(xpath = "(//a[@title='Delete'])[1]")
    public WebElement delete;

    @FindBy(xpath = "(//a[@title='Delete'])[2]")
    public WebElement delete2;

}

