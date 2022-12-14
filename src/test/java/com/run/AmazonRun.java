package com.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.event.SnippetsSuggestedEvent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features = {"src/test/resources/Features/Amazon.feature"},glue="com.mycirstep",snippets =SnippetType.CAMELCASE )
public class AmazonRun {
}
