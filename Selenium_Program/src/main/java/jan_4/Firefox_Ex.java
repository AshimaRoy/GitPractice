package jan_4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Ex {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Program\\drivers\\firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Sign in")).click();

	}

}
