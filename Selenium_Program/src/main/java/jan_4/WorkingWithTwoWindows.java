package jan_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTwoWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver apdriver= new ChromeDriver();
		apdriver.get("http://automationpractice.com/index.php");
		apdriver.manage().window().maximize();
		
		WebDriver bbdriver= new ChromeDriver();
		bbdriver.get("http://bigbasket.com");
		bbdriver.manage().window().maximize();
		
		apdriver.findElement(By.linkText("Sign in")).click();
		
		bbdriver.findElement(By.id("input")).sendKeys("TOMATO");

	}

}
