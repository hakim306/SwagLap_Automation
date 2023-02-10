package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Actions.actions;
import BaseClass.base;

public class CartPage extends base{
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	WebElement itemName;
	
	@FindBy(xpath = "inventory_item_price")
	WebElement itemPrice;
	
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement checkOut_Btn;
	
	
	
	public void Get_itemName() {
		String ItemName=actions.getText(itemName);
		System.out.println(ItemName);
	}
	
	public void Get_Price() {
		String price=actions.getText(itemPrice);
		System.out.println(itemPrice);
	}
	
	public void click_checkout() {
		
		actions.click(checkOut_Btn);
	}

}
