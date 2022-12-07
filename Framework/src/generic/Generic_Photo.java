package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_Photo 
{
	public static void getPhoto(WebDriver driver) throws IOException
	{
		String photo="./photo/";
		Date d=new Date();
		String date = d.toString().replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+date+".jpeg");
		FileHandler.copy(src, dst);
	}
}
