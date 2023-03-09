package com.cydeo.utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    private static XSSFWorkbook workbook;


    static{
        try {
            FileInputStream file = new FileInputStream(ConfigurationReader.getProperty("excel_credentials_path"));
            workbook = new XSSFWorkbook(file);
        } catch (IOException e) {
            System.out.println("Invalid file path or file not found");
        }

    }

    public static XSSFSheet getSheet(String sheetName){
        return workbook.getSheet(sheetName);
    }
}
