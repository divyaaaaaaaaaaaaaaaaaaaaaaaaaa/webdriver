package mar22;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptscroll {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.myntra.com/'");
		Thread.sleep(1000);
		//scroll top to bottom vertically
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		//scroll bottom to top vertically
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(1000);
		//scroll  to certain pixel vertically
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		driver.quit();

	}

}
