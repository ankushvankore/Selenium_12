package com.WebTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class D03ReadingFromExcel {

	public static void main(String[] args) throws IOException {
		D03ReadingFromExcel d1 = new D03ReadingFromExcel();
		//String[][] d = d1.getData();
		//System.out.println(d);

	}
	@DataProvider
	public String[][] getData() throws IOException
	{
		String fPath = "C:\\Users\\Dell\\Desktop\\LoginData.xlsx";
		File file;
		FileInputStream fis;
		XSSFWorkbook wb;
		XSSFSheet sheet;
		
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data = new String[rows][cells];
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cells; j++)
			{
				//System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + "\t");
				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
			System.out.println();
		}
		
		wb.close();
		fis.close();
		
		return data;
	}

}
