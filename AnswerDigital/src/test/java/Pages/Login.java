package Pages;

import java.util.Map;

import org.junit.Assert;

import Com.Constants.LoginConstants;
import Com.Driver.Action;
import Runner.Base;
import cucumber.api.DataTable;

public class Login extends Base {

public void verifyForm() throws InterruptedException {
	 Action.clickOnTheElement(LoginConstants.SELECTFORMAUTHENTICATION);
	 Thread.sleep(2000);
 }
 
 public void verifyLogin(DataTable userData) throws InterruptedException {
	 Assert.assertEquals("The Internet", driver.getTitle());
		Map<String,String> loginDetails = userData.asMap(String.class, String.class);
		String username = loginDetails.get("UserName");
		String Password = loginDetails.get("password");
		Action.login(LoginConstants.USERNAME, username);
		Action.login(LoginConstants.PASSWORD, Password);
		 Thread.sleep(3000);
 }
 
 public void verifylogin(DataTable userData1) throws InterruptedException {
	 Assert.assertEquals("The Internet", driver.getTitle());
		Map<String,String> loginDetails = userData1.asMap(String.class, String.class);
		String username = loginDetails.get("UserName");
		String Password = loginDetails.get("password");
		Action.login(LoginConstants.USERNAME, username);
		Action.login(LoginConstants.PASSWORD, Password);
		 Thread.sleep(3000);
 }
 public void verifylogin1(DataTable userData2) throws InterruptedException {
	 Assert.assertEquals("The Internet", driver.getTitle());
		Map<String,String> loginDetails = userData2.asMap(String.class, String.class);
		String username = loginDetails.get("UserName");
		String Password = loginDetails.get("password");
		Action.login(LoginConstants.USERNAME, username);
		Action.login(LoginConstants.PASSWORD, Password);
		 Thread.sleep(3000);
 }
 
 public void verifyButton() throws InterruptedException {
	 Action.clickOnTheElement(LoginConstants.LOGIN);
	 Thread.sleep(2000);
 }


}
