package aug09;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googlePage {
@FindBy(xpath="//a")
private List<WebElement> allLinks;
public googlePage(WebDriver driver)
{
 PageFactory.initElements(driver,this);

}
public int getSize() {
	return allLinks.size();
}
public void PrintAllLinks() {
	
	for(int i=0;i<allLinks.size();i++)
	{
		String LinkText=allLinks.get(i).getText();
		System.out.println(LinkText);
	}
	
}
}
