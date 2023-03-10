package com.cydeo.step_definitions;

import com.cydeo.pages.BleucrmHomePage;
import com.cydeo.pages.BleucrmLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginWithExcelCredentials {

    BleucrmLoginPage loginPage = new BleucrmLoginPage();
    BleucrmHomePage homePage = new BleucrmHomePage();
    FileInputStream file;
    XSSFWorkbook workbook;
    XSSFSheet sheet;


    @Given("User is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("https://qa.bleucrm.com/");
        loginPage.usernameInput.clear();
    }

    // fo feature file with data table
    @When("User enters valid username {string}")
    public void user_enters_valid(String string) {
        loginPage.usernameInput.sendKeys(string);
    }

    //for feature file with excel sheet
    @When("{string} User enters valid username and password")
    public void userEntersValidUsernameAndPassword(String sheetName) throws IOException {
        file = new FileInputStream("userCredentials.xlsx");
        workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheet(sheetName);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {

            String username = sheet.getRow(i).getCell(0).toString();
            String password = sheet.getRow(i).getCell(1).toString();

            loginPage.login(username,password);
            Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
            homePage.logout();
            loginPage.usernameInput.clear();
        }



    }

}