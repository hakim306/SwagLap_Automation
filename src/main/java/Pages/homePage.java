package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Actions.actions;

public class homePage extends actions{
	
	//define constructor.
	public homePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//define elements.
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement bag_AddToCartBtn;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement shoppingCart;
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
	WebElement removeBage_Btn;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	WebElement tshirt_AddToCartBtn;
	
	
	//define actions of loginPage.
	
	public void buy_Bag() {
		actions.click(bag_AddToCartBtn);
		actions.click(shoppingCart);
		//actions.click(removeBage_Btn);
	}
	
	public void buy_tshirt() {
		actions.click(tshirt_AddToCartBtn);
		actions.click(shoppingCart);
		//actions.click(removeBage_Btn);
	}
	
	
	/*
	public void click_bag_AddToCartBtn() {
		actions.click(bag_AddToCartBtn);
	}
	
	public void click_shoppingCart() {
		actions.click(shoppingCart);
	}
	
	public void click_removeBage_Btn() {
		actions.click(removeBage_Btn);
	}*/
	
	

}
