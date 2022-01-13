package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles", glue = "org.stepdefinition", 
dryRun = false, monochrome = true, strict = true, tags= {""}, snippets=SnippetType.CAMELCASE,
plugin= {"pretty", "html:Reports\\Html Report", "json:Reports\\Json Report\\fbLogin.json",
		"junit:Reports\\Junit Report\\fb.xml",
		"rerun:D:\\Selenium\\CucumberPractice\\Rerun\\failed.txt"})

public class FinalRun extends JVMReport {
	
	@AfterClass
	public static void report() {
		
		generateJVMReport(System.getProperty("user.dir")+"\\Reports\\Json Report\\fbLogin.json");

	}

}
