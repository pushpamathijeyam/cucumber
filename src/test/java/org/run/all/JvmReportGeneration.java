package org.run.all;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportGeneration {
	public static void generateBddReport(String jsonPath) {
		
		File f = new File(System.getProperty("user.dir") + "\\reporting\\jvm report");
		
		Configuration con = new Configuration(f, "face book");
		con.addClassifications("Automation Tool", "Selenium webdriver");
		con.addClassifications("IDE", "Eclipse");
		con.addClassifications("version", "photon R");
		con.addClassifications("sprint", "500");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);
		
		ReportBuilder report = new ReportBuilder(li, con);
		report.generateReports();

	}

}
