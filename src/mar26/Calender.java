package mar26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws Throwable {
		String  dob ="October/10/1992";
		String temp[] = dob.split("/");
		String date =temp[1];
		String month = temp[0];
		String year = temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(500);
		String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calyear.equals(year))
		{
			//click on previous button
			driver.findElement(By.xpath("//span[normalize-space()='Prev']")).click();
			calyear = driver.findElement(By.className("ui-datepicker-year")).getText();	
		}
		String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calmonth.equalsIgnoreCase(month))
		{
			//click previous button
			driver.findElement(By.xpath("//span[normalize-space()='Prev']")).click();
			calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();

		}
		//store table
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement>rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcol : cols) {
				eachcol.findElements(By.tagName("td"));
				if(eachcol.getText().equals(date))
				{
					Thread.sleep(500);
					//click date
					eachcol.click();

				}
			}
			driver.close();
		}

	}

}
