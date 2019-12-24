package seleniumsessions;

public class UtilVideo2 {

	public static final int DEFAULT_EXP_WAIT = 15; 
		// TODO Auto-generated method stub

		// Utility method: Selenium Video 2
		
		// Write one utility function (Utility Method): 
		//Utility Method created can be called by any class inside this package
	    
		
		// Once you created Utility method, go to Create a new class called AlertTest and test the methods created here!
		

		/**
		 * This method is used to handle alert and it will return alert text
		 * 
		 * @param driver
		 * @return text
		 */
		public static String getAlertText(WebDriver driver) {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println(text);
			alert.accept();
			return text;
		}

		/**
		 * get the title of the page
		 * 
		 * @param driver
		 * @return title of the page
		 */
		public static String getPageTitle(WebDriver driver) {
			return driver.getTitle();
		}

		/**
		 * launch the url
		 * 
		 * @param driver
		 * @param url
		 */
		public static void launchUrl(WebDriver driver, String url) {
			driver.get(url);
		}

		/**
		 * this is used to launch the browser
		 * 
		 * @param driver
		 * @param browserName
		 */
		public static WebDriver launchBrowser(WebDriver driver, String browserName) {
			if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
				driver = new ChromeDriver();
			} else if (browserName.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "/Users/NaveenKhunteta/Downloads/geckodriver");
				driver = new FirefoxDriver();
			} else {
				System.out.println("browser name is not correct :" + browserName);
			}
			
			return driver;  // return driver back
		}

		/**
		 * click on element
		 * 
		 * @param driver
		 * @param locator
		 */
		public static void doClick(WebDriver driver, By locator) {
			driver.findElement(locator).click();
		}

		/**
		 * quit the browser
		 * 
		 * @param driver
		 */
		public static void closeBrowser(WebDriver driver) {
			driver.quit();
		}
		
		/**
		 * 
		 * @param driver
		 * @param locator
		 * @return
		 */
		public static WebElement getElement(WebDriver driver, By locator, int timeout){
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
			WebElement element = driver.findElement(locator);
			JavaScriptUtil.flash(element, driver);
			return element;
		
		
	
	}

}
