package com.gamegolf.luxo.gui;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

public class HoleStatsTest extends TestBase {

    @Test
    public void testHoleStats() {
        login();
        driver.get(BASE_URL + "/course/23636/hole/310922/shots");
        driver.findElement(By.xpath("//div[@id='hole-nav']/div[1]/div[1]/div/div[3]/div/div[2]")).click();
        assertEquals("AVG SCORE", driver.findElement(By.xpath("//div[@id='hole-nav']/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div[2]")).getText());
        try {
            assertEquals("AVG HOLE TIME",driver.findElement(By.xpath("//div[@id='hole-nav']/div[1]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Tee Shots",driver.findElement(By.xpath("//div[@id='hole-nav']/div[1]/div[2]/div/div/div[3]/div[1]/div[2]/div")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Approach Shots",driver.findElement(By.xpath("//div[@id='hole-nav']/div[1]/div[2]/div/div/div[4]/div[1]/div[2]/div")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//div[@id='hole-nav']/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]")).click();
        driver.findElement(By.id("Zoom_icon")).click();
        assertEquals("Statistics - Hole 6", driver.findElement(By.cssSelector("div.overlay-header.ng-tns-c16-5 > div.ng-tns-c16-5")).getText());
        try {
            assertEquals("Galway Golf Club", driver.findElement(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-panel/app-golfcourse-stat-overlay/div/div/div/div[2]/div/div/div[2]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-panel/app-golfcourse-stat-overlay/div/div/div/div[3]/div/div/button[1]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-panel/app-golfcourse-stat-overlay/div/div/div/div[3]/div/div/button[2]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-panel/app-golfcourse-stat-overlay/div/div/div/div[3]/div/div/button[3]")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Approach Shots", driver.findElement(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-panel/app-golfcourse-stat-overlay/div/div/div/div[3]/div/div/button[4]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        assertEquals("AVG SCORE", driver.findElement(By.cssSelector("div.label-text")).getText());
        assertTrue(isElementPresent(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-panel/app-golfcourse-stat-overlay/div/div/div/div[4]/div/div/div[2]")));

    }

    @Test
    public void TestGraphHoleStats(){
        login();
        driver.get(BASE_URL + "/course/23636/hole/310922/shots");
        driver.findElement(By.xpath("//div[@id='hole-nav']/div[1]/div[1]/div/div[3]/div/div[2]")).click();
        driver.findElement(By.xpath("//div[@id='hole-nav']/div[1]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]")).click();
        driver.findElement(By.cssSelector("div.zoom-graph-icon")).click();
        assertEquals("AVG HOLE TIME", driver.findElement(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-panel/app-golfcourse-stat-overlay/div/div/div/div[4]/div/div/div[1]/div[2]")).getText());
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-panel/app-golfcourse-stat-overlay/div/div/div/div[4]/div/div/div[2]")));
        } catch (Error e){
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-panel/app-golfcourse-stat-overlay/div/div/div/div[3]/div/div/button[3]")).click();
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-panel/app-golfcourse-stat-overlay/div/div/div/div[4]/div/div/div[2]")));
        }catch (Error e){
            verificationErrors.append(e.toString());
        }
    }
}
