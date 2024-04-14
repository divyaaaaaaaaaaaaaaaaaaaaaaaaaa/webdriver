package mar13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngGetCommands {

	@Test
	public void commands() throws Throwable{
		WebDriver x = new ChromeDriver();
		x.manage().window().maximize();
		x.manage().deleteAllCookies();
		x.get("https://google.com");
		Thread.sleep(3000);
		//print gmail text
		String gmailtext = x.findElement(By.linkText("Gmail")).getText();
		Reporter.log(gmailtext);
		//print gmail url
		String url = x.findElement(By.linkText("Gmail")).getAttribute("href");
		Reporter.log(url);
		x.quit();



	}

}
