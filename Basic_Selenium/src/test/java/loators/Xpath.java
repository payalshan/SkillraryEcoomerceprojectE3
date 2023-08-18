package loators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath
{
public static void main(String[] args) throws Throwable
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("payal");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("sanatanu");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[contains(text(),'gotten')]")).click();
    
    
    
}
}
