package mar18;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		//get parent id
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		//click three links with different paths
		driver.findElement(By.xpath("(//a[contains(text(),'Terms')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("privacy-link")).click();
		driver.findElement(By.linkText("Cookies Policy")).click();
		// get collection of all window ids
		Set<String> allwinids =driver.getWindowHandles();
		System.out.println(allwinids);
		for (String each : allwinids) {
			//if parent id not equals to each since here which are not same id only getting 
			if (!parentid.equals(each)) {
				//switch to child window and get title and close 
				String pagetitle = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(3000);
				
				driver.close();
				
			}
		}
		//switch to parent window
		driver.switchTo().window(parentid);
		Select element = new Select(driver.findElement(By.id("month")));
		List<WebElement> all_items = element.getOptions();
		System.out.println("No.of items are"+all_items.size());
		for (WebElement each : all_items) {
			System.out.println(each.getText());
			Thread.sleep(3000);
		}
		driver.quit();
	}

}
