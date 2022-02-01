package jan_4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingInChildWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		System.out.println(driver.getTitle());
		
		String mainwindow = driver.getWindowHandle();
		System.out.println("Main window is" + mainwindow);
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("All Windows are" + allWindows);
		
		Iterator<String> it = allWindows.iterator();
		 while(it.hasNext()) {
			 String windowName = it.next();
			 
			 if(!mainwindow.equalsIgnoreCase(windowName)) {
				 driver.switchTo().window(windowName);
				 System.out.println("Title>" + driver.getTitle());
			 }
		 }

	}

}
