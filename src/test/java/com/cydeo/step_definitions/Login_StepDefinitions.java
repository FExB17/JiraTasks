package com.cydeo.step_definitions;

import com.cydeo.pages.BleucrmHomePage;
import com.cydeo.pages.BleucrmLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;

public class Login_StepDefinitions {

    BleucrmLoginPage loginPage = new BleucrmLoginPage();
    BleucrmHomePage homePage = new BleucrmHomePage();
    FileInputStream file = new FileInputStream("userCredentials.xlsx");

    XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet;

    public Login_StepDefinitions() throws IOException {
    }


    @Given("User is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("https://qa.bleucrm.com/");
        loginPage.usernameInput.clear();
    }

    @When("{string} User enters valid username")
    public void userEntersValidUsername(String sheetName) {
        sheet = workbook.getSheet(sheetName);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            String username = sheet.getRow(i).getCell(0).toString();
            loginPage.usernameInput.sendKeys(username);


        }
    }

    @And("{string} User enters valid password")
    public void userEntersValidPassword(String sheetName) {
        sheet = workbook.getSheet(sheetName);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            String password = sheet.getRow(i).getCell(1).toString();
            loginPage.passwordInput.sendKeys(password);
        }
    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginBtn.click();
    }

    @Then("User should be logged in")
    public void user_should_be_logged_in() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
    }



}