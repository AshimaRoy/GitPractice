package jan_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTextGetting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("ashimaroy1710@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("12345678");
		driver.findElement(By.id("SubmitLogin")).click();
		
		String errorname = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).getText();
		System.out.println(errorname);
		
		if(errorname.equals("Authentication failed")) {
			System.out.println("Error message displayed sucessfully");
		}else {
			System.out.println("Error message not displayed");
		}

	}

}

