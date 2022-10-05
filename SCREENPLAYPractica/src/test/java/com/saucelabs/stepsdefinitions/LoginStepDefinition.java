package com.saucelabs.stepsdefinitions;

import com.saucelabs.navigation.NavegateTo;
import com.saucelabs.questions.DashboardSectionPageCompare;
import com.saucelabs.tasks.EnterCredentialsToLoginForm;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinition {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("pablo");

    }

    @Given("I find myself on the swaglabs home page.")
    public void iFindMyselfOnTheSwaglabsHomePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(NavegateTo.theSwagLabsHomePage());
    }
    @When("entering the correct credentials")
    public void enteringTheCorrectCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterCredentialsToLoginForm.enterCredentialsToLoginForm());
    }
    @Then("I must be able to see the products")
    public void iMustBeAbleToSeeTheProducts() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("the displayed label products in the dashboard page", DashboardSectionPageCompare.boolProducts(), equalTo(Boolean.TRUE)),
                seeThat("the displayed product back pack in the dashboard page", DashboardSectionPageCompare.boolProductBackPack(), equalTo(Boolean.TRUE))
        );
    }
}
