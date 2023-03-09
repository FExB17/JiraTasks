package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackDashboardPage {
    public VyTrackDashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//li[@id = 'user-menu']/a")
    public WebElement userMenu;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutLink;

    public void logout() {
        userMenu.click();
        logoutLink.click();
    }


}
