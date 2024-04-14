package mar14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngNaviationMethods {

	@Test
	public void navigation() throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://google.com");
		System.out.println("pagetitle[1]"+driver.getTitle());
		Thread.sleep(2000);
		//click gmail link
		driver.findElement(By.linkText("Gmail")).click();
		Reporter.log("page title [2]"+driver.getTitle());
		Thread.sleep(2000);
		//click back button
		driver.navigate().back();
		Reporter.log("page title[3]"+driver.getTitle());
		Thread.sleep(2000);
		//click forward button
		driver.navigate().forward();
		Reporter.log("page title[4]"+driver.getTitle());
		//reload page
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
	}

}
