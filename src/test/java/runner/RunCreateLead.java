package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/java/feature/leadtest.feature","src/test/java/pages/CreateLead.java "}
,glue= {"createleadsteps" , "pages"}
,tags= {"@smoke and @regression"}
,monochrome=true)

public class RunCreateLead {

}
