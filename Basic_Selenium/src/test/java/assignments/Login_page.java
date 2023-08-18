package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_page 
{
public static void main(String[] args) throws Throwable 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("payal");
	
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//a[text()='Login']")).sendKeys("taniya");
	Thread.sleep(10);
	driver.close();
}
}
