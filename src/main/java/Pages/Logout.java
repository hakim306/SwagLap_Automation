package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;

public class Logout extends actions {
	
	public Logout() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	WebElement menuBtn;
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement logout;
	
	
	public void user_logout() {
		actions.click(menuBtn);
		actions.click(logout);
	}

}
