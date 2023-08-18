package assignments;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondAssignment {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com/");
	WebElement page= driver.findElement(By.xpath("//a[text()='Create a Page']"));
	org.openqa.selenium.Point coordinates=page.getLocation();
	System.out.println(coordinates.getX());
	System.out.println(coordinates.getY());
	System.out.println(page.getAttribute("role"));
	System.out.println(page.getTagName());
 driver.close();	
	 
	
	}

}
