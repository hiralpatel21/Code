package StepDefination;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import Runner.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends Base {
	
	@Before
	public void start() throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sagarpatel\\Desktop\\Documents\\Automation2021\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(3000);
	}
	@Test
	public void infiniteScroll() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//driver.get("http://the-internet.herokuapp.com/infinite_scroll");
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
          
	}
		
	@After
	public void close() {
		driver.close();
	}

}
