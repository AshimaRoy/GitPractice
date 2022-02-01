package dec_29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethodsExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//getTitle
		String titleofthewindow = driver.getTitle();
		System.out.println(titleofthewindow);
		
		//getCurrentURL
		String urlofthepage = driver.getCurrentUrl();
		System.out.println(urlofthepage);
		
		//getPageSource
		String pagesourceofwebpage = driver.getPageSource();
		System.out.println(pagesourceofwebpage);
	}

}
