package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef {
	
	WebDriver driver;
	
	@Given("User in login page")
	public void user_in_login_page() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		
		
	   
	}

	@When("Enter un as {string} and pwd as {string}")
	public void enter_un_and_pwd(String un, String pwd) {
		  
		
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	   
	}

	@Then("login successfull")
	public void login_successfull() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}



}
