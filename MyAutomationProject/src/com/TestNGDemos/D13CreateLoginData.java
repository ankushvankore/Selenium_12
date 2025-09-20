package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D13CreateLoginData {
	String fPath = "ExcelFiles/LoginData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int i = 0;

	@Test(dataProvider = "getLoginDetails")
	public void createLoginSheet(String un, String ps) {
		row = sheet.createRow(i);
		
		row.createCell(0).setCellValue(un);
		row.createCell(1).setCellValue(ps);
		row.createCell(2).setCellValue("Not Run");
		
		i++;
	}

	@DataProvider
	public Object[][] getLoginDetails() {
		return new Object[][] 
				{ 	
					new Object[] { "admin", "admin123" }, 
					new Object[] { "sheetal", "sheetal123" },
					new Object[] { "admin", "admin123" }, 
					new Object[] { "sharvari", "sharvari123" }, 
				};
	}

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("LoginData");
		
		sheet.createRow(i).createCell(0).setCellValue("User Name");
		sheet.getRow(i).createCell(1).setCellValue("Password");
		sheet.getRow(i).createCell(2).setCellValue("Result");
		
		i++;
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
