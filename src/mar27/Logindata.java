package mar27;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Logindata {

	public static void main(String[] args) throws Throwable{
		
		FileReader fr = new FileReader("G:\\logindata.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str = br.readLine())!=null) {
			String login [] = str.split(";");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://orangehrm.qedgetech.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(login[0]);
			driver.findElement(By.name("txtPassword")).sendKeys(login[1]);
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			Thread.sleep(1000);
			String expected = "dashboard";
			String actual = driver.getCurrentUrl();
			if (actual.contains(expected)) 
			{
				System.out.println("login success");
			}
			else 
			{
				System.out.println("login fail");
			}
		driver.quit();
		}
		}
		

	}

