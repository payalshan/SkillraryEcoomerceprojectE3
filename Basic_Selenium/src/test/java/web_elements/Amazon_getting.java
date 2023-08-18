package web_elements;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_getting
{
public static void main(String[] args)
{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	WebElement mobile=(WebElement) driver.findElements(By.xpath("//a[text()='Mobiles']"));
	System.out.println("Attribute"+ mobile.getAttribute("class"));
	System.out.println("attribute:"+mobile.getTagName());
	
}
}
