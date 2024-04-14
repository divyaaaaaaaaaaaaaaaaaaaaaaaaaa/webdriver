package mar28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebookdemo {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//create object for webdriver wait class
	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(20));
	//wait until element is clickable
	mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account")));
	driver.findElement(By.linkText("Create new account")).click();
//wait until element is visible
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
	driver.findElement(By.name("firstname")).sendKeys("testing");
	//wait until element is visible
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")));
	driver.findElement(By.name("lastname")).sendKeys("manual");
	mywait.until(ExpectedConditions.elementToBeSelected(By.id("year")));
	new Select(driver.findElement(By.id("year"))).selectByIndex(3);
	}

}
