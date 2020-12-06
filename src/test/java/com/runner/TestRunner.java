package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(

        features = ".\\src\\test\\java\\com\\appfeature\\user_search_jobs.feature",//feature file location
        glue={"stepdefinitions.SearchStepDefinition"},//stepdefinition location
        format = {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},//report format
        monochrome = true,//readable format
        strict = true,
        dryRun = false
)

public class TestRunner {
}
