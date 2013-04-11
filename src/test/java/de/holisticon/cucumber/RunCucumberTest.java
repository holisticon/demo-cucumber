package de.holisticon.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features="src/test/features", 
		glue="de.holisticon.bar",
		strict=true)
public class RunCucumberTest {}
