package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05GoogleAssignment {
	WebDriver driver;
	@Test(priority = 1)
	public void gmailTest() {
		driver.findElement(By.linkText("Gmail")).click();
	}
	@Test(priority = 2)
	public void imagesTest() {
		driver.findElement(By.linkText("Images")).click();
	}
	@Test(priority = 3)
	public void advtTest() {
		driver.findElement(By.partialLinkText("Adve")).click();
	}
	@Test(priority = 4)
	public void aboutTest() {
		driver.findElement(By.linkText("About")).click();
	}

	@BeforeMethod
	public void launchGoogle() {
		driver.get("https://www.google.com");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod
	public void printTitle() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
