package p1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestLogInPage {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		driver.navigate().refresh();
		unTB.sendKeys("admin");
		
	
//		LogInPage loginPage=new LogInPage(driver);
//		loginPage.setUserName("admin");
//		loginPage.setPassword("manager");
//		loginPage.clickLogin();
		
		
	}

}
