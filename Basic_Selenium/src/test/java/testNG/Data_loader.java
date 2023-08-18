package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_loader 
{
	@org.testng.annotations.DataProvider
	public Object[][] getData()
	{
		Object[][] a=new Object[3][2];
		a[0][0]="adsgfhsg";
		a[0][1]="hhifeihei";
		a[2][0]="adsgfhsg";
		a[2][1]="adsgfhsg";
		return a;
		}
	@Test(dataProvider="getData")
	public void demo(String username,String pwd) 
	{
		WebDriverManager.chromedriver().setup();
	ChromeDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("pass")).sendKeys("dog");
		driver.findElement(By.id("email")).sendKeys("cat");
	}
	}
