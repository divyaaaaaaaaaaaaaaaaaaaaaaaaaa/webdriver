package mar23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascript {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(1000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(1000);
		js.executeScript("document.querySelector(\"#input-firstname\").value='Arjun'");
		Thread.sleep(1000);
		js.executeScript("document.getElementById('input-lastname').value='Selenium'");
		Thread.sleep(1000);
		js.executeScript("document.getElementById('input-email').value='Test@gmail.com'");
		Thread.sleep(1000);
		js.executeScript("document.queryselector('#input-password').value='Test@!!@$'");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		Thread.sleep(1000);
		js.executeScript("document.querySelector(document.querySelector(\"#form-register > div > div > div > input\").click()");
		Thread.sleep(1000);
		js.executeScript("document.querySelector(document.querySelector(\"button[type='submit']\").click()");
		Thread.sleep(1000);
		driver.quit();


	}

}
