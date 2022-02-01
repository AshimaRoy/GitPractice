package Jan_7;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BeforeTestandAfterTest_Ex {
	@BeforeTest
	
	void beforeTest() {
		System.out.println("I'm from Before Test");
	}

	@AfterTest
	
	void afterTest() {
		System.out.println("I'm from After Test");
	}
}
