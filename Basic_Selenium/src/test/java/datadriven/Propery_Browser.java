package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Propery_Browser
{
public static void main(String[] args) throws Throwable
{
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
	p.load(fis);
 String url = p.getProperty("url");
 String Brow=p.getProperty("browser");
 WebDriver driver;
 if(Brow.equals("chrome"))
 {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
 }
 else 
 {
	 WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
 }
 
	 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		

}
}
