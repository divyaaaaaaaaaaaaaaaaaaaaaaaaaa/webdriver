package mar16;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox1{

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/PC/Downloads/MultiListboxHtmlpage_lyst8730.html");
		Thread.sleep(1000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		//verify whether the lis box is single or multi selection list box
		Boolean value = dropdown.isMultiple();
		System.out.println(value);
		//select 0 to 8 items
		for (int i=0;i<=8;i++)
		{
			Thread.sleep(1000);
			// select one by one item
			dropdown.selectByIndex(i);
		}
		//deselect from selection
		dropdown.deselectByVisibleText("Yellow");
		Thread.sleep(1000);
		dropdown.deselectByIndex(0);
		Thread.sleep(1000);
		dropdown.deselectAll();
		Thread.sleep(1000);
		driver.quit();
	}

}
