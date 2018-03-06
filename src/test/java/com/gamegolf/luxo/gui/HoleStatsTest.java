package com.gamegolf.luxo.gui;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

public class HoleStatsTest extends TestBase {

    @Test
    public void testHoleStats() {
        login();
        driver.get(BASE_URL + "/course/23636/hole/310922/shots");
        driver.findElement(By.cssSelector("div.tab.off > img.ng-tns-c13-3")).click();
        assertEquals("AVG SCORE", driver.findElement(By.cssSelector("div.label-text")).getText());
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='hole-nav']/div/div[2]/div/div/div[2]/div[2]/div[2]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='hole-nav']/div/div[2]/div/div/div[3]/div[2]/div")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='hole-nav']/div/div[2]/div/div/div[4]/div[2]/div")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.cssSelector("div.label-text")).click();
        assertEquals("Statistics - Hole 6", driver.findElement(By.cssSelector("div.overlay-header.ng-tns-c16-5 > div.ng-tns-c16-5")).getText());
        try {
            assertEquals("Galway Golf Club", driver.findElement(By.cssSelector("div.small-text")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//body[@id='body']/app-root/div/app-golfcourse/div/div/app-golfcourse-panel/app-golfcourse-stat-overlay/div/div/div/div[3]/div/div/button")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//body[@id='body']/app-root/div/app-golfcourse/div/div/app-golfcourse-panel/app-golfcourse-stat-overlay/div/div/div/div[3]/div/div/button[2]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//body[@id='body']/app-root/div/app-golfcourse/div/div/app-golfcourse-panel/app-golfcourse-stat-overlay/div/div/div/div[3]/div/div/button[3]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//body[@id='body']/app-root/div/app-golfcourse/div/div/app-golfcourse-panel/app-golfcourse-stat-overlay/div/div/div/div[3]/div/div/button[4]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        assertEquals("AVG SCORE", driver.findElement(By.cssSelector("div.label-text")).getText());

    }
}
