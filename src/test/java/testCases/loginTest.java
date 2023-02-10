package testCases;

import org.testng.annotations.Test;

import BaseClass.base;
import Pages.loginPage;
import utility.excelReader;
import utility.provider;

public class loginTest extends base {
	
	@Test(dataProvider = "login",dataProviderClass =provider.class)
	
	public static void loginTest(String userName, String password) throws InterruptedException {
		loginPage loginPage=new loginPage();
		loginPage.user_login(userName, password);
		Thread.sleep(2000);
	}

}
