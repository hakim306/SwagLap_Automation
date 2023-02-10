package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;

public class loginPage extends actions {

	
	//page Factory default constructor
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//define elements
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement login_btn;
	
	
	//define actions of homepage.
	
	public void user_login(String username,String password) {
		actions.settext(userName, username);
		actions.settext(Password, password);
		actions.click(login_btn);
	}
	
	/*
	public void set_userName(String username) {
		actions.settext(userName, username);
	}
	
	public void set_password(String password) {
		actions.settext(Password, password);
	}
	
	public void click_loginBtn() {
		actions.click(login_btn);
	}*/
	
	
	
}
