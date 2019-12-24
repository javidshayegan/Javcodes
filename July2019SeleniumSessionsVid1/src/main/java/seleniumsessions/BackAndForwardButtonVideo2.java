package seleniumsessions;

import java.util.NavigableMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwardButtonVideo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Naveen Selenium Video 2: 
		
		// Back and Forward Button of browser:
		
		// You open, multiple website, and go forward and backward in those pages. 
		

		System.setProperty("webdriver.chrome.driver", "/Users/jawidahmad1/Desktop/Software Testing/selenium-java-files/Selenium InstallersAndPath/Drivers/chromedriver");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		// navigate from google to Amazon:
		
		driver.navigate().to("https://www.amazon.com/");
		
		/* Different way: with the help of creating an object.
		
		
		Navigation nav = driver.navigate();
		nav.back();
		*/
		
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		
		// What is the difference between:  driver.get(); and driver.navigate().to(); ?
		
		
		// Create a new class called; GetInNavigateTo!
		
		
		
		
		
		
	}

}
