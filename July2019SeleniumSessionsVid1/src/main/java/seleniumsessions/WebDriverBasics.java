package seleniumsessions;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Selenium: It is Open Source: It automates your browser: whatever you do with this power, it's up to you. You can not only test browser elements, but you can automate many job related task as well.
		// All major browsers support Selenium: such as Chrome, FireFox, Opera, Internet Explorer, Safari . . .
	
	 
		// WebDriver: is an Interface. All other Driver Class (such as chrome driver, firefox driver, safari driver ... ) is implementing WebDriver Interface
		// For every browser, a driver class is available. You can't create object of an Interface. We can't create an object of webdriver either. 
		// can we create object of chrome driver? Yes. Chrome driver is a child class of Interface.
		// Therefore, we can access method of chrome driver, by ...
		
		// 1. set property
		
		System.setProperty("webdriver.chrome.driver", "/Users/jawidahmad1/Desktop/Software Testing/selenium-java-files/Selenium InstallersAndPath/Drivers/chromedriver");
		
		// 2. Launch Chrome browser
		
		WebDriver driver = new ChromeDriver();	// driver name should match with below methed name.
		
		// 3. Open google in chrome browser
		
		driver.get("https://www.google.com"); 	// method name ("driver") should match with above WebDriver object's name.
		
		

		
		
		String title = driver.getTitle();	// it gets the title
		
		System.out.println(title);
		
		// The browser it the above codes open is not actual browser, but a replica of the system browser. Therefore, it doesn't have any History or other information.
		
		
		// 4. validation point: act vs exp
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		
		if(actualTitle.equals(expectedTitle)){
			System.out.println("title is correct");
		} else {
			System.out.println("title is not correct");
			}
		
		
		// Validation point different way:  // Validation is the most important part of this section
		
		if(actualTitle.equals("Google")) {System.out.println("title is correct");}
		else {System.out.println("title is wrong");}
		
		// 5. close browser
		 
		
		// driver.close(); 				activation of this code will browser
		
		
		// The above code from 1. to 5. is a complete Test Case. That you followed all the instruction properly and executed your codes accordingly .
		
		// Remember: Validation is the most import par
		
		
		// 6. driver.quit();				// close the browser// This Should be used only at the end of the program. After everything is done. Because, after quite, any other code you write, java will not run it.
		
		
		// Remember quite(); method should be at the END of program. At After quite you may start a new line of code, but it will not be associated with above codes. e.g. you may create a totally new object with new methods, not relevant to above codes.
		
		/* 
		 
		 What is the exact difference between quite(); and close(); methods in technical terms?
		
		 If you use quit(); session id will be (null);
		 if you use close(); session id will be there, but it will be expired.// if you write this session, you will get NoSuchSessionIdException
		
		*/
		
		// But in reality, you can't do anything after quit(); and close();
		// quit(); close all browsers in case of multiple browsers; while close(); close only one browser which is above code of close method.
		
		// You may have three browsers open, if you want to close all of them, you just use quite(); method, if you want to close two of them, you write one close(); for each of the two.
		
		
		// END: Video 1
		
		
		// Selenium Video 2:
		
		
		/*
		 
		 1. get current url
		 2. get pagesource
		 
		  
		 */
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		
		
		
		// System.out.println(driver.getPageSource()); 			// Activation of this will get the page source code.
		
		// You can write the above method differently as well.
		
		
	}

}
