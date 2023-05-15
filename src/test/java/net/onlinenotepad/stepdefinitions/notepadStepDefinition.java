package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import net.onlinenotepad.tasks.WriteNote;
import net.onlinenotepad.userinterfaces.OnlinenotepadHomePage;

import net.serenitybdd.screenplay.actions.Open;


import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class notepadStepDefinition {

    OnlinenotepadHomePage onlinenotepadHomePage;


    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }




    @Given("user enters the online notepad site")
    public void userEntersTheOnlineNotepadSite() {
        theActorCalled("Test").wasAbleTo(Open.browserOn(onlinenotepadHomePage));


    }
    @When("the user selects the rich text note button")
    public void theUserSelectsTheRichTextNoteButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(WriteNote.note());

    }

    @Then("the user will see that it was created successfully.")
    public void theUserWillSeeThatItWasCreatedSuccessfully() {

    }


}
