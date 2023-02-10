package testCases;

import org.testng.annotations.Test;

import BaseClass.base;
import Pages.CartPage;
import Pages.completePage;
import Pages.homePage;
import Pages.informationPage;
import Pages.overViewPage;
import utility.provider;

public class buyProduct extends base {
	
	@Test(priority = 1,dataProvider = "info",dataProviderClass = provider.class)
	public static void buy_bag(String fname, String lName,String password) throws InterruptedException {
		homePage homePage=new homePage();
		homePage.buy_Bag();
		Thread.sleep(2000);
		CartPage cartPage=new CartPage();
		cartPage.click_checkout();
		Thread.sleep(2000);
		informationPage informationPage=new informationPage();
		informationPage.Set_information_Fields(fname, lName, password);
		Thread.sleep(2000);
		overViewPage overViewPage=new overViewPage();
		overViewPage.click_finishBtn();
		Thread.sleep(2000);
		completePage completePage=new completePage();
		completePage.Click_backHome();
	}
	
	@Test(priority = 2)
	public static void buy_Tsshirt() throws InterruptedException {
		homePage homePage=new homePage();
		homePage.buy_tshirt();
		Thread.sleep(2000);
		CartPage cartPage=new CartPage();
		cartPage.click_checkout();
		Thread.sleep(2000);
		informationPage informationPage=new informationPage();
		informationPage.Set_information_Fields("mohamed", "hakim", "012");
		Thread.sleep(2000);
		overViewPage overViewPage=new overViewPage();
		overViewPage.click_finishBtn();
		Thread.sleep(2000);
		completePage completePage=new completePage();
		completePage.Click_backHome();
	}

}
