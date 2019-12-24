package seleniumsessions;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandlingVideo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	
		
		// Naveen Selenium Video 2: part 3: 
		
		// Alert--POP ups
		// Taking care of this alert is called Alert Handling
		
		// Alerts we get from different webpage. e.g. When we enter a new WebPage, you get an alert saying enter username or password!. 
		// Any alert we get is called : java Screen Popup or Alert. Anything that not part of webpage such as forward or backward button, we can NOT inspect. 
		// Pop ups are also not part of webpage, so they are not web elements. Therefore, we can NOT Inspect
		// Anything that is Not a Web Element, that can not be Inspect to find its source or path
		
		// Remember: ALert is an Interface, Not A class
	
		System.setProperty("webdriver.chrome.driver", "/Users/jawidahmad1/Desktop/Software Testing/selenium-java-files/Selenium InstallersAndPath/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); // It will wait till the website is full loaded then execute the next line of code.
		
		driver.findElement(By.name("proceed")).click(); 
		
		Thread.sleep(5000);	// wait 5 seconds.	// in Main Method above, this: throws InterruptedException: is added because of this line of code.
		
		Alert alert = driver.switchTo().alert();	// Once Pop Up is displayed, it will switches that particular alert.
		
		String text = alert.getText();		// get the text from the particulare alert
		System.out.println(text);	// print on the console 
		
		// validate: 
		
		if(text.equals("Please enter a valid user name")) {System.out.println("Correct Message");} else {System.out.println("Wrong Message");}
		
		alert.accept();	// it will accept the alert: click on OK button.
		
		//alert.dismiss(); // it will dismiss or cancel the alert. It will not accept the alert
		
		
		
		
		driver.navigate().refresh();	// it refresh the page
		
		// Write one utility function (Utility Method) for that alert. or Create a generic function to that particular Alert?
		
		// 35 minutes of video
		
		
		
	
	
	
	
	
	}

}
