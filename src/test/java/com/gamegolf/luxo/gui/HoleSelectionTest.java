package com.gamegolf.luxo.gui;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

public class HoleSelectionTest extends TestBase {

    @Test
    public void testHoleSelection(){
        login();
        driver.get(BASE_URL + "/course/23636");
        assertEquals("GALWAY GOLF CLUB", driver.findElement(By.cssSelector("div.coursename.truncate")).getText());
        try {
            assertEquals("AVG ROUND SCORE", driver.findElement(By.cssSelector("div.label-text")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.cssSelector("#hole-nav > div.hole-wrapper.ng-tns-c13-3 > div.ng-tns-c13-3 > div.hole-selector-dropdown > div.ng-tns-c13-3")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'5')])[3]")).click();
        assertEquals("HOLE 5", driver.findElement(By.cssSelector("div.coursename.hole-header")).getText());
        try {
            assertEquals("SELECT SHOTS TO DISPLAY", driver.findElement(By.xpath("//div[@id='hole-nav']/div[1]/div[2]/div/div/div[1]/div[1]/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.cssSelector("div.seleted-shots")).click();
        assertEquals("Off the Tee", driver.findElement(By.cssSelector("#hole-nav > div:nth-child(1) > div:nth-child(2) > div > div > div.shot-selector.ng-tns-c16-33.ng-star-inserted > div > div:nth-child(2) > div > div.shot-number > span")).getText());
        try {
            assertEquals("Green in Regulation", driver.findElement(By.cssSelector("#hole-nav > div:nth-child(1) > div:nth-child(2) > div > div > div.shot-selector.ng-tns-c16-33.ng-star-inserted > div > div:nth-child(3) > div > div.shot-number > span")).getText());
        } catch (Error e){
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='hole-nav']/div/div[2]/div/div/div[2]/div/div[3]/div/div[2]/span")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertTrue(isElementPresent(By.xpath("//div[@id='hole-nav']/div/div[2]/div/div/div[2]/div/div[4]/div/div[2]/span")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.cssSelector("div.hole-nav-btn.hole-nav-next")).click();
        assertEquals("HOLE 6", driver.findElement(By.cssSelector("div.coursename.hole-header")).getText());
        try {
            assertEquals("SELECT SHOTS TO DISPLAY", driver.findElement(By.xpath("//div[@id='hole-nav']/div[1]/div[2]/div/div/div[1]/div[1]/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.cssSelector("div.hole-nav-btn.hole-nav-previous")).click();
        assertEquals("HOLE 5", driver.findElement(By.cssSelector("div.coursename.hole-header")).getText());
        try {
            assertEquals("SELECT SHOTS TO DISPLAY", driver.findElement(By.xpath("//div[@id='hole-nav']/div[1]/div[2]/div/div/div[1]/div[1]/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.cssSelector("#hole-nav > div.hole-wrapper.ng-tns-c13-3 > div.ng-tns-c13-3 > div.hole-selector-dropdown > div.ng-tns-c13-3")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'15')])[2]")).click();
        assertEquals("HOLE 15", driver.findElement(By.cssSelector("div.coursename.hole-header")).getText());
        try {
            assertEquals("SELECT SHOTS TO DISPLAY", driver.findElement(By.xpath("//div[@id='hole-nav']/div[1]/div[2]/div/div/div[1]/div[1]/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }
}