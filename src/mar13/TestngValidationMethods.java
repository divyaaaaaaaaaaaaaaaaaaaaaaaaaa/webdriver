package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngValidationMethods {

	@Test
	public void validmethods() throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://amazon.com");
		Thread.sleep(3000);
		//print title of page and length of title
		String pagetitle = driver.getTitle();
		Reporter.log(pagetitle);
		Reporter.log("page length::"+pagetitle.length());
		//print url and length of url
		String u = driver.getCurrentUrl();
		Reporter.log(u);
		Reporter.log("domain name::"+u.length());
		driver.quit();
	}

}
