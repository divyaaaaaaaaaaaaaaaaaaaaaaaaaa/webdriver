package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUrl {

	public static void main(String[] args) throws Throwable {
		WebDriver x= new ChromeDriver();
		x.manage().window().maximize();
		x.manage().deleteAllCookies();
		x.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);
		 String expected ="https://";
		 String actual = x.getCurrentUrl();
		 if(actual.startsWith(expected))
		 {
			 System.out.println("url is secure::"+expected+"          "+actual);
		 }
	
		 else {
			System.out.println("url is local::"+expected+"          "+actual);
		}
		 x.quit();
		 }

}
