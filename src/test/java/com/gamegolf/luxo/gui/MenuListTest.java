package com.gamegolf.luxo.gui;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;


public class MenuListTest extends TestBase {

    @Test
    public void testMenu() {
        login();
        driver.get(BASE_URL + "/course/23636");
        assertTrue(isElementPresent(By.cssSelector("div.coursename.truncate")));
        assertTrue(isElementPresent(By.cssSelector("div.settings-btn")));
        driver.findElement(By.cssSelector("div.settings-btn")).click();
        try {
            assertEquals("LOG OUT", driver.findElement(By.cssSelector("button.mat-menu-item")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.cssSelector("div.submenu-wrapper > div > a.mat-menu-item > div.mat-menu-ripple.mat-ripple")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='cdk-overlay-0']/div/div/div[2]/a[2]/div[2]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.cssSelector("div.mat-menu-ripple.mat-ripple")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='cdk-overlay-0']/div/div/div[2]/a[3]/div[2]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.cssSelector("div.mat-menu-ripple.mat-ripple")).click();
        assertEquals("Galway Golf Club", driver.findElement(By.linkText("Galway Golf Club")).getText());
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='header']/div/md-grid-list/div/md-grid-tile[2]/figure/div/div/div/div")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }
}