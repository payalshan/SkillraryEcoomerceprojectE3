package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_click
{
public static void main(String[] args) throws Throwable 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demoapp.skillrary.com/");
   WebElement course=driver.findElement(By.xpath("//a[@id='course']"));
   Actions a=new Actions(driver);
   a.moveToElement(course).perform();
 driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
 WebElement plus=driver.findElement(By.xpath("//i[@class='fa fa-bars']"));
 a.doubleClick(plus);
 Thread.sleep(3000);
   

}
}
