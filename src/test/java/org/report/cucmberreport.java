package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;




public class cucmberreport {
	
	public static void report(String jsonpath) {
		
		File file = new File("C:\\Users\\vinod\\eclipse-workspace\\DummyBDD\\Report\\CucucmberReport");
		
		Configuration c = new Configuration(file, "WebApp");
		c.addClassifications("Browser","Chrome");
		c.addClassifications("JDK","19");
		c.addClassifications("Regression Testing","1 Testcase");
		
		
		List<String> li = new ArrayList<String>();
		
		li.add(jsonpath);
		
		
		ReportBuilder re = new ReportBuilder(li, c);
		re.generateReports();
		
		
	}

}
