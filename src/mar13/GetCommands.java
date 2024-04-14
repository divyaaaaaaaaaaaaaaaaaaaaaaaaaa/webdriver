package mar13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) throws Throwable {
		WebDriver x = new ChromeDriver();
		x.manage().window().maximize();
		x.manage().deleteAllCookies();
		x.get("https://google.com");
		Thread.sleep(3000);
		//print gmail text
		String gmailtext = x.findElement(By.linkText("Gmail")).getText();
		System.out.println(gmailtext);
		//print gmail url
		String url = x.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(url);
		x.quit();



	}

}
