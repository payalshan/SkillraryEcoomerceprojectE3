package pom_usage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Fb_Loginpage;

public class Fb_login 
{
public static void main(String[] args)
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	//creating an object for pom class
	Fb_Loginpage fblogin=new Fb_Loginpage(driver);
	fblogin.emailTextFields("payal");
	fblogin.passwordTextFields("mandal");
	fblogin.getLogin();
	driver.close();
	
	
}
}
