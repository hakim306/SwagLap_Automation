package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;

public class overViewPage extends actions {
	
	public overViewPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='finish']")
	WebElement finishBtn;
	
	public void click_finishBtn() {
		actions.click(finishBtn);
	}

}
