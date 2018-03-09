package com.gamegolf.luxo.gui;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

public class ProfileTest extends TestBase{

        @Test
        public void testPersonalInfoUpdate(){
            login();
            driver.get(BASE_URL + "/my-courses/list");
            driver.findElement(By.xpath("//a[text()='Profile']")).click();
            assertEquals("General", driver.findElement(By.linkText("General")).getText());
            assertEquals("Units", driver.findElement(By.linkText("Units")).getText());
            driver.findElement(By.id("first_name")).clear();
            driver.findElement(By.id("first_name")).sendKeys("TEST");
            driver.findElement(By.id("lastname")).clear();
            driver.findElement(By.id("lastname")).sendKeys("TESTtest");
            driver.findElement(By.cssSelector("button.btn.btn-blue")).click();
            try {
                assertEquals("TEST", driver.findElement(By.id("first_name")).getAttribute("value"));
            } catch (Error e) {
                verificationErrors.append(e.toString());
            }
            try {
                assertEquals("TESTtest", driver.findElement(By.id("lastname")).getAttribute("value"));
            } catch (Error e) {
                verificationErrors.append(e.toString());
            }
            driver.findElement(By.id("job_title")).clear();
            driver.findElement(By.id("job_title")).sendKeys("Test");
            driver.findElement(By.cssSelector("button.btn.btn-blue")).click();
            try {
                assertEquals("Test", driver.findElement(By.id("job_title")).getAttribute("value"));
            } catch (Error e) {
                verificationErrors.append(e.toString());
            }
            driver.findElement(By.id("phone_number")).clear();
            driver.findElement(By.id("phone_number")).sendKeys("012345678");
            driver.findElement(By.cssSelector("button.btn.btn-blue")).click();
            try {
                assertEquals("012345678", driver.findElement(By.id("phone_number")).getAttribute("value"));
            } catch (Error e) {
                verificationErrors.append(e.toString());
            }
            driver.findElement(By.id("address")).clear();
            driver.findElement(By.id("address")).sendKeys("unit 9 G");
            driver.findElement(By.id("city")).clear();
            driver.findElement(By.id("city")).sendKeys("galway");
            driver.findElement(By.id("state")).clear();
            driver.findElement(By.id("state")).sendKeys("galway");
            driver.findElement(By.id("country")).clear();
            driver.findElement(By.id("country")).sendKeys("Ireland");
            driver.findElement(By.cssSelector("button.btn.btn-blue")).click();
            try {
                assertEquals("unit 9 G", driver.findElement(By.id("address")).getAttribute("value"));
            } catch (Error e) {
                verificationErrors.append(e.toString());
            }
            try {
                assertEquals("galway", driver.findElement(By.id("city")).getAttribute("value"));
            } catch (Error e) {
                verificationErrors.append(e.toString());
            }
            try {
                assertEquals("galway", driver.findElement(By.id("state")).getAttribute("value"));
            } catch (Error e) {
                verificationErrors.append(e.toString());
            }
            try {
                assertEquals("Ireland", driver.findElement(By.id("country")).getAttribute("value"));
            } catch (Error e) {
                verificationErrors.append(e.toString());
            }
            try {
                assertEquals("", driver.findElement(By.id("zip")).getAttribute("value"));
            } catch (Error e) {
                verificationErrors.append(e.toString());
            }
        }
}
