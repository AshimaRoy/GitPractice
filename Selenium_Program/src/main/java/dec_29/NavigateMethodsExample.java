package dec_29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate.to()
		driver.navigate().to("http://automationpractice.com/index.php");
		
		driver.findElement(By.linkText("Contact us")).click();
		Thread.sleep(5000);
		
		//navigate.back()
		driver.navigate().back();
		Thread.sleep(5000);
		
		//navigate.forward()
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("ashimaroy1710@gmail.com");
		driver.findElement(By.id("id_order")).sendKeys("123456");
		Thread.sleep(5000);
		
		//navigate.refresh()
		driver.navigate().refresh();
		
	}

}
