package com.saucelabs.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginSectionPage {

    public static final Target TXT_USERNAME = Target.the("enter username in the text box username")
            .located(By.id("user-name"));

    public static final Target TXT_PASSWORD = Target.the("enter password in the text box password")
            .located(By.id("password"));

    public static final Target BTN_LOGIN = Target.the("click button login form")
            .located(By.id("login-button"));
}

