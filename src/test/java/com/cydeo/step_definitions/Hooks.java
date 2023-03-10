package com.cydeo.step_definitions;

import com.cydeo.pages.BleucrmHomePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.FileInputStream;

public class Hooks {

    BleucrmHomePage homePage = new BleucrmHomePage();
    @After
    public void tearDownScenario(Scenario scenario) throws InterruptedException {
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/jpg",scenario.getName());
        }
        Driver.closeDriver();
    }
//@Before
    public void credentials(){

}


}
