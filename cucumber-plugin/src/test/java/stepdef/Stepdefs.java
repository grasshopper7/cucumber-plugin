package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs {

	@Given("Write a {string} step with precondition in {string}")
	@When("Complete action in {string} step in {string}")
	@Then("Validate the outcome in {string} step in {string}")
	public void step(String step, String scenario) {
		//System.out.format("%s step from %s.\n", step.toUpperCase(), scenario.toUpperCase());
	}
	
	@When("Unused")
	public void unused() {
		
	}
	
	@Given("Raise an exception")
	public void raiseException() {
		throw new AssertionError("Fail it!!");
	}
}