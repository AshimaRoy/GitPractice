package jan_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingAttributeValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("search_query_top")).sendKeys("T shirts");
		driver.findElement(By.name("submit_search")).click();
		
		String text = driver.findElement(By.id("search_query_top")).getAttribute("value");
		System.out.println(text);
	}

}
