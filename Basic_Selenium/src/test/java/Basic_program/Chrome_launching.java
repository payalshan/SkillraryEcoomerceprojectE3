package Basic_program;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_launching 
{
public static void main(String[] args)
{
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver=new ChromeDriver();
}
}
