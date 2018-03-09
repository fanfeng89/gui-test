package com.gamegolf.luxo.gui;

import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.*;

public class FilterTest extends TestBase {

    @Test
    public void TestPatterns(){
        login();
        driver.get(BASE_URL + "/course/23636/hole/310922/shots");
        driver.findElement(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-filters/div[2]/div/div[1]/div[4]")).click();
        assertEquals("INDIVIDUAL SHOTS", driver.findElement(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-filters/div[2]/div/div[2]/div/div/div[1]/div/ul/li[1]")).getText());
        try {
            assertEquals("HEATMAP", driver.findElement(By.xpath("//body[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-filters/div[2]/div/div[2]/div/div/div[1]/div/ul/li[2]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @Test
    public void TestDates(){
            login();
            driver.get(BASE_URL + "/course/23636/hole/310922/shots");
            driver.findElement(By.cssSelector("#body > app-root > div.pagewrap.ng-star-inserted.course-view > app-golfcourse > div > div > app-golfcourse-filters > div.ng-tns-c14-18.prod-mode > div > div.filter-tab-group.inactive > div.filter-tab.dates")).click();
            assertEquals("Select Dates", driver.findElement(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-filters/div[2]/div/div[2]/div/div/div/div/h3")).getText());
            try {
                assertTrue(isElementPresent(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-filters/div[2]/div/div[2]/div/div/div/div/div[1]/div[2]/div/div/div[3]")));
            } catch (Error e) {
                verificationErrors.append(e.toString());
            }
            driver.findElement(By.cssSelector("#body > app-root > div.pagewrap.ng-star-inserted.course-view > app-golfcourse > div > div > app-golfcourse-filters > div.ng-tns-c14-18.prod-mode > div > div.filter-content-wrapper.date > div > div > div > div > div.row > div:nth-child(1) > div > div > div.date-input > input")).clear();
            driver.findElement(By.cssSelector("#body > app-root > div.pagewrap.ng-star-inserted.course-view > app-golfcourse > div > div > app-golfcourse-filters > div.ng-tns-c14-18.prod-mode > div > div.filter-content-wrapper.date > div > div > div > div > div.row > div:nth-child(1) > div > div > div.date-input > input")).sendKeys("01012012");
            driver.findElement(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-filters/div[2]/div/div[2]/div/div/div/div/div[1]/button[1]")).click();
            try {
                assertEquals("Start Date and End Date is required. Please try again.",driver.findElement(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-filters/div[2]/div/div[2]/div/div/div/div/div[2]/div")).getText());
            } catch (Error e) {
                verificationErrors.append(e.toString());
            }
            driver.findElement(By.cssSelector("#body > app-root > div.pagewrap.ng-star-inserted.course-view > app-golfcourse > div > div > app-golfcourse-filters > div.ng-tns-c14-18.prod-mode > div > div.filter-content-wrapper.date > div > div > div > div > div.row > div:nth-child(1) > div > div > div.date-input > input")).clear();
            driver.findElement(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-filters/div[2]/div/div[2]/div/div/div/div/div[1]/div[2]/div/div/div[2]")).sendKeys("03092018");
            driver.findElement(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-filters/div[2]/div/div[2]/div/div/div/div/div[1]/button[1]")).click();
            try {
                assertEquals("Please check your dates entered, format must be MM/DD/YYYY and must be between 01/01/2013 and 03/09/2018.", driver.findElement(By.xpath("//div[@id='body']/app-root/div[1]/app-golfcourse/div/div/app-golfcourse-filters/div[2]/div/div[2]/div/div/div/div/div[2]/div")).getText());
            } catch (Error e) {
                verificationErrors.append(e.toString());
            }

    }
}
