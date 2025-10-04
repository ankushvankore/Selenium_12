package com.WebTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D05NormalReport {

	public static void main(String[] args) {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("MyFirstReport.html");
		// Represents the file in which we are stroring the report
		ExtentReports report = new ExtentReports();
		// Represents the report
		report.attachReporter(htmlReport);
		// Save the report in the file
		ExtentTest test;
		// Represents the tests / test cases

		// Setting the environment details
		report.setSystemInfo("Laptop", "Dell");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("User Name", "Sharvari");
		report.setSystemInfo("Processor", "I3");
		report.setSystemInfo("Operating System", "Windows 10");

		// Look and feel and configuration about the report
		htmlReport.config().setDocumentTitle("My First Report");
		htmlReport.config().setReportName("Google Tests");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd-MMM-yyyy");

		// Creating tests
		test = report.createTest("Google Title");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();

		test.log(Status.PASS, MarkupHelper.createLabel("Google Title Test", ExtentColor.GREEN));
		
		// Creating tests
		test = report.createTest("Google Search");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Extent Report", Keys.ENTER);

		driver.close();

		test.log(Status.FAIL, MarkupHelper.createLabel("Google Search Test", ExtentColor.RED));

		report.flush();
		// This will generate the report
	}

}
