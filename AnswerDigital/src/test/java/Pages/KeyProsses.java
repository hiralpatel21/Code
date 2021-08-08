package Pages;

import Com.Constants.KeyProsConstants;
import Com.Driver.Action;
import Runner.Base;

public class KeyProsses extends Base {
	public void verifyKeyPros() throws InterruptedException {
		 Action.clickOnTheElement(KeyProsConstants.KEYPROSSES);
		 Thread.sleep(3000);
}
}