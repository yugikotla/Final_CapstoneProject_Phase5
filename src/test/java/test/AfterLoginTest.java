package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.AfterLoginPage;
import pages.LoginPage;


public class AfterLoginTest extends Baseclass {

	
	@Parameters({"Email","Password"})
	@Test
	public void afterLogin(String EmailVal,String PasswordVal) {
		AfterLoginPage AfterLogin = new AfterLoginPage();
		AfterLogin.afterlogin(EmailVal, PasswordVal);
		
		
	}

}
