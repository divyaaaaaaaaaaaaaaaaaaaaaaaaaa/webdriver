package mar14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com");
		Thread.sleep(3000);
		//store user name text box into web element to access more than one web element methods
		WebElement objuser = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		//clear text
		objuser.clear();
		//send value into text box
		objuser.sendKeys("Admin");
		//capture user name value
		String usernametext = objuser.getAttribute("value") ;
		// store password text box into web element to access more than one web element methods
		WebElement objpswd = driver.findElement(By .xpath("//input[@id='txtPassword']"));
		//clear text
		objpswd.clear();
		//send value into text box
		objpswd.sendKeys("Qedge123!@#");
		//capture pswd value
		String passwordtext = objpswd.getAttribute("value");
		System.out.println(usernametext+"    "+passwordtext);
		//click login button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(3000);
		String expected = "dashboard";
		String actual = driver.getCurrentUrl();
		if (actual.contains(expected)) 
		{
			System.out.println("username and passwordd are valid::"+expected+"             "+actual);	
		}
		else {
			// capture error message
			String error_message = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(error_message+"         "+expected+"     "+actual);
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
