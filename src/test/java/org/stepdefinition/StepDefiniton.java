package org.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.FBLogin;
import org.pojo.ForgtPass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefiniton extends BaseClass {

	// WebDriver driver;
	FBLogin fb;
	ForgtPass fP;

	@Given("User have to enter facebook login by google chrome")
	public void user_have_to_enter_facebook_login_by_google_chrome() {
		launchUrl("https://www.facebook.com/");
	}
	
	@When("User have to enter  valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password(io.cucumber.datatable.DataTable dt) throws InterruptedException {
	   
//		2D Map
//		List<Map<String, String>> asMaps = dt.asMaps(String.class, String.class);
//		
//			Map<String, String> m1 = asMaps.get(1);
//				
//				String st = m1.get("email");
//				FBLogin fb = new FBLogin();
//				WebElement mail = fb.getTxtmail();
//				fillText(mail, st);
//				threadSleep(4000);
//				mail.clear();
		
//		2D List
//		List<List<String>> asLists = dt.asLists();
//		for (int i = 0; i < asLists.size(); i++) {
//			List<String> li = asLists.get(i);
//			for (int j = 0; j < li.size(); j++) {
//				String s2 = li.get(j);
//				FBLogin fb = new FBLogin();
//
//				WebElement mail = fb.getTxtmail();
//				fillText(mail, s2);
//				threadSleep(2000);
//				mail.clear();
//			}
//		}
		
		
	}

	
//	@When("User have to enter  valid email and invalid password")
//	public void user_have_to_enter_valid_email_and_invalid_password() {
//		FBLogin fb = new FBLogin();
//
//		WebElement mail = fb.getTxtmail();
//		fillText(mail, "antony@gmail.com");
//
//		WebElement pass = fb.getTxtPass();
//		fillText(pass, "shjhjcjhs");
//	}

	@When("User have to enter  invalid email and invalid password")
	public void user_have_to_enter_invalid_email_and_invalid_password() {
		FBLogin fb = new FBLogin();

		WebElement mail = fb.getTxtmail();
		fillText(mail, "arya@gmail.com");

		WebElement pass = fb.getTxtPass();
		fillText(pass, "hxahgg7");
	}

	

	@When("User have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {
		FBLogin fb = new FBLogin();
		WebElement btnLogin = fb.getBtnLogin();
		btnLogin.click();
		threadSleep(6000);

	}

	@Then("User have to reach invalid login credentials page")
	public void user_have_to_reach_invalid_login_credentials_page() {
//		pageUrl();
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		 if (url.contains("privacy_mutation_token")) {
		 System.out.println("Redirected to Invalid Credential Page");
		 }else {
		 System.out.println("Not in Invalid Credential Page");
		 }
		
	}
	
	@Given("User have to enter facebook login by using google chrome")
	public void user_have_to_enter_facebook_login_by_using_google_chrome() {
		
		launchUrl("https://www.facebook.com/");
		
	}

	@When("User have to click forgotten password link")
	public void user_have_to_click_forgotten_password_link() {
	 fP = new ForgtPass();
	 fP.getForgotPass().click();
	   
	}

	@When("User have to enter valid email")
	public void user_have_to_enter_valid_email() throws InterruptedException {
	   WebElement enterEmail = fP.getEnterEmail();
	   fillText(enterEmail, "alexander@gmail.com");
	   
//	   fP.getBtnSearch().click();
	}

	@When("User have to click the search button")
	public void user_have_to_click_the_search_button() throws InterruptedException {
		 	
	   WebElement btnSearch = fP.getBtnSearch();
	   btnSearch.click();
	   threadSleep(5000);
	}

	@Then("User have to redirect Reset your password page")
	public void user_have_to_redirect_Reset_your_password_page() {
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		 if (url.contains("recover/initiate")) {
		 System.out.println("Redirected to Password Reset Page");
		 }else {
		 System.out.println("Not in Password Reset Page");
		 }
		System.out.println("Jerome updating");
		
	}

}
