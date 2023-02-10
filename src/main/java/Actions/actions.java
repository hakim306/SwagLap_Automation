package Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;

import BaseClass.base;


public class actions extends base {
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void settext(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static boolean isElementPresent(WebElement element) {
		
			if (element.isDisplayed()) {
				return true;
			}else {
				return false;
			}
		}
	
	public static void mouseOver(WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	public static void moveToElementClick(WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
	
	public static String  getText(WebElement element) {
		String text=element.getText();
		return text;
	}

}
