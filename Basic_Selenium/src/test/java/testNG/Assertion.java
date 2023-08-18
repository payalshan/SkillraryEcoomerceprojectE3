package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion 
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
		String title=driver.getTitle();
		//hard assert
		//Assert.assertEquals(title, "asdhgf");
		//soft assert
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title, "adesfg");
		System.out.println(driver.getCurrentUrl());
	}
	@AfterMethod()
	public void close()
	{
		{
			driver.close();
		}
		}

}
