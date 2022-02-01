package jan_5;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddMultipleItemsInBigBasketCaet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		driver.get("http://bigbasket.com/ps/?q=vegetables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String[] vegetables = {"Ladies Finger","Cucumber"};
		 
		List<WebElement> vegetablesList = driver.findElements(By.xpath("//div[@qa='product_name']/a"));
		
		for(int i=0; i<=vegetablesList.size()-1;i++)
		{	
			System.out.println(vegetablesList.get(i).getText());
			List vegList = Arrays.asList(vegetables);
			System.out.println(vegList);
			
			if(vegList.contains(vegetablesList.get(i).getText())) {
				System.out.println("Found:" + vegetablesList.get(i).getText());
				String element = "//a[text='\"+vegetablesList.get(i).getText()+\"']/following::button[@qa=\"add\"][1]";
				System.out.println(element);
				Thread.sleep(3000);
				driver.findElement(By.xpath(element)).click();
			}else {
				System.out.println("Not Found" + vegetablesList.get(i).getText());
			}
		}

	}

}
