package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://amazon.com");
		Thread.sleep(3000);
		//print title of page and length of title
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url and length of url
		String u = driver.getCurrentUrl();
		System.out.println(u);
		System.out.println(u.length());
		driver.quit();
	}

}
