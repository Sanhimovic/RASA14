package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class implements Framework_Constants
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	@AfterMethod
	public void closeapp(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Generic_Photo.getPhoto(driver);
		}
		driver.close();
	}
}
