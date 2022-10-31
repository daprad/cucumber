package com.mycirstep;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyCStep {
	static WebDriver driver;
	@Given("User opens the URL to be tested")
	public void userOpensTheURLToBeTested() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.my11circle.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	    
	}

	@Given("user enters the {string} and click continue")
	public void userEntersTheAndClickContinue(String user) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"email_input_field\"]")).sendKeys(user);
		driver.findElement(By.id("loginCTA")).click();
		Thread.sleep(2000);
	   
	}

	@Given("user enters the {string} and click login")
	public void userEntersTheAndClickLogin(String pass) throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='login_with_password_cta']")).click();
		driver.findElement(By.id("pwd_input")).sendKeys(pass);
		driver.findElement(By.id("verify_pwd")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ft-tab-container-pathB ft-tab-container-no-scroll']//div[1]")).click();
	}
   @Given("user selects the right match")
	public void userSelectsTheRightMatch() throws InterruptedException {
    driver.findElement(By.xpath("(//div[@testid='vs']/following-sibling::div)[3]")).click();
	Thread.sleep(3000);

	}
	@When("user select right competition and enters team{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
	public void userSelectRightCompetitionAndEntersTeam(String pl1, String pl2, String pl3, String pl4, String pl5, String pl6, String pl7, String pl8, String pl9, String pl10, String pl11) throws InterruptedException {
		driver.findElement(By.xpath("(//button[text()='Join'])[1]")).click();
		Thread.sleep(3000);
		WebElement player1 = driver.findElement(By.xpath(pl1));
		WebElement player2 = driver.findElement(By.xpath(pl2));
		WebElement player3 = driver.findElement(By.xpath(pl3));
		WebElement player4 = driver.findElement(By.xpath(pl4));
		WebElement player5 = driver.findElement(By.xpath(pl5));
		WebElement player6 = driver.findElement(By.xpath(pl6));
		WebElement player7 = driver.findElement(By.xpath(pl7));
		WebElement player8 = driver.findElement(By.xpath(pl8));
		WebElement player9 = driver.findElement(By.xpath(pl9));
		WebElement player10 = driver.findElement(By.xpath(pl10));
		WebElement player11 = driver.findElement(By.xpath(pl11));
		driver.findElement(By.xpath("//b[text()='BAT']")).click();
		Thread.sleep(3000);
			if (player1.isDisplayed()) {
			player1.click();
			}
		if (player2.isDisplayed()) {
			player2.click();
			}
		if (player3.isDisplayed()) {
			player3.click();
			}
		if (player4.isDisplayed()) {
			player4.click();
			}
		if (player5.isDisplayed()) {
			player5.click();
			}
		if (player6.isDisplayed()) {
			player6.click();
			}
		if (player7.isDisplayed()) {
			player7.click();
			}
		if (player8.isDisplayed()) {
			player8.click();
			}
		if (player9.isDisplayed()) {
			player1.click();
			}
		if (player10.isDisplayed()) {
			player1.click();
			}
		if (player11.isDisplayed()) {
			player1.click();
			}
		driver.findElement(By.xpath("//b[text()='BOWL']")).click();
		Thread.sleep(3000);
		if (player1.isDisplayed()) {
			player1.click();
			}
		if (player2.isDisplayed()) {
			player2.click();
			}
		if (player3.isDisplayed()) {
			player3.click();
			}
		if (player4.isDisplayed()) {
			player4.click();
			}
		if (player5.isDisplayed()) {
			player5.click();
			}
		if (player6.isDisplayed()) {
			player6.click();
			}
		if (player7.isDisplayed()) {
			player7.click();
			}
		if (player8.isDisplayed()) {
			player8.click();
			}
		if (player9.isDisplayed()) {
			player1.click();
			}
		if (player10.isDisplayed()) {
			player1.click();
			}
		if (player11.isDisplayed()) {
			player1.click();
			}
		driver.findElement(By.xpath("//b[text()='ALL-R']")).click();
		Thread.sleep(3000);
		if (player1.isDisplayed()) {
			player1.click();
			}
		if (player2.isDisplayed()) {
			player2.click();
			}
		if (player3.isDisplayed()) {
			player3.click();
			}
		if (player4.isDisplayed()) {
			player4.click();
			}
		if (player5.isDisplayed()) {
			player5.click();
			}
		if (player6.isDisplayed()) {
			player6.click();
			}
		if (player7.isDisplayed()) {
			player7.click();
			}
		if (player8.isDisplayed()) {
			player8.click();
			}
		if (player9.isDisplayed()) {
			player1.click();
			}
		if (player10.isDisplayed()) {
			player1.click();
			}
		if (player11.isDisplayed()) {
			player1.click();
			}
	
		driver.findElement(By.xpath("//b[text()='WK']")).click();	
		Thread.sleep(3000);
		if (player1.isDisplayed()) {
			player1.click();
			}
		if (player2.isDisplayed()) {
			player2.click();
			}
		if (player3.isDisplayed()) {
			player3.click();
			}
		if (player4.isDisplayed()) {
			player4.click();
			}
		if (player5.isDisplayed()) {
			player5.click();
			}
		if (player6.isDisplayed()) {
			player6.click();
			}
		if (player7.isDisplayed()) {
			player7.click();
			}
		if (player8.isDisplayed()) {
			player8.click();
			}
		if (player9.isDisplayed()) {
			player1.click();
			}
		if (player10.isDisplayed()) {
			player1.click();
			}
		if (player11.isDisplayed()) {
			player1.click();
			}
		}
}
	
	
		

	