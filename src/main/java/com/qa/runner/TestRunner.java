package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
		features="D:\\my_workspace\\POM\\freeCRMFeatures\\freeCRM.feature",
		glue={"com.qa.stepDefinitions"},
		dryRun=false
		)


public class TestRunner {

}