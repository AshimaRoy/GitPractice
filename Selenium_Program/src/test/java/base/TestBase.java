package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.AboutUs;
import pages.AuthenticationPage;
import pages.ContactusPage;
import pages.CreateAccountPage;
import pages.FooterLinksPage;
import pages.HeaderLinksPage;
import pages.HomePage;
import pages.MyAccountPage;

public class TestBase {
	public WebDriver driver;
	public AboutUs aboutUsObj;
	public AuthenticationPage authObj;
	public ContactusPage contactusObj;
	public CreateAccountPage createAccountObj;
	public FooterLinksPage footerLinksObj;
	public HeaderLinksPage headerLinksObj;
	public HomePage homeObj;
	public MyAccountPage myAccountObj;
	
	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
		aboutUsObj = new AboutUs(driver);
		authObj = new AuthenticationPage(driver);
		contactusObj = new ContactusPage(driver);
		createAccountObj = new CreateAccountPage(driver);
		footerLinksObj = new FooterLinksPage(driver);
		headerLinksObj = new HeaderLinksPage(driver);
		homeObj = new HomePage(driver);
		myAccountObj = new MyAccountPage(driver);	
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
