package com.saucelabs.questions;

import com.saucelabs.UI.DashboardPage;
import net.serenitybdd.screenplay.Question;

public class DashboardSectionPageCompare {

    public static Question<Boolean> boolProducts(){
        return actor -> DashboardPage.LBL_PRODUCTS.resolveFor(actor).getText().contains("PRODUCTS");
    }

    public static Question<Boolean> boolProductBackPack(){
        return actor -> DashboardPage.LBL_BACKPACK.resolveFor(actor).getText().contains("Sauce Labs Backpack");
    }
}
