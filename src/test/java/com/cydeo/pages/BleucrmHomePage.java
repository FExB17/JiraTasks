package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BleucrmHomePage {

    public BleucrmHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@id='user-block']")
    public WebElement userProfile;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutLink;

    public void logout() {
        userProfile.click();
        logoutLink.click();
    }

}
