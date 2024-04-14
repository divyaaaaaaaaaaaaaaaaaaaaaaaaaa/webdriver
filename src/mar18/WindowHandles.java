package mar18;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		//click three links with different paths
				driver.findElement(By.xpath("(//a[contains(text(),'Terms')])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("privacy-link")).click();
				Thread.sleep(1000);
				driver.findElement(By.linkText("Cookies Policy")).click();
				Thread.sleep(1000);
				//store all windows into array list
				ArrayList<String> allwindows = new ArrayList<String>(driver.getWindowHandles());
				Thread.sleep(1000);
				driver.switchTo().window(allwindows.get(0));
				System.out.println(driver.getTitle());
				driver.findElement(By.name("email")).sendKeys("junnuminnu@gmail.com");
				driver.findElement(By.name("pass")).sendKeys("9154632187");
				driver.findElement(By.xpath("//input[@value='Log in']")).sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				driver.quit();
	}

}
