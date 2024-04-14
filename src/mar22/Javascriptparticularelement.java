package mar22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptparticularelement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.myntra.com/'");
		String pagetitle =js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.linkText("Men"));
		//scroll to men link and click it
		js.executeScript("document.scrollInToView",element);
		element.click();
		Thread.sleep(5000);
		String pagetitle1 =js.executeScript("return document.title").toString();
		System.out.println(pagetitle1);
		Thread.sleep(5000);
		driver.quit();

	}

}
