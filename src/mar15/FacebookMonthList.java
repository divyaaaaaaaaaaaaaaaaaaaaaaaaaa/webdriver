package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookMonthList {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("create new account")).click();
		Thread.sleep(1000);
		Select monthlist = new Select(driver.findElement(By.name("birthday_month")));
		// get collection of items in month list box
		List<WebElement>all_items = monthlist.getOptions();
		System.out.println("No.of items are ::"+all_items.size());
		for (WebElement each : all_items) {
			Thread.sleep(1000);
			System.out.println(each.getText());
			Thread.sleep(1000);
		}
		driver.quit();
	}

}
