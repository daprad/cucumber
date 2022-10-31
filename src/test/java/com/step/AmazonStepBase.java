package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonStepBase {
	WebDriver driver;
	static AmazeStepPOM p;
	@Given("User opens the URL to be tested")
	public void userOpensTheURLToBeTested() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//*[text()='Hello, sign in']")).click();
		
	    p = new AmazeStepPOM();
	   p.getSigning().click();
	    
	}

	@Given("user enters the {string} and click continue")
	public void userEntersTheAndClickContinue(String user) {
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(user);
    	
	}

	@Given("user enters the {string} and click login")
	public void userEntersTheAndClickLogin(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("user enters the item name in search box")
	public void userEntersTheItemNameInSearchBox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user select the right item and add it to cart")
	public void userSelectTheRightItemAndAddItToCart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("the item must be added in cart")
	public void theItemMustBeAddedInCart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}



}