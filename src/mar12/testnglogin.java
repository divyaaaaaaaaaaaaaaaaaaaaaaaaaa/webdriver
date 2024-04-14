package mar12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testnglogin {

@Test
public void login(){
		// create instance object
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://primusbank.qedgetech.com/");
		//suspend tool for five seconds
		//Thread.sleep(3000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		//rfThread.sleep(3000);
		//close browser
		driver.quit();
	}

}
