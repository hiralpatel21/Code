package Com.Driver;

import org.openqa.selenium.By;

import Runner.Base;

public class Action extends Base {

	public static void clickOnTheElement(By elementName) {
		driver.findElement(elementName).click();
	}
	public static void login(By Elementname, String login) {
		driver.findElement(Elementname).clear();
		driver.findElement(Elementname).sendKeys(login);
		}
}
