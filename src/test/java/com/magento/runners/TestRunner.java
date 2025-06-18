package com.magento.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.magento.steps",
		// plugin = {"pretty", "html:target/cucumber-reports"},
		plugin = { "pretty", "html:target/cucumber-reports/report.html", 
							 "json:target/cucumber.json",
			                 "junit:target/cucumber.xml" },

		tags = "@Order1", monochrome = true)
public class TestRunner {
}