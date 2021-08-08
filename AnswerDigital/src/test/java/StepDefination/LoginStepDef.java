package StepDefination;

import Pages.Login;
import Runner.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends Base{
	
	Login loginObj= new Login();
	
	

	@When("^I enter valid Usename and invalid password for login$")
	public void i_enter_valid_Usename_and_invalid_password_for_login(DataTable userData) throws Throwable {
		loginObj.verifyLogin(userData);
	}
	
	@When("^i click on login button$")
	public void i_click_on_login_button() throws Throwable {
		loginObj.verifyButton();
	} 
	
	@When("^I enter invalid Usename and valid password for login$")
	public void i_enter_invalid_Usename_and_valid_password_for_login(DataTable userData1) throws Throwable {
		loginObj.verifylogin(userData1);
	}

	@Then("^I should see the Error Massage$")
	public void i_should_see_the_Error_Massage() throws Throwable {
	    
	}
	
	@When("^I enters valid credentials for login$")
	public void i_enters_valid_credentials_for_login(DataTable userData2) throws Throwable {
		loginObj.verifylogin1(userData2);
	}

	@Then("^I should see my Account page$")
	public void i_should_see_my_Account_page() throws Throwable {
	   
	}
}
