package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BleucrmHomePage {

    public BleucrmHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "user-block")
    public WebElement userProfile;

    @FindBy(linkText = "/auth/?logout=yes&backurl=%2Fstream%2F")
    public WebElement logoutLink;

}
