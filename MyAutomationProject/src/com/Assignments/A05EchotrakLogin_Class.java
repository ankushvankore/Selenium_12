package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A05EchotrakLogin_Class {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/");
		
		/*WebElement userName = driver.findElement(By.className("form-control"));
		userName.sendKeys("sheetal");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("sheetal123");
		WebElement loginBtn = driver.findElement(By.className("btn-block"));
		loginBtn.click();
		
		WebElement errMsg = driver.findElement(By.id("lblMsg"));
		String msg = errMsg.getText();
		System.out.println("Error Message: " + msg);
		*/
		
		driver.findElement(By.className("form-control")).sendKeys("sharvari");
		driver.findElement(By.id("txtPassword")).sendKeys("sharvari123");
		driver.findElement(By.className("btn-block")).click();
		
		//WebElement errMsg = driver.findElement(By.id("lblMsg"));
		//System.out.println("Message: " + errMsg.getText());
		
		System.out.println("Message: " + driver.findElement(By.id("lblMsg")).getText());
		
		driver.close();
	}

}
