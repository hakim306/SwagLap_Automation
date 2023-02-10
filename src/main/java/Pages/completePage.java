package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;

public class completePage extends actions {
	
	public completePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[@class='complete-header']")
	WebElement thnxMessage;
	
	@FindBy(xpath = "//button[@id='back-to-products']")
	WebElement backHome;
	
	
	
	public void Click_backHome() {
		actions.click(backHome);
	}

}
