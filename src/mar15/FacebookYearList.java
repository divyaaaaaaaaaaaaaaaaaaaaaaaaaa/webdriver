package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookYearList {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		Select yearlistbox = new Select(driver.findElement(By.name("birthday_year")));
		//get collection of items in list box
		List<WebElement>all_itemslist = yearlistbox.getOptions();
		System.out.println("no. of items are::"+all_itemslist.size());
		for (WebElement each : all_itemslist) {
			Thread.sleep(1000);
			System.out.println(each.getText());
			Thread.sleep(1000);

		}
		driver.quit();

	}

}
