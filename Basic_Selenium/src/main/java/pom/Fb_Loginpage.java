package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Loginpage 
{
//Declaration 
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTf;
	
//password test feild
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passTf;
	
//address of login button
	@FindBy(xpath="//button[@name=\"login\"]")
	private WebElement login;
	
//initialization
	
	public Fb_Loginpage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	//getter setter methods

	public WebElement getEmailTf() {
		return emailTf;
	}

	public void setEmailTf(WebElement emailTf) {
		this.emailTf = emailTf;
	}

	public WebElement getPassTf() {
		return passTf;
	}

	public void setPassTf(WebElement passTf) {
		this.passTf = passTf;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
	
//utilization
	
	public void emailTextFields(String data) 
	{
		emailTf.sendKeys(data);
	}
	public void passwordTextFields(String data) 
	{
		passTf.sendKeys(data);
	}
	public void loginButton()
	{
		login.click();
	}
	
	
}
