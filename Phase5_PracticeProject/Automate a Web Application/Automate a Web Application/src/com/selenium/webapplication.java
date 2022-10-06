package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webapplication {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		                  "C:\\Users\\alekh\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		//name
				WebElement name=driver.findElement(By.id("id_name"));
				name.sendKeys("Alekhya");
				
				//email
				WebElement email=driver.findElement(By.id("id_email"));
				email.sendKeys("alekhya@gmail.com");
				
				//mobile
				WebElement mobile=driver.findElement(By.id("id_cell_phone"));
				mobile.sendKeys("7654321891");
				
				//password
				WebElement password=driver.findElement(By.id("id_password"));
				password.sendKeys("Alekhya@21");
				

				//button
				WebElement register=driver.findElement(By.cssSelector("#registerButton"));
				register.click();
				
				
				

				
	}}
