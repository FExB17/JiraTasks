package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadExcel {
    @Test
    public void testExcelRead() throws IOException {

        String path = "SampleData.xlsx";



        // to read from excel we need to load it to FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);


        //workbook>sheet>row>cell
        //1- create a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);


        //2- we need to get a specific sheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet("Employees");

        //3- Select row and cell
        //print out mary's cell
        //indexes start from 0

        System.out.println(sheet.getRow(1).getCell(0));

        //print out Developer
        System.out.println(sheet.getRow(3).getCell(2));


        //Return the count of used cells only
        //starts from 1
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println("usedRows = " + usedRows);

        // doesn't care if the cell is empty
        //starts from 0
        int totalRows = sheet.getLastRowNum();
        System.out.println("totalRows = " + totalRows);

        //create a logic to print Vinod's name

        for (int rowNum= 0; rowNum<usedRows; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")) {
                System.out.println(sheet.getRow(rowNum).getCell(0));
            }
        }

        // Create a logic to print out Linda's Job_ID

        for (int i = 0; i < usedRows; i++) {
            if (sheet.getRow(i).getCell(0).toString().equals("Linda")) {
                System.out.println("Linda's Job_ID: " + sheet.getRow(i).getCell(2));;
            }
        }






        XSSFCell cell1 = sheet.getRow(0).getCell(3);

        cell1.setCellValue("4th Column");

        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);

        outputStream.close();
        workbook.close();
        fileInputStream.close();




    }

}
