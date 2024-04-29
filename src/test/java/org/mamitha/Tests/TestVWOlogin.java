package org.mamitha.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOlogin {


    @Test

    public void testloginPositive(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }


}

