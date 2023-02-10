package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;

public class informationPage extends actions {

	public informationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='first-name']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement postalCode;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement continueBtn;
	
	
	public void Set_information_Fields(String fName,String lName, String PostalCode) {
		actions.settext(firstName, fName);
		actions.settext(lastName, lName);
		actions.settext(postalCode, PostalCode);
		actions.click(continueBtn);
	}
}
