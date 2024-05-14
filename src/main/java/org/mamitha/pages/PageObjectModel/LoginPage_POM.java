package org.mamitha.pages.PageObjectModel;

import org.mamitha.base.CommonToAll;
import org.mamitha.Utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM extends CommonToAll {
    WebDriver driver;

    public LoginPage_POM() {
        super();
    }


    //  Page Locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");


    // Page Actions
    public String loginToVWOInvalidCred() {
        enterInput(username, PropertyReader.readyKey("username"));
        enterInput(password, "admin");
        clickElement(signButton);
        presenceOfElement(error_message);
        visibilityOfElement(error_message);
        return getElement(error_message).getText();

    }

    public void loginToVWOValidCreds() {
        enterInput(username, PropertyReader.readyKey("username"));
        enterInput(password, PropertyReader.readyKey("password"));
        clickElement(signButton);
        // Dashboard
    }

    public Dashboardpage_POM afterLoginVWOValidCreds(){
        return new Dashboardpage_POM();
    }

}
