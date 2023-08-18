package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect_skillary
{
public static void main(String[] args) throws Throwable
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demoapp.skillrary.com/");
	WebElement data=driver.findElement(By.xpath("//select[@id='cars']"));
	Select s=new Select(data);
	s.selectByIndex(2);
	Thread.sleep(3000);
	s.selectByValue("199");
	Thread.sleep(3000);
	//s.selectByVisibleText("Free ( 90 ) ");
	Thread.sleep(3000);
	s.deselectByIndex(2);
	Thread.sleep(3000);
	s.deselectByValue("199");
	Thread.sleep(3000);
	//s.deselectByVisibleText("\"Free ( 90 ) \"");
	Thread.sleep(3000);
	//List<WebElement> ele =s.getAllSelectedOptions();
	List<WebElement> ele =s.getAllSelectedOptions();
	
	for(WebElement p:ele) 
	{
		System.out.println(p.getText());
	}
	Thread.sleep(3000);
	driver.close();
	}
	
	
	
	
	
	
}

