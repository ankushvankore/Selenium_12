package com.TestNGDemos;

import org.testng.annotations.Test;

import graphql.Assert;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D10POM_Client{
	WebDriver driver;
	RediffUtility r1;
	
	@Test
	public void registration() throws InterruptedException {
		r1.enterFullName("Sharvari Suryavanshi");
		r1.enterRediffId("sharvari08Jan2000");
		r1.enterPassword("Sharvari@123");
		r1.setBirthDate("08", "JAN", "2002");
		r1.selectGender("Female");
		
		//String msg = r1.checkAvailablity();
		
		//Assert.assertTrue(msg.contains("avail"));
		Assert.assertTrue(r1.checkAvailablity().contains("avail"));
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffUtility(driver);
	}

	@AfterTest
	public void afterTest() {
	}

}
