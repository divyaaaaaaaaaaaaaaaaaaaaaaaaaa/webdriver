package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngFacebookdaylist {

	@Test
	public void daylist() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		Select daylistbox = new Select(driver.findElement(By.name("birthday_day")));
		// get collection of items in day list box
		List<WebElement> all_items = daylistbox.getOptions();
		Reporter.log("No.of items are::"+all_items.size());
		for (WebElement each : all_items) {
			Thread.sleep(100);
			Reporter.log(each.getText());
			Thread.sleep(100);

		}
		driver.quit();
	}
}
