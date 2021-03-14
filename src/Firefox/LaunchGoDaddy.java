package Firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchGoDaddy {

	public static void main(String[] args) throws InterruptedException {

		// execute func
		launchSite();

	}

	public static void launchSite() throws InterruptedException {

		// set property
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");

		// open a new chrome browser
		WebDriver driver = new FirefoxDriver();

		// open firefox browser
		// driver.manage().window().maximize();

		// launch url
		driver.navigate().to("https://www.godaddy.com/");
		
		Thread.sleep(2000);
		
		/*
		 * if (driver.getCurrentUrl() == "https://in.godaddy.com/") {
		 * System.out.println("Test Case 1 passed"); } else {
		 * System.out.println("Test Case 1 failed"); }
		 */

		// browser close
		driver.quit();

	}

}
