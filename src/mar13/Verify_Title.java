package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	public static void main(String[] args) throws Throwable {
		WebDriver x = new ChromeDriver();
		x.manage().window().maximize();
		x.manage().deleteAllCookies();
		x.get("http://google.com");
		Thread.sleep(2000);
		String expected = "google";
		String actual = x.getTitle();
		 if (expected.equalsIgnoreCase(actual)) 
		 {
		System.out.println("Title is matching::"+expected+"         "+actual);
		}
		 else {
			System.out.println("Title is not matching"+expected+"         "+actual);
		}
	x.quit();
	}

}
