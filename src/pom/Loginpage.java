package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Base_page{
	
	
	@FindBy(xpath="//input[@id='identifierId']")
	private WebElement txbox;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwbox;
	@FindBy(xpath="//span[.='Next']")
	private WebElement nxt;
	@FindBy(xpath="//span[.='Next']")
	private WebElement nxt1;
	
	public Loginpage(WebDriver driver) {
		super(driver);
	
	}
	public void logintb() throws InterruptedException
	{Thread.sleep(3000);
		txbox.sendKeys("deepthigowdajb@gmail.com");
		nxt.click();
	}
	public void loginpw() throws InterruptedException{
		Thread.sleep(3000);
	pwbox.sendKeys("deepthi301516");
		nxt.click();
	}
	                                 
	

}
