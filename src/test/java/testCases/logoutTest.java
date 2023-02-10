package testCases;

import org.testng.annotations.Test;

import BaseClass.base;
import Pages.Logout;

public class logoutTest extends base {
	
	@Test
	public static void user_logout() {
		Logout logout=new Logout();
		logout.user_logout();
	}

}
