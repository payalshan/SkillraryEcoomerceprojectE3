package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation2 
{
WebDriver driver;
@BeforeMethod
public void openApp()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
			
	}
@Test
public void loginn() {
	driver.findElement(By.id("pass"));
	driver.findElement(By.id("email"));
}
@AfterMethod()
public void close()
{
	driver.close();
}
}
