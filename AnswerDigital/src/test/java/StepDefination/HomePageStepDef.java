package StepDefination;

import Pages.HomePage;
import Pages.KeyProsses;
import Pages.Login;
import Pages.ScrollPage;
import Runner.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStepDef extends Base {
	
	HomePage homepageObj= new HomePage();
	Login loginObj= new Login();
	ScrollPage scrollObj= new ScrollPage();
	KeyProsses keyObj= new KeyProsses();
	
	@Given("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
		homepageObj.verifyHomePage();
	}
	@When("^I click on Form Authontication icon$")
	public void i_click_on_Form_Authontication_icon() throws Throwable {
		loginObj.verifyForm();
		}
	@When("^I click on Infinite Scroll icon$")
	public void i_click_on_Infinite_Scroll_icon() throws Throwable {
		scrollObj.verifyScroll();
	}
	
	@When("^I click on key process icon$")
	public void i_click_on_key_process_icon() throws Throwable {
		keyObj.verifyKeyPros();
	}

}
