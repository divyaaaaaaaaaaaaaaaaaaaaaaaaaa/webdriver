package mar20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingcheckboxes {

	public static void main(String[] args) throws Throwable {
		//get collection of check boxes
		// verify which check box is true and false
		//get each check box name stored into value property
		//uncheck check box if already select and select checkbox if not checked
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/PC/Downloads/checkbox_1_lyst7599.html");
		Thread.sleep(1000);
		List<WebElement>allcheckboxes= driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("no. of checkboxes are::"+allcheckboxes.size());
		for (WebElement each : allcheckboxes) {
			boolean value = each.isSelected();
			String checkboxname = each.getAttribute("value");
			System.out.println(checkboxname+"======="+value);
			Thread.sleep(1000);
			each.click();
		}
		Thread.sleep(1000);
		driver.quit();}

}
