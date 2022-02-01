package dec_23_FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys("ashiroy1710@gmail.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("id_gender2")).click();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Ashi");
		
		driver.findElement(By.id("customer_lastname")).sendKeys("Roy");
		
		driver.findElement(By.id("passwd")).sendKeys("123456");
		
		driver.findElement(By.id("days")).sendKeys("17");
		driver.findElement(By.id("months")).sendKeys("October");
		driver.findElement(By.id("years")).sendKeys("1997");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("firstname")).sendKeys("Ashi");
		driver.findElement(By.id("lastname")).sendKeys("Roy");
		driver.findElement(By.id("company")).sendKeys("Digital Cutlet");
		driver.findElement(By.id("address1")).sendKeys("Chandrapur");
		driver.findElement(By.id("address2")).sendKeys("Hyderabad");
		driver.findElement(By.id("city")).sendKeys("Chandrapur");
		driver.findElement(By.id("id_state")).sendKeys("Florida");
		driver.findElement(By.id("postcode")).sendKeys("44240");
		driver.findElement(By.id("id_country")).sendKeys("United States");
		driver.findElement(By.className("form-control")).sendKeys("hello");
		driver.findElement(By.id("phone")).sendKeys("4424013456");
		driver.findElement(By.id("phone_mobile")).sendKeys("98765442401");
		
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("Durgapur");
		driver.findElement(By.id("submitAccount")).click();
		
		
	}

}
