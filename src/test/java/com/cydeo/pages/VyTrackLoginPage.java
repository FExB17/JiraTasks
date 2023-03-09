package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {

    public VyTrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy (name = "_username")
    public WebElement usernameInput;

    @FindBy (name = "_password")
    public WebElement passwordInput;

    @FindBy (name = "_submit")
    public WebElement loginButton;

    @FindBy (xpath ="//div[@ class='loader-mask shown']")
    public WebElement loaderMask;


    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }




}
