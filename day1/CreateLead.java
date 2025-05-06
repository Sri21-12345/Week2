package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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
			//To create Lead
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			//User Name
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Srinidhi");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
			//Company Name
			 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTaps");
			 //Title
			 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Create Lead Program");
	}

}
