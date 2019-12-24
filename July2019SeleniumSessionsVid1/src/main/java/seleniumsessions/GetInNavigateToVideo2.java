package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetInNavigateToVideo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		// Naveen Selenium Video 2: part 2: 
		
		
		// What is the difference between:  driver.get(); and driver.navigate().to(); ?
	
		System.setProperty("webdriver.chrome.driver", "/Users/jawidahmad1/Desktop/Software Testing/selenium-java-files/Selenium InstallersAndPath/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/"); // It will wait till the website is full loaded then execute the next line of code.
		
		driver.navigate().to("https://www.google.com/"); // the minute it gets its title, it will not wait for the page to be fully loaded, it will execute the next line of code.
		
		/*  driver.get(); is better for launching heavy loaded pages, but driver.navigate().to(); is good for simple and not heavy websites.
		 for the sake of speed, it is preferred to use driver.navigate().to(); otherwise, driver.get.
		 driver.navigate is also good when using back and forward methods.
		
		*
		* Remember both river.get(); and driver.navigate().to(); launches url.
		*
		*/
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		
		driver.navigate().refresh();	// it referesh the page
		
		
		
		// END: Video 2: Part 2 
	
	
	
	
	}

}
