package mar15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingItems {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		//store three list boxes into select class
		Select daylistbox = new Select(driver.findElement(By.name("birthday_day")));
		Select monthlistbox = new Select(driver.findElement(By.name("birthday_month")));
		Select yearlistbox = new Select(driver.findElement(By.name("birthday_year")));
		//verify whether the list box is single or multi selection
		boolean value = daylistbox.isMultiple();
		System.out.println(value);
		// select items in list box
		daylistbox.selectByIndex(9);
		Thread.sleep(2000);
		monthlistbox.selectByVisibleText("Oct");
		Thread.sleep(2000);
		yearlistbox.selectByVisibleText("1992");
		Thread.sleep(2000);
		driver.quit();
		 
		
		

	}

}
