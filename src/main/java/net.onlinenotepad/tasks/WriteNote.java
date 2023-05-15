package net.onlinenotepad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.onlinenotepad.userinterfaces.OnlinenotepadHomePage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class WriteNote implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(BTN_NOTE_TEXT, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(BTN_NOTE_TEXT),
                Click.on(BTN_PENCIL),
                Enter.theValue("Escenario1").into(TXT_TITLE),
                WaitUntil.the(BTN_B, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(BTN_B),
                Scroll.to(TXT_NOTE),
                Click.on(TXT_NOTE),
                Enter.theValue("pprueba").into(TXT_NOTE),
                Click.on(BTN_SAVE)

        );

    }
    public static WriteNote note(){
        return instrumented (WriteNote.class);

    }
}

