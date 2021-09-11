package MyRunner;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
				features = ".\\src\\main\\java\\Features",
				glue={"StepDefinition"},
				tags = "@searchandadditems",
				plugin = {	"pretty",
							"html:test-outout",
							"json:json_output/cucumber.json",
							"junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
				monochrome = true, 	//display the console output in a proper readable format
				strict = true, 		//it will check if any step is not defined in step definition file
				dryRun = false  	//to check the mapping is proper between feature file and step def file
				
		
		)
@Test
public class Runner extends AbstractTestNGCucumberTests{

}





