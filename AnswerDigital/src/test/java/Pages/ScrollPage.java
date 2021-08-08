package Pages;

import Com.Constants.ScrollConstants;
import Com.Driver.Action;
import Runner.Base;

public class ScrollPage extends Base {
	public void verifyScroll() throws InterruptedException {
		 Action.clickOnTheElement(ScrollConstants.INFINITESCROLL);
		 Thread.sleep(3000);
	 }
}
