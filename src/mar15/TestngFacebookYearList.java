package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngFacebookYearList {

	@Test
	public void yearlist() throws Throwable
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		Select yearlistbox = new Select(driver.findElement(By.name("birthday_year")));
		//get collection of items in list box
		List<WebElement>all_itemslist = yearlistbox.getOptions();
		Reporter.log("no. of items are::"+all_itemslist.size());
		for (WebElement each : all_itemslist) {
			Thread.sleep(1000);
			Reporter.log(each.getText());
			Thread.sleep(1000);

		}
		driver.quit();

	}

}
