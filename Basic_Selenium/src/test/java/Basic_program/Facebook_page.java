package Basic_program;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_page 
{
public static void main(String[] args) throws Throwable
{
	//Managing driver
	WebDriverManager.chromedriver().setup();
	//opening the empty browser
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(2000);
	driver.close();
	
}
}
