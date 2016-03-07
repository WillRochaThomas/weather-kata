package uk.gov.metoffice.kata.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KataSteps {
    @Given("^some precondition is met$")
    public void somePreconditionIsMet() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // e.g. setup a file with data mimicking a particular scenario
        throw new PendingException();
    }

    @When("^something happens$")
    public void somethingHappens() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // e.g. trigger the data processing
        throw new PendingException();
    }

    @Then("^some postcondition is met$")
    public void somePostconditionIsMet() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // e.g. confirm the output was as expected
        throw new PendingException();
    }
}
