package loators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagName_locators 
{
public static void main(String[] args)
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	List<WebElement>links=driver.findElements(By.tagName("a"));
	for(WebElement allLinks:links) 
	{
		System.out.println(allLinks.getText());
	}
	
}
}
