package mar19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(1000);
		//verify check box is selected or not
		WebElement checkbox = driver.findElement(By.name("remember"));
		Boolean isselected = checkbox.isSelected();
		System.out.println(isselected);
		Thread.sleep(1000);
		if (isselected) {
			//if value is true uncheck check box
			checkbox.click();
		} else {
			//if value it is false check the check box
			checkbox.click();
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
