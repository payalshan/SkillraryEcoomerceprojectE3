package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon
{
public static void main(String[] args) throws Throwable
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	TakesScreenshot ts=(TakesScreenshot) driver;
	//we access the method
File src=	ts.getScreenshotAs(OutputType.FILE);
File Dest= new File("./ScreenShot/amazon.png");
FileUtils.copyFile(src, Dest);
driver.close();


	
}
}
