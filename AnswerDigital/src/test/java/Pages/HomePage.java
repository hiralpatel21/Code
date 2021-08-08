package Pages;

import org.junit.Assert;

import Runner.Base;



public class HomePage extends Base {
	
	public void verifyHomePage() {
		Assert.assertEquals("https://the-internet.herokuapp.com/",driver.getCurrentUrl());
	}
}
