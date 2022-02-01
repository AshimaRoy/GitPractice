package dec_29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement searchBox=driver.findElement(By.id("search_query_top"));
		WebElement searchButton=driver.findElement(By.name("submit_search"));
		
		searchBox.sendKeys("Skirt");
		searchButton.click();
		
		

	}

}
