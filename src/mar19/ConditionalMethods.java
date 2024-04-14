package mar19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		//verify first name text box is enabled or disabled
		WebElement firstname =driver.findElement(By.name("firstname"));
		Boolean x = firstname.isEnabled();
		System.out.println(x);
		Thread.sleep(1000);
		//verify renter email textbox is displayed or hidden
		WebElement renteremail =driver.findElement(By.name("reg_email_confirmation__"));
		Boolean y = renteremail.isDisplayed();
		System.out.println(y);
		Thread.sleep(1000);
		//verify female radio button is selected or not
		WebElement  radiobutton = driver.findElement(By.xpath("//input[@value='1']"));
		Boolean z = radiobutton.isSelected();
		System.out.println(z);
		Thread.sleep(1000);
		driver.quit();
	}

}
