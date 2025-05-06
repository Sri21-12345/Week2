package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select=new Select(sourceDD);
		select.selectByIndex(4);
		
		WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select1=new Select(ownershipDD);
		select1.selectByValue("OWN_CCORP");
		
		WebElement MarketingCampaigndd = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select2=new Select(MarketingCampaigndd);
		select2.selectByVisibleText("Automobile");
		driver.close();
		
	
	}
}
