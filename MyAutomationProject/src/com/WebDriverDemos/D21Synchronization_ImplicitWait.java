package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D21Synchronization_ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.redbus.in/");

		//From
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div[1]")).click();
		driver.findElement(By.id("srcDest")).sendKeys("Mum");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div/div/div")).click();
		
		//To
		driver.findElement(By.id("srcDest")).sendKeys("Pun");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div/div/div")).click();
		
		//Calender
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[1]/i")).click();
		
		//Date
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[3]/div[2]/div/ul/li[35]/div/div/span")).click();
		
		//Search Buses
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/button")).click();
		
		//Display bus
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[4]/div/ul/li[1]/div[2]/div[3]/div/div[1]/div")).getText());
		
		driver.close();
	}

}
