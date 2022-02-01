package Jan_7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcases2 {
	WebDriver driver;

	@Test
	void search() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("tomato").build().perform();
		Thread.sleep(2000);
	}
	
	@Test
	void doubleClick() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));
		act.moveToElement(search).click().sendKeys("TOMATO").doubleClick().build().perform();
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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	void afterMethod() {
		driver.close();
	}
	
@BeforeTest
	
	void beforeTest() {
		System.out.println("I'm from Before Test");
	}

	@AfterTest
	
	void afterTest() {
		System.out.println("I'm from After Test");
	}
	
	@BeforeSuite
	
	void beforeSuite() {
		System.out.println("I'm from Before Suite");
	}
	
	@AfterSuite
	
	void afterSuite() {
		System.out.println("I'm from After Suite");
	}
}
