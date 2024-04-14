package mar21;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Righhtclick {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		Actions ac = new Actions(driver);
		//move mouse to gmail link
		ac.moveToElement(driver.findElement(By.linkText("Gmail")));
		ac.contextClick().perform();
		Thread.sleep(1000);
		//create object for robot class
		Robot r = new Robot();
		//press down arrow for two times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		ArrayList<String> win = new ArrayList<String>(driver.getWindowHandles());
		//switch to child window
		driver.switchTo().window(win.get(1));
		Thread.sleep(1000);
		ac.moveToElement(driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]"))).click().perform();
		System.out.println(driver.getTitle());
		driver.close();
		// switch to parent window
		driver.switchTo().window(win.get(0));
		Thread.sleep(1000);
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Images']"))).click().perform();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.quit();
	}

}
