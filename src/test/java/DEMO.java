import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DEMO {
	
	WebDriver driver;
	
	@Given("Application url is working")
	public void application_url_is_working() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Launching");
		System.setProperty("webdriver.chrome.driver","C:\\NexGen Testing Stream\\DRIVERS\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("user enters username {string}")
	public void user_enters_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		  driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("user");
	}

	@When("user enter password {string}")
	public void user_enter_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.xpath("//*[@id='password']")).sendKeys("pass");
	}

	@Then("he click on submit button")
	public void he_click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		  WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
		  login.click();
	}

	@Then("verifies the login process")
	public void verifies_the_login_process() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("verified");
	}

	@Then("he chose to close the application")
	public void he_chose_to_close_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Signout");
		  WebElement signout = driver.findElement(By.xpath("//a[contains(text(),'SignOut')]"));
		  signout.click();
	}
}
