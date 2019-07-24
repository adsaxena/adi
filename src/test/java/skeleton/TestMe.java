package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMe {
	
	WebDriver driver;

@Given("I am launching the TestMe app in chrome")
public void i_am_launching_the_TestMe_app_in_chrome() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	System.setProperty("webdriver.chrome.driver","C:\\NexGen Testing Stream\\DRIVERS\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.manage().window().maximize();
}

@Given("I click on sign-in link")
public void i_click_on_sign_in_link() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	  WebElement signin = driver.findElement(By.xpath("//a[contains(text(),'SignIn')]"));
	  signin.click();
}

@When("I provide username <{string}>")
public void i_provide_username(String string) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("Uname");
}

@When("I provide password <{string}>")
public void i_provide_password(String string) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Pass");
}

@Then("I click on login and verify login status")
public void i_click_on_login_and_verify_login_status() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 WebElement login = driver.findElement(By.xpath("//input[@name='Login']"));
	  login.click();
	  System.out.println("Verifying");
	 
}


}
