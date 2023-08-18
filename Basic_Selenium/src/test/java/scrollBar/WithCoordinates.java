package scrollBar;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithCoordinates
{
public static void main(String[] args) throws Throwable 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demoapp.skillrary.com/");
	WebElement career=driver.findElement(By.xpath("//a[text()='Career']"));
	org.openqa.selenium.Point point=career.getLocation();
	int x=point.getX();
	int y=point.getY();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	Thread.sleep(5000);
	//career.click();
			js.executeScript("arguments[0].click();",career);
	
	
}
}
