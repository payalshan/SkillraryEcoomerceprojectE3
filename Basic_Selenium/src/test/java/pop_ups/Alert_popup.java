package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_popup 
{
public static void main(String[] args) throws Throwable 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demoapp.skillrary.com/");
	WebElement caurse=driver.findElement(By.id("course"));
	Actions a=new Actions(driver);
	a.moveToElement(caurse).perform();
	driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
	driver.findElement(By.xpath("//button [text()=' Add to Cart']")).click();
	//shifting control to pop up
	//driver.switchTo().alert().accept();
	Alert al=driver.switchTo().alert();
	System.out.println(al.getText());
	
	al.dismiss();
	driver.close();
	
	
	
	
}
}
