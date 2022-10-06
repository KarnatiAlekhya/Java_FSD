package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		                  "C:\\Users\\alekh\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.shine.com/registration/");
	
	//name
	WebElement name=driver.findElement(By.id("id_name"));
	name.sendKeys("Nive");
	
	//email
	WebElement email=driver.findElement(By.id("id_email"));
	email.sendKeys("nive@gmail.com");
	
	//mobile
	WebElement mobile=driver.findElement(By.id("id_cell_phone"));
	mobile.sendKeys("9843516660");
	
	//password
	WebElement password=driver.findElement(By.id("id_password"));
	password.sendKeys("Nive@123");
	
	//button
	WebElement register=driver.findElement(By.cssSelector("#registerButton"));
	register.click();
	
	//login button
	WebElement login=driver.findElement(By.cssSelector("#loginContainer"));
	login.click();
	
	 //login email
	 WebElement Email=driver.findElement(By.id("id_email_login"));
	 Email.sendKeys("nivekamal@gmail.com");
	 
	//password
	WebElement Password=driver.findElement(By.id("id_password"));
	Password.sendKeys("Nive@123");
	
	//button
	WebElement Login=driver.findElement(By.xpath("//*[@id=\"cndidate_login_widget\"]/form/ul[2]/li[4]/div/button"));
	Login.click();
	
}



}
