package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyItems {

	public static void main(String[] args) throws Throwable {
		String item_present ="baby";
		Boolean item_exist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
	List<WebElement>all_items =listbox.getOptions();
	System.out.println(all_items.size());
	for (WebElement each : all_items) {
		String actual_items = each.getText();
		Thread.sleep(100);
		System.out.println(actual_items);
		if(actual_items.equalsIgnoreCase(item_present)) {
item_exist =true;
		break;
		
	}
	}
	if(item_exist)
	{
		System.out.println(item_present+"           "+"item exist in list box");
	}
	else {
		System.out.println(item_present+"           "+"item  does not exist in list box");
	}
	Thread.sleep(100);
	driver.quit();
	}
		
		

}
