package Runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.report.cucmberreport;

import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vinod\\eclipse-workspace\\DummyBDD\\src\\test\\java\\Feature\\login.feature",
glue = "StepDef",
plugin = {"pretty", "json:C:\\Users\\vinod\\eclipse-workspace\\DummyBDD\\Report\\jsonreport\\jreport.json"},
monochrome = true,
strict = true,
dryRun = false


)
public class Runner {
	
	@AfterClass
	public static void reports() {
		
		cucmberreport.report("C:\\Users\\vinod\\eclipse-workspace\\DummyBDD\\Report\\jsonreport\\jreport.json");
		
		
	}

}


