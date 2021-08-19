package p1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	
	public LogInPage(WebDriver driver)
	{
		unTB=driver.findElement(By.id("username"));
		pwTB=driver.findElement(By.name("pwd"));
		loginBTN=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	
	
	
	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
		
	}
	
	public void setPassword(String psw)
	{
		
		pwTB.sendKeys(psw);
	}
	public void clickLogin()
	{
		loginBTN.click();
	}
}

