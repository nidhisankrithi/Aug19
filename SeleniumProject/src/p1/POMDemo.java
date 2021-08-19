package p1;



import org.openqa.selenium.By;

/*POM-Page Object Model
 * why do we use it---to handle SERE
 * 3 steps? Declaration ,initi,,utiliz..
 * How do u declare element in POM class? @FindBY
 * How do u initilaize element in POM class?  PF.init...
 * How do u utilize the element ---using get/set methods
 * can we run POM class directly? NO
 * why? no main method (we dont write main method in POM)
 * we write main method in diff class---Test class(Runner class)
 * 
 * in which class we store the element-POM class- Element Repository class
 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//POM class
public class POMDemo {

	@FindBy(id="username") private WebElement unTB;
	@FindBy(name="pwd") private WebElement pwTB;
	@FindBy(xpath="//div[text()='Login ']") private WebElement loginBTN;
	@FindBy(xpath="//span[contains(text(),'invalid')]") private WebElement errMsg;
	
	
	public POMDemo(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setUN(String un) {
		unTB.sendKeys(un);
		
	}
	public void setPassword(String psw)
	{
		
		pwTB .sendKeys(psw);
	}
	public void clickLogin()
	{
		loginBTN.click();
	}
	public void verifyErrDispalyed(WebDriver driver){
		System.out.println(errMsg.isDisplayed());
	}
}
