package atech.ny.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import atech.ny.basepage.BaseClass;

public class CommonUtill extends BaseClass {

	public static void actionClick( WebElement ele) {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
	}
}
