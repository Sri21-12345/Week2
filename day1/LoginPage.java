package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		
	
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://www.facebook.com/");
				driver.manage().window().maximize();
				//title of the page
				String title = driver.getTitle();
				System.out.println(title);
				//username
				driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
				//password
				driver.findElement(By.id("pass")).sendKeys("Tuna@321");
				//login
				driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
	}
				
			
				
				
			}

	

