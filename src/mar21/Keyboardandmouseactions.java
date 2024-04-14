package mar21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Keyboardandmouseactions {

	public static void main(String[] args) throws Throwable {
		//mouse to create account link and click
		//press up arrow for three times
		//click enter key
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com/");
		Thread.sleep(1000);
		//create object for actions class
		Actions ac = new Actions(driver);
		//click on create account
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Create account']")));
		ac.click().build().perform(); 
		Thread.sleep(1000);
		//press arrow up
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		driver.findElement(By.name("firstName")).sendKeys("testing");
		driver.findElement(By.name("lastName")).sendKeys("selenium");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(1000);
		Select listbox = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		List<WebElement>all_items = listbox.getOptions();
		System.out.println(all_items.size());
		for (WebElement each : all_items) {
			System.out.println(each.getText());
		}
		Thread.sleep(1000);
		driver.quit();

	}

}
