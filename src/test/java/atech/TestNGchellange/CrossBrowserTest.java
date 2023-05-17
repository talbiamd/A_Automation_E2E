package atech.TestNGchellange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//by using  trstNg @beforeMehod annotation where digliur how many browser i am using. by applying if ---else condition
//i can run same testcase in  multipul browser by using TeastNg Annotation @beforeMethod
//by using @parameter advance annotation we are passing all t
public class CrossBrowserTest {
	WebDriver driver;
	@BeforeMethod
	@Parameters("Browser") //its a  advance Annotation on TestNg which we can run cross browser testing
	public void OpenApplication(String browser) {//initialization method
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Test will Execute with Chrome Browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			System.out.println("Test will Execute with Edge Browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if (browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Test will Execute with Firefox Browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		
		
		}
		
		
		
		
	
	}
	@Test
	public void getLogin() {
		driver.get("https:www.automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("Login the Application");
	}
	@AfterMethod
	public void getCloseBrowser() {//teardown
		driver.quit();
		System.out.println("Browser lose");
	}
	
}
