package mar19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbradiobuttonshw {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		//get parent id
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		//get collection of radio buttons
		List<WebElement> radios = driver.findElements(By.className("_58mt"));
		System.out.println("no.of radio buttons are"+radios.size());
		Thread.sleep(1000);
		for (WebElement each : radios) {
			System.out.println(each.getText());
			
	}
driver.quit();
}
}
