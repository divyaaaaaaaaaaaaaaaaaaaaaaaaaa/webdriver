package mar16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlert {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(1000);
		//click signin button without login details
		driver.findElement(By.name("proceed")).click();
		String alert_message = driver.switchTo().alert().getText();
		System.out.println(alert_message);
		Thread.sleep(1000);
		//click ok to alert
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.quit();
	}

}
