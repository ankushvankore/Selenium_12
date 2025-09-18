package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D09KeywordDrivenFramework {
	File file;
	FileInputStream fis;
	Properties prop;
	WebDriver driver;
	
	@Test
	public void login() {
		driver.findElement(By.id(prop.getProperty("unTxId"))).sendKeys("Sharvari");
		driver.findElement(By.name(prop.getProperty("psTxNm"))).sendKeys("sharvari@123");
		driver.findElement(By.xpath(prop.getProperty("loginBtnXP"))).click();
		
		System.out.println(driver.findElement(By.cssSelector(prop.getProperty("errCSS"))).getText());
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("src/com/TestNGDemos/MyLocators.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		//This will load all the properties from .properties file in this object
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
