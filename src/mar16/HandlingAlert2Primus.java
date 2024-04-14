package mar16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert2Primus {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com");
		Thread.sleep(1000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
	driver.findElement(By.name("txtPword")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='login']")).click();
	driver.findElement(By.xpath("(//img)[5]")).click();
	driver.findElement(By.xpath("(//img)[11]")).click();
	Thread.sleep(1000);
	String alerttext1 = driver.switchTo().alert().getText();
	System.out.println(alerttext1);
	//click cancel button
	driver.switchTo().alert().dismiss();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//img)[11]")).click();
	Thread.sleep(1000);
	//click ok button
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	String alerttext2 = driver.switchTo().alert().getText();
	System.out.println(alerttext2);
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	driver.quit();
	}

}
