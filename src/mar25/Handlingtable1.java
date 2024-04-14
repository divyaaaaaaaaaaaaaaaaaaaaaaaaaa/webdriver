package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtable1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(1000);
		//store table into webelement
		WebElement webtable = driver.findElement(By.className("dataTable"));
		List<WebElement>rows,cols;
		//get rows collection from webtable
		rows= webtable.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		Thread.sleep(1000);
		//iterate all rows
		for (WebElement eachrow : rows) {
			//get each row cell collection
			cols = eachrow.findElements(By.tagName("td"));
			//iterate each cell
			for (WebElement eachcell : cols) {
				Thread.sleep(1000);
				//print each cell data
				System.out.println(eachcell.getText());
			}
			System.out.println("================================================");
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
