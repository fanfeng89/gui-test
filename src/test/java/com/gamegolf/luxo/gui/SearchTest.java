package com.gamegolf.luxo.gui;

//package com.example.tests;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;


public class SearchTest extends TestBase {

    @Test
    public void testSearch(){
        login();
        driver.get(BASE_URL + "/my-courses/list");
        driver.findElement(By.name("filterCourses")).sendKeys("Elm P");
        driver.findElement(By.cssSelector("#basic-addon2 > svg")).click();
        try {
            assertEquals("No courses. Please adjust your search.", driver.findElement(By.cssSelector("td.course-name")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.name("filterCourses")).clear();
        driver.findElement(By.name("filterCourses")).sendKeys("");
        driver.findElement(By.name("filterCourses")).sendKeys("Galway");
        driver.findElement(By.cssSelector("#basic-addon2 > svg")).click();
    }




}
