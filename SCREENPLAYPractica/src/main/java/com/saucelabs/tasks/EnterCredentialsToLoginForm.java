package com.saucelabs.tasks;

import com.saucelabs.UI.LoginSectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterCredentialsToLoginForm implements Task {


    public static EnterCredentialsToLoginForm enterCredentialsToLoginForm()
    {
        return Tasks.instrumented(EnterCredentialsToLoginForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("standard_user").into(LoginSectionPage.TXT_USERNAME),
                Enter.theValue("secret_sauce").into(LoginSectionPage.TXT_PASSWORD),
                Click.on(LoginSectionPage.BTN_LOGIN)
        );
    }
}
