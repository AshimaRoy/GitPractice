package jan_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSexecutor_Ex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("input")).sendKeys("TOMATO");
		
		//javascript execution
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String exe = "return document.getElementById(\"input\").value";
		
		String value = (String)js.executeScript(exe);
		
		System.out.println(value);

	}

}
