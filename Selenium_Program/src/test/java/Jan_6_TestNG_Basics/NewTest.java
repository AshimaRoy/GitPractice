package Jan_6_TestNG_Basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Im from Test");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Im from Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Im from After Class");
  }

}
