package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D26HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Alert alt;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		js.executeScript("window.scrollBy(0, 100)", "");
		driver.findElement(By.id("alertButton")).click();
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.accept();		//Will click on Ok button
		
		WebElement but2 = driver.findElement(By.id("timerAlertButton"));
		js.executeScript("arguments[0].click()", but2);
		//Thread.sleep(5000);
		//wait.until(ExpectedConditions.alertIsPresent());
		//alt = driver.switchTo().alert();
		alt = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.accept();
		
		WebElement but3 = driver.findElement(By.id("confirmButton"));
		js.executeScript("arguments[0].click()", but3);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.dismiss();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		WebElement but4 = driver.findElement(By.id("promtButton"));
		js.executeScript("arguments[0].click()", but4);
		alt = driver.switchTo().alert();
		alt.sendKeys("Sheetal");
		alt.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
		driver.close();
	}

}
