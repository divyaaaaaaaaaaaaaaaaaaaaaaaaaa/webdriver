package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngVerify_Title {

	@Test
	public void Titleverification() throws Throwable{
		WebDriver x = new ChromeDriver();
		x.manage().window().maximize();
		x.manage().deleteAllCookies();
		x.get("http://google.com");
		Thread.sleep(2000);
		String expected = "google";
		String actual = x.getTitle();
		 if (expected.equalsIgnoreCase(actual)) 
		 {
			 Reporter.log("Title is matching::"+expected+"         "+actual);
		}
		 else {
			 Reporter.log("Title is not matching"+expected+"         "+actual);
		}
	x.quit();
	}

}
