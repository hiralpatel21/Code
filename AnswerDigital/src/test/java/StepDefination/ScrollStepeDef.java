package StepDefination;

import Pages.ScrollPage;
import Runner.Base;
import cucumber.api.java.en.Then;

public class ScrollStepeDef extends Base {
	
	ScrollPage scrollObj= new ScrollPage();
	@Then("^I should see the new scroll page$")
	public void i_should_see_the_new_scroll_page() throws Throwable {
		scrollObj.verifyScroll();
	}

}
