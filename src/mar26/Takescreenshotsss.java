package mar26;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Takescreenshotsss {

	public static void main(String[] args) throws Throwable   {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		//take screen shot and store
File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//copy screenshot into local system
FileUtils.copyFile(screen, new File("G:/selenium/homepage.png"));
//File dsc =  new File("‪C:\\temp\\homepages.jpg");
//Files.copy(screen,dsc);
	driver.close();
	}

}
