package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import base.TestBase;
import log4jTest.Ex_log4jTest;

public class SignInTestcases extends TestBase {
	public Logger log = LogManager.getLogger(Ex_log4jTest.class.getName());
	@Test
	void signInTestcase001() {
		homeObj.getSignInLink().click();
		authObj.setEmailaddressSignIn("ashimaroy1710@.com");
		authObj.setPassword("123456");
		authObj.getSigninbutton().click();
		

		if(myAccountObj.getSignout().isEnabled()) {
			log.info("Successfully logined to account");
		} else {
			log.error("failed to login");
		}
	
	}
}
