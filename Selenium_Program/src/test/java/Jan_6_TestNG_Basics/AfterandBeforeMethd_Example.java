package Jan_6_TestNG_Basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AfterandBeforeMethd_Example {
  @Test
  public void f() {
	  System.out.println("Im from Test1");
  }
  
  @Test
  public void f2() {
	  System.out.println("Im from Test2");
  }
  
  @Test
  public void f3() {
	  System.out.println("Im from Test3");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Im from Before Test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Im from After Test");
  }

}
