package org.mamitha.pages.PageObjectModel;

import org.mamitha.base.CommonToAll;
import org.openqa.selenium.By;

public class Dashboardpage_POM extends CommonToAll {
    public  Dashboardpage_POM(){

    }


    // Page Locators
    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");



    // Page Actions
    public String loggedInUserName() {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }

}
