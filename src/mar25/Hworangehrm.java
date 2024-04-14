package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hworangehrm {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login'");
		Thread.sleep(500);
		js.executeScript("document.querySelector('#txtUsername').value='Admin'");
		Thread.sleep(500);
		js.executeScript("document.querySelector('#txtPassword').value='Qedge123!@#'");
		Thread.sleep(500);
		js.executeScript("document.querySelector('#btnLogin').click()");
		Thread.sleep(500);
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		Thread.sleep(500);
		//store table
		WebElement webtable = driver.findElement(By.id("resultTable"));
		//store list of elements
		List<WebElement>rows,cols;
		//get row collection from webtable
		rows = webtable.findElements(By.tagName("tr"));
		Thread.sleep(500);
		System.out.println(rows.size()-1);
		Thread.sleep(500);
		//iterate all rows in a table
		for (WebElement eachrow : rows) {
			//get cell collection in each row
			cols= eachrow.findElements(By.tagName("td"));
			Thread.sleep(500);
			//iterate each cell
			for (WebElement eachcol : cols) {
				Thread.sleep(500);
				System.out.println(eachcol.getText());
			}
			System.out.println("===============================");

		}
		Thread.sleep(500);
		driver.quit();

	}
}
