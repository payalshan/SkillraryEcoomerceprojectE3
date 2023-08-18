package web_elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selected_type
{
public static void main(String[] args) throws Throwable
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement radiobtn=driver.findElement(By.xpath("//label[text()='Female']"));
	radiobtn.click();
	Thread.sleep(10);
	if(radiobtn.isSelected())
	{
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	driver.close();
	
}
}
