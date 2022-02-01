package jan_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextFromWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("ashimaroy1710@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.id("SubmitLogin")).click();
		
		String username = driver.findElement(By.xpath("//a[@class='account']/span")).getText();
		System.out.println(username);
		
		if(username.equals("Ashima Roy")) {
			System.out.println("Logged in sucessfully");
		}else {
			System.out.println("User not logged in");
		}

	}

}
