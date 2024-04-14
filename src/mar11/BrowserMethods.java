package mar11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserMethods {

	public static void main(String[] args) throws Throwable {
		// create instance object
		WebDriver x = new ChromeDriver();
		x.manage().window().maximize();
		x.manage().deleteAllCookies();
		//launch url
		x.get("https://google.com");
		//suspended tool from execution for 5 seconds
	Thread.sleep(5000);
x.quit();
	}

}
