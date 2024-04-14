package mar26;


import java.util.List;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calenderorangehrm {	

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com");
		Thread.sleep(1000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[1]//img[1]")).click();
		String leavedate = "2024-Apr-4";
		String seperator[] = leavedate.split("-");
		String year = seperator[0];
		String month = seperator[1];
		String date = seperator[2];
		//select year from calender
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(year);
		Thread.sleep(1000);
		//select month from calender
		new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']"))).selectByVisibleText(month);
		Thread.sleep(1000);
		//select date from calender
		//store the table
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement>rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcol : cols) {
				if(eachcol.getText().equals(date))
				{
					Thread.sleep(1000);
					eachcol.click();
					break;
				}
				

			}

		}
		driver.findElement(By.xpath("//li[2]//img[1]")).click();
		String upto = "2024-Apr-6";
		String temp[] = upto.split("-");
		String y = temp[0];
		String m = temp[1];
		String d = temp[2];
		//select year from calender
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(y);
		Thread.sleep(1000);
		//select month from calender
		new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']"))).selectByVisibleText(m);
		Thread.sleep(1000);
		//select date from calender
		//store the table
		WebElement towebtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement>row,col;
		row = towebtable.findElements(By.tagName("tr"));
		for (WebElement eachrow1 : row) {
			col = eachrow1.findElements(By.tagName("td"));
			for (WebElement eachcol1 : col) 
			{
				if(eachcol1.getText().equals(d))
				{
					eachcol1.click();
					break;
				}

				
			}
		}


		Thread.sleep(1000);
		driver.quit();
}
		}




	
	