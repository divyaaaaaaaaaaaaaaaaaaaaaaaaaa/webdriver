package mar26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Todateleave {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
		Thread.sleep(1000);
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
		WebElement towebtable = driver.findElement(By.className("ui-state-default ui-state-hover"));
		List<WebElement>row,col;
		row = towebtable.findElements(By.tagName("tr"));
		for (WebElement eachrow1 : row) {
			col = eachrow1.findElements(By.tagName("td"));
			for (WebElement eachcol1 : col) {
				if(eachcol1.getText().equals(d))
				{
					Thread.sleep(1000);
					eachcol1.click();
				}

				Thread.sleep(1000);
				driver.quit();
			}
		}




	}

}
