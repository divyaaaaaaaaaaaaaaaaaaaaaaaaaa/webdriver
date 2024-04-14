package mar18;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcHw {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		//get parent id
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		Thread.sleep(1000);
		//get three links 
		driver.findElement(By.xpath("//a[@aria-label='Flight opens a new window']//label[contains(text(),'FLIGHTS')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='stayIcon']//a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='railDrishti fa fa-line-chart']")).click();
		Thread.sleep(1000);
		//get collection of all window ids
		Set<String> allwinids = driver.getWindowHandles();
		System.out.println(allwinids);
		for (String each : allwinids) {
			//if parent ids not equal to child ids
			if (!parentid.equals(each)) {
				//switch to child window and get title and close
				String pagetitle = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(1000);
				driver.close();

			}
		}
		//return to parent window
		driver.switchTo().window(parentid);
		Thread.sleep(1000);
		driver.quit();

	}

}
