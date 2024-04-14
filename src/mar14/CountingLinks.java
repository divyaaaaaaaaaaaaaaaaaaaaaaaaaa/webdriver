package mar14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rediff.com/");
Thread.sleep(2000);
//get collection of links in web page which are stored into html tag a
List<WebElement> all_links = driver.findElements(By.tagName("a"));
System.out.println("No.of links are::"+all_links.size());
Thread.sleep(500);
//print each link name
for (WebElement each : all_links) {
	System.out.println(each.getText());
	Thread.sleep(500);
} 
driver.quit();
	}
}