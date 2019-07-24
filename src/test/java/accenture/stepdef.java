package accenture;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class stepdef {
	
public WebDriver driver;


	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	System.setProperty("webdriver.chrome.driver", "C:\\Sumit Wankhede\\Selenium Softwares\\Selenium Softwares\\SeleniumDrivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://localhost:8029/TestMeApp/login.htm");
	Thread.sleep(2000);
	 
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
	    WebElement uname= driver.findElement(By.name("userName"));
	    uname.sendKeys("lalitha");
	    Thread.sleep(2000);

	    WebElement pass= driver.findElement(By.name("password"));
	    pass.sendKeys("password123");
	    Thread.sleep(2000);

	}

	@When("clicks on Login")
	public void clicks_on_Login() throws InterruptedException {
		 WebElement login= driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
		 login.click();
		 Thread.sleep(2000);

		 
	}

	@Then("homepage should be displayed.")
	public void homepage_should_be_displayed() {
	   Assert.assertEquals("Home",driver.getTitle());
	}

}
