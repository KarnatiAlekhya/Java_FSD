package TestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class test {
	String driverPath=("C:\\Users\\alekh\\Downloads\\chromedriver_win32/chromedriver.exe");
	
	public WebDriver wd;
	//test case is pass without any assert-by checking the flow 
	@Test(priority = 1)
	  public void register() {
		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\alekh\\Downloads\\chromedriver_win32/chromedriver.exe");
	  
		  wd = new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("createAccountSubmit")).click();
	      wd.findElement(By.id("ap_customer_name")).sendKeys("Alekhya");
	      wd.findElement(By.id("ap_phone_number")).sendKeys("7654321891");
	      wd.findElement(By.id("ap_email")).sendKeys("alekhya@gmail.com");
	      wd.findElement(By.id("ap_password")).sendKeys("Alekhya@21");
	      //wd.findElement(By.id("ap_password_check")).sendKeys("Alekhya@21");
	      wd.findElement(By.id("continue")).click();
 }
	@Test(priority=2)
  public void login() {
	  System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\alekh\\Downloads\\chromedriver_win32/chromedriver.exe");
	  wd = new ChromeDriver();
      wd.manage().window().maximize();
      wd.get("https://www.amazon.in/");
      wd.findElement(By.id("nav-link-accountList")).click();
      wd.findElement(By.id("ap_email")).sendKeys("alekhya@gmail.com");
	  wd.findElement(By.id("continue")).click();
      wd.findElement(By.id("ap_password")).sendKeys("Alekhya@21");
 }
  @Test(priority=3)
  public void search() throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\alekh\\Downloads\\chromedriver_win32/chromedriver.exe");
	  wd = new ChromeDriver();
    	wd.get("https://www.amazon.in/");
	    System.out.println(wd.getTitle());
	    System.out.println(wd.getCurrentUrl());
	    wd.findElement(By.id("twotabsearchtextbox")).sendKeys("iq neo6");
	    Thread.sleep(5000);
	    wd.findElement(By.id("nav-search-submit-button")).submit();
	   wd.findElement(By.linkText("iQOO Neo 6 5G (Dark Nova, 8GB RAM, 128GB Storage) | Snapdragon® 870 5G | 80W FlashCharge")).click();
    // wd.findElement(By.name("submit.add-to-cart")).click();

  }}

