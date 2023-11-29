package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/LO_GIN/LO_GIN1.feature"},dryRun = false,glue = {"stepdef1"},plugin= {"html:report/myreport.html"},tags = "@PositiveTesting")
public class testrunA {

}
