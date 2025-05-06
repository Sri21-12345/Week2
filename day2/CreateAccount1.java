package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount1 {

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
		driver.findElement(By.id("accountName")).sendKeys("Srinidhi");
		
		//description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//industry
		WebElement IndustryDD = driver.findElement(By.name("industryEnumId"));
		Select select=new Select(IndustryDD);
		select.selectByIndex(3);
		
		//text for ownership
		WebElement ownership= driver.findElement(By.name("ownershipEnumId"));
		Select select1=new Select(ownership);
		select1.selectByVisibleText("S-Corporation");
		
		//value for source
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select select2=new Select(source);
		select2.selectByValue("LEAD_EMPLOYEE");
		
		//index for marketing campaign
		WebElement marketingcompaign = driver.findElement(By.id("marketingCampaignId"));
		Select select3=new Select(marketingcompaign);
		select3.selectByIndex(6);
		
		//value
		WebElement stateandprovince = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select select4=new Select(stateandprovince);
		select4.selectByValue("TX");
		
		//Createaccount
		WebElement createaccount1 = driver.findElement(By.id("ext-gen745"));
		createaccount1.click(); 

	}

}
