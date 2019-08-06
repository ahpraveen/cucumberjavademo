package feature;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Stepdefs {
	
	private WebDriver driver;
	
	@Given("user is displayed with amazon home page {string} {string}")
	public void user_is_displayed_with_amazon_home_page(String scenario, String file) {
		System.out.format("Thread ID - %2d - %s from %s feature file.\n",
		        Thread.currentThread().getId(), scenario,file);
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		driver = new ChromeDriver(option);
		driver.get("http://www.amazon.ca");
	}

	@When("user enters the search {string}")
	public void user_enters_the_search(String string) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string);		
	}

	@When("click the search button")
	public void click_the_search_button() {
		driver.findElement(By.className("nav-input")).click();
	}

	@Then("{string} page should be displayed")
	public void page_should_be_displayed(String string) {
		assertTrue(driver.getCurrentUrl().contains(string));
		driver.close();
	}
	
	@Then("page title {string} should be displayed")
	public void verify_page_title(String string){
		assertEquals(string,driver.getTitle());
		driver.close();
	}
	
	
	

}
