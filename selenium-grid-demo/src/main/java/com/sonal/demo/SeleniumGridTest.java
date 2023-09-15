package com.sonal.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		String remote_url = "http://localhost:4444";

		ChromeOptions options = new ChromeOptions();
		RemoteWebDriver driver = new RemoteWebDriver(new URL(remote_url), options);

		driver.get("https://google.com/");
		
		Thread.sleep(5000l);
		
		driver.manage().window().maximize();
		 
		WebElement findElement = driver.findElement(By.name("q"));
		findElement.sendKeys("sonal kumar sinha");
		findElement.sendKeys(Keys.RETURN);
		
		Thread.sleep(2000l);
		

		driver.quit();

	}
}
