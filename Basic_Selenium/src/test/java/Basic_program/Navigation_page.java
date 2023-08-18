package Basic_program;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Navigation_page 
{
public static void main(String[] args) throws Throwable
{
	//manages the drivers
	WebDriverManager.chromedriver().setup();
	//opens the url
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//enters the url
	driver.get("https://www.facebook.com/");
	//wait for 5sec
		Thread.sleep(5000);
		//navigation to another url
	driver.navigate().to("https://www.amazon.com/");
	//wait
	Thread.sleep(5000);//
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.close();
	
}
}
