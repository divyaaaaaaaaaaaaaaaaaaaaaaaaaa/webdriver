package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLtbale {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(1000);
		//store table
		WebElement webtable = driver.findElement(By.id("customers"));
		//store 
		List<WebElement>rows,cols;
		//get row collection from webtable
		rows = webtable.findElements(By.tagName("tr"));
		Thread.sleep(1000);
		System.out.println(rows.size()-1);
		Thread.sleep(1000);
		//iterate all rows in a table
		for (WebElement eachrow : rows) {
			//get cell collection in each row
			cols= eachrow.findElements(By.tagName("td"));
			Thread.sleep(1000);
			//iterate each cell
			for (WebElement eachcol : cols) {
				Thread.sleep(1000);
				System.out.println(eachcol.getText());			

			}
			System.out.println("==========================");
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
