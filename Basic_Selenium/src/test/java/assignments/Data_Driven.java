package assignments;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Driven
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
		    WebElement email=driver.findElement(By.id("email"));
			email.sendKeys("username");
			WebElement pass= driver.findElement(By.id("pass"));
			 pass.sendKeys("password");
			 Thread.sleep(2000);
			 driver.close();
			

	}
	}


