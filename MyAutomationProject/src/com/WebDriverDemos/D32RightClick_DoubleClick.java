package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D32RightClick_DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		
		WebElement rightClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		//act.moveToElement(rightClick).contextClick().perform();
		act.contextClick(rightClick).perform();
		
		List<WebElement>subMenu = driver.findElements(By.xpath("//*[@id=\"authentication\"]/ul/li/span"));
		for(WebElement sm : subMenu)
			System.out.println(sm.getText());
		
		driver.findElement(By.id("authentication")).click();
		
		WebElement dblClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		//act.moveToElement(dblClick).doubleClick().perform();
		act.doubleClick(dblClick).perform();
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		
		Thread.sleep(2000);
		driver.close();
	}

}
