package accenture;

import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="C:\\Users\\training_d2.03.07\\Desktop\\cucumber-skeleton-project-4.0\\cucumber-skeleton-project"
					+ "-4.0\\src\\test\\resources\\login.feature",monochrome=true,plugin= {"pretty"}
			)

	public class TestRunner {
	
	
	}
