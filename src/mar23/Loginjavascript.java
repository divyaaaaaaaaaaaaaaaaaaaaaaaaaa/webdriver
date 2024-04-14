package mar23;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginjavascript {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login'");
		Thread.sleep(1000);
		js.executeScript("document.querySelector('#txtUsername').value='Admin'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('#txtPassword').value='Qedge123!@#'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('#btnLogin').click()");
		Thread.sleep(1000);
		String expected = "dashboard";
		String actual = js.executeScript("return document.URL").toString();
		if (actual.contains(expected))
		{
			System.out.println("login success::"+expected+"==========="+actual);
		} else {
			String error = js.executeScript("return document.queryselector('#spanMessage').innerHTML").toString();
			System.out.println(error+"            "+expected+"========="+actual);

		}
		Thread.sleep(1000);
		driver.quit();
	}

}
