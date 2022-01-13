package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String jsonpath) {
		File f = new File(System.getProperty("user.dir")+"\\Reports\\JVM Report");
		
		Configuration c = new Configuration(f, "Facebook Login");
		
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Software", "Eclipse");
		c.addClassifications("Browser", "Google Chrome");
		c.addClassifications("Java", "JDK 1.8");
		
		List<String> l = new ArrayList<String>();
		l.add(jsonpath);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
		
	}

}
