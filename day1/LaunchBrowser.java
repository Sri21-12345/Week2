package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//launch the browser
		
		
				ChromeDriver driver=new ChromeDriver();
				//EdgeDriver driver1=new EdgeDriver();
				//load the url
				driver.get("http://www.facebook.com/");
				driver.manage().window().maximize();
				//title of the page
				String title = driver.getTitle();
				System.out.println(title);
				
				
				
			}

	}

