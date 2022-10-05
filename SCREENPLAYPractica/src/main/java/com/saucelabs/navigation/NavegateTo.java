package com.saucelabs.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegateTo {

    public static Performable theSwagLabsHomePage(){
        return Task.where(
                "the client pablo opens the SwagLab Page",
                Open.browserOn().the(theSwagLabsHomePage.class)

        );
    }

}
