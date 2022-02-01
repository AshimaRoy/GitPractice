package Jan_7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase1 {
	WebDriver driver;

	@Test
	@Parameters({"veg1"})
	void search(String vegName) throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(vegName).build().perform();
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods = "search")
	@Parameters({"veg2"})
	void doubleClick(String vegName) throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));
		act.moveToElement(search).click().sendKeys(vegName).doubleClick().build().perform();
		Thread.sleep(2000);
		
		act.moveToElement(search).contextClick().build().perform();
	}
	
	@Test
	void onMouse() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement shopBycart = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
		act.moveToElement(shopBycart).build().perform();
		Thread.sleep(2000);
		
		//if(shopBycart.isDisplayed() && shopBycart.isEnabled()) {
			//driver.findElement(By.xpath(("//a[text()='Foodgrains, Oil & Masala'])[2]"))).click();
		//}else {
			//System.out.println("Webelement is not present");
		//}
		
	}
	@BeforeMethod
	void beforeMethod() {
		driver.get("https://www.bigbasket.com/");
	}
	
	@BeforeClass
	void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	void afterClass() {
		driver.close();
	}
}
