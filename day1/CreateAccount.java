package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) {
		
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("guest");
			ChromeDriver driver=new ChromeDriver(options);
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			//title of the page
			String title = driver.getTitle();
			System.out.println(title);
			//username
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			//password
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			//login
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("CRM")).click();
			// to create account
			driver.findElement(By.linkText("Accounts")).click();
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.id("accountName")).sendKeys("Srinidhi Ramalingam");
			//description
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			//noofemployes
			driver.findElement(By.name("numberEmployees")).sendKeys("50");
			//sitename
			driver.findElement(By.name("officeSiteName")).sendKeys("LeapTaps");
			driver.close();
			
			
	}

}
