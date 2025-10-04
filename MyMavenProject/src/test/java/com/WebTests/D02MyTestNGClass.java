package com.WebTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class D02MyTestNGClass {
	WebDriver driver;
	@Test
	public void testAmazon() {
		System.out.println("Title: " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Amazon.in"));
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
