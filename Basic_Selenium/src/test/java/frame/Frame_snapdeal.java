package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_snapdeal {

	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		WebElement sign=driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a=new Actions(driver);
		a.moveToElement(sign).perform();
		driver.findElement(By.xpath("//span[text()='Register'][1]")).click();
		//handling through index
		//driver.switchTo().frame(0);
		//handling through id
		driver.switchTo().frame("loginIframe");
		//handling through frame name
		//driver.switchTo().frame("iframeLogin");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("Payal");
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
		//shifting control to noramal webpage
		driver.switchTo().defaultContent();
		
		
		
	}

}
