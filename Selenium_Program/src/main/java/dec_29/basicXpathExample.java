package dec_29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicXpathExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//basic xpath
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("tshirts");
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("women");
		
		driver.findElement(By.xpath("//input[@name='search_query']")).clear();
		
		//and operator
		driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']" )).sendKeys("hi");
		driver.findElement(By.xpath("//input[@name='search_query']")).clear();
		
		//or operator
		driver.findElement(By.xpath("//input[@id='search_query_' or @name='search_query']" )).sendKeys("hello");
		driver.findElement(By.xpath("//input[@name='search_query']")).clear();
		
		//* any tag
		driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("skirt");
		driver.findElement(By.xpath("//input[@name='search_query']")).clear();
		
		//contains
		driver.findElement(By.xpath("//input[contains(@id,'search_query')]")).sendKeys("entered text using contains");
		driver.findElement(By.xpath("//input[@name='search_query']")).clear();
		
		//linked button
		driver.findElement(By.xpath("//a[contains(@title,'Contact us')]")).click();
		driver.findElement(By.xpath("//input[@name='search_query']")).clear();
		
		//starts with
		driver.findElement(By.xpath("//input[starts_with(@id,'search_query')]")).sendKeys("starts with keyword");
		driver.findElement(By.xpath("//input[@name='search_query']")).clear();
		
		//following webelement
		driver.findElement(By.xpath("contains(@title,'Login in to your coustumer account')")).click();
		driver.findElement(By.xpath("input[@id='email']//following::input)[1]")).sendKeys("12345");
		

	}

}
