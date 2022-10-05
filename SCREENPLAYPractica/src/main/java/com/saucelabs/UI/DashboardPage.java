package com.saucelabs.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage {

    public static final Target LBL_PRODUCTS = Target.the("view label products")
            .located(By.xpath("//span[text() = \"Products\"]"));

    public static final Target LBL_BACKPACK =  Target.the("view product backpack")
            .located(By.xpath("//*[contains(text(), \"Sauce Labs Backpack\")]"));

}
