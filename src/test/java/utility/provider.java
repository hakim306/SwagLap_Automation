package utility;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class provider extends excelReader {
	
	@DataProvider(name = "login")
	public Object[][] loginData() throws IOException{
		Object [][] login=getData("Login");
		return login;
	}
	
	@DataProvider(name = "info")
	public Object[][] infoData() throws IOException{
		Object[][] info=getData("Information");
		return info;
	}

}
