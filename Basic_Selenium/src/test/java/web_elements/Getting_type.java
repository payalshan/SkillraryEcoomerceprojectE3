package web_elements;


import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getting_type {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		Point coOrdinate =email.getLocation();
		System.out.println("x and y co ordinates");
		System.out.println(coOrdinate.getX());
		System.out.println(coOrdinate.getY());
		
		org.openqa.selenium.Dimension size= email.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
	     
		
		

	}

}
