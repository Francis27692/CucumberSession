package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	public void bef() {
		System.out.println("Before Secenario <<<<");
		loadBrowser();
		maxWindow();
		implicitWait(10);
	}
	
	@Before(order=2)
	public void bef2() {
		System.out.println("Before Sce2");
	}
	
	@Before(order=1)
	public void bef1() {
		System.out.println("Before Sce1");
	}
	
	@Before(order=3)
	public void bef3() {
		System.out.println("Before Sce3");
	}
	

	@After
	public void aft(Scenario s) {
		
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screen = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screen, "image/png");
		}
		
		System.out.println("After Scenario >>>>");
		closeBrowser();
	}
	
	
	
}
