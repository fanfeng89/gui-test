package com.gamegolf.luxo.gui;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginTest extends TestBase {

    @Test
    public void testLogin(){
        login();
        try {
            assertTrue(isElementPresent(By.xpath("//a[text()='Profile']")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[text()='Profile']")).click();
        try {
            assertEquals(USER_NAME, driver.findElement(By.id("email")).getAttribute("value"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }



}