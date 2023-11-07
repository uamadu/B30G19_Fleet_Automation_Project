package com.fleet.pages;

import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PrivateKey;
import java.util.List;

public class US01_MainModulesPage_UA {

        public US01_MainModulesPage_UA (){
            PageFactory.initElements(Driver.getDriver(),this);
        }


        @FindBy(css = ".title.title-level-1")


        public List<WebElement> allTopModules;


    }


