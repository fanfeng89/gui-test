package com.gamegolf.luxo.gui;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class TestBase {
    public static String BASE_URL = "http://luxo.gamegolf.com";
    public static String USER_NAME = "fan@gameyourgame.com";
    public static String USER_PWD = "game";
    protected WebDriver driver;
    protected StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void init(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    protected void login(){
        driver.get(BASE_URL);
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("email")).sendKeys(USER_NAME);
        driver.findElement(By.id("password")).sendKeys(USER_PWD);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        isElementPresent(By.xpath("//div[@id='header']/div/md-grid-list/div/md-grid-tile[2]/figure/div/div/div/div"));
    }

    protected boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
