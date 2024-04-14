package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngValidateUrl {

	@Test
	public void validation() throws Throwable{
		WebDriver x= new ChromeDriver();
		x.manage().window().maximize();
		x.manage().deleteAllCookies();
		x.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);
		 String expected ="https://";
		 String actual = x.getCurrentUrl();
		 if(actual.startsWith(expected))
		 {
			 Reporter.log("url is secure::"+expected+"          "+actual);
		 }
	
		 else {
			 Reporter.log("url is local::"+expected+"          "+actual);
		}
		 x.quit();
		 }

}
