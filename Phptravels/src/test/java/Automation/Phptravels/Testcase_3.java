package Automation.Phptravels;

import org.testng.annotations.Test;

public class Testcase_3 {
	
	@Test
	public static void Login() throws Exception  {
		Testcase_1.userRegistration();
		Homepage h=new Homepage();
		//h.Launch();
		h.driver.get(h.prop.getProperty("url"));
		h.login();
		Loginpage l1= new Loginpage();
		l1.email1().sendKeys(h.prop.getProperty("email"));
		l1.password1().sendKeys(h.prop.getProperty("password"));
		l1.Lsubmit();
	}

}
