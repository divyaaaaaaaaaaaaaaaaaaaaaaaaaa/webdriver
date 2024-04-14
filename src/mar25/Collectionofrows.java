package mar25;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionofrows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(1000);
		//store table into webelement
		WebElement webtable = driver.findElement(By.className("dataTable"));
		//get collection of rows in webtable
		List<WebElement>rows = webtable.findElements(By.tagName("tr"));
		int row =rows.size()-1;
		System.out.println(row);
		// iterate all rows
		for(int i=1;i<rows.size();i++)
		{
			//get cell column from each row
			List<WebElement>cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("row no."+i+"       "+"column size::"+cols.size());
		}
		driver.quit();

	}

}
