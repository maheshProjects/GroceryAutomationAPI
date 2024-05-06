package com.omrbranch.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;



import io.cucumber.messages.types.Ci;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJVMReport(String jsonFile) {

		File file = new File("C:\\Users\\ABINESH\\eclipse-workspace\\OMRBranchGroceryAPIAutomation\\target");

		
		Configuration configuration = new Configuration(file,"OMRBranchAPIAutomation");

		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Browser Version", "114");
		configuration.addClassifications("OS", "WIN10");
		configuration.addClassifications("Sprint", "35");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);

		builder.generateReports();

	}
}
