package com.searchpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    WebDriver driver;
    By txt_keywords= By.id ( "keywords");
    By txt_location=By.id("location");
    By txt_distace=By.id("distance");

    public SearchPage(WebDriver driver){
        this.driver=driver;
    }
    public void sendKeysInTextField(String keywords, String location, String distance){
        driver.findElement(txt_keywords).sendKeys(keywords);
        driver.findElement(txt_location).sendKeys(location);
        driver.findElement(txt_distace).sendKeys(distance);
    }
}
