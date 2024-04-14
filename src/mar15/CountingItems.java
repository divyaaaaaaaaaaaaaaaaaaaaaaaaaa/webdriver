package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountingItems {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
	Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
	// get collection of items in list box
	List<WebElement> all_items = listbox.getOptions();
	System.out.println("No.of items are::"+all_items.size());
	for (WebElement each : all_items) {
		Thread.sleep(100);
		System.out.println(each.getText());
		Thread.sleep(100);
		
	}
	driver.quit();
	
	
	
	
	}

}
