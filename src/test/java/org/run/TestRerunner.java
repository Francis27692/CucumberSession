package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Rerun\\failed.txt", glue = "org.stepdefinition", dryRun = false, monochrome = true, strict = true, snippets = SnippetType.CAMELCASE, 
plugin = {
		"rerun:D:\\Selenium\\CucumberPractice\\Rerun\\failed.txt" 
		})

public class TestRerunner {

	@AfterClass
	public static void reRunReport() {
		JVMReport.generateJVMReport(System.getProperty("user.dir") + "\\Reports\\Json Report\\fbLogin.json");
	}

}
