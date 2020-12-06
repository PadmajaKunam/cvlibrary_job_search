package com.stepdefinitions;
import com.searchpage.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SearchStepDefinition {
    WebDriver driver;
    SearchPage search=new SearchPage ( driver );
    @Given("^user is on Search page$")
    public void user_is_on_Search_page()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver ();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^user navigate to Search page$")
    public void user_navigate_to_Search_page()  {
        driver.get("https://www.cv-library.co.uk/");

    }

    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"$")
    public void user_enters_and_and(String keywords, String location,String distance) {
        SearchPage search=new SearchPage ( driver );
        search.sendKeysInTextField ( keywords,location,distance );
    }
    @And("^user clicks on  Find Jobs button$")
    public void user_clicks_on_Find_Jobs_button() throws Throwable {
        WebElement loginBtn=  driver.findElement(By.id("hp-search-btn"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginBtn);

    }

    @Then("^user is navigated to search results$")
    public void user_is_navigated_to_search_results() throws Throwable {
        System.out.println("User is navigated to Search results");
        driver.quit();

    }
    @When("^user enters negative keys \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"$")
    public void user_enters_negative_keys_and_and(String keywords, String location, String distance) {
        SearchPage search=new SearchPage ( driver );
        search.sendKeysInTextField ( keywords,location,distance );

    }
    @Then("^user is able to see error message$")
    public void user_is_able_to_see_error_message()  {
        System.out.println ("Sorry, we could not locate <location1>. Please check your spelling and try again" );
    }



}
