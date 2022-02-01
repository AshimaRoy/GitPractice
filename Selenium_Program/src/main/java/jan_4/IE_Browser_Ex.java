package jan_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IE_Browser_Ex {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Program\\drivers\\edge\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign in")).click();
		

	}

}
