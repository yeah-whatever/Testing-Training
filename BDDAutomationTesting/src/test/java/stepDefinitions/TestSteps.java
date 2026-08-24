package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {

    WebDriver driver;
    WebDriverWait wait;


    @Given("User launches Edge browser")
    public void user_launches_edge_browser() {

        driver = new EdgeDriver();

        driver.manage().window().maximize();

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );
    }



    @When("User navigates to {string}")
    public void user_navigates_to(String url) {

        driver.get(url);
    }


    @Then("Verify login page is displayed")
    public void verify_login_page_is_displayed() {

        WebElement usernameField =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.id("username")
                        )
                );

        Assert.assertTrue(
                "Login page is not displayed",
                usernameField.isDisplayed()
        );
    }



    @When("User enters username {string}")
    public void user_enters_username(String username) {

        WebElement usernameField =
                driver.findElement(By.id("username"));

        usernameField.clear();

        usernameField.sendKeys(username);
    }


    @When("User enters password {string}")
    public void user_enters_password(String password) {

        WebElement passwordField =
                driver.findElement(By.name("password"));

        passwordField.clear();

        passwordField.sendKeys(password);
    }



    @When("User clicks Submit button")
    public void user_clicks_submit_button() {

        driver.findElement(
                By.cssSelector("button#submit")
        ).click();
    }



    @Then("Verify URL contains {string}")
    public void verify_url_contains(String expectedUrl) {

        wait.until(
                ExpectedConditions.urlContains(expectedUrl)
        );

        String actualUrl = driver.getCurrentUrl();

        Assert.assertTrue(
                "Expected URL was not found. Actual URL: " + actualUrl,
                actualUrl.contains(expectedUrl)
        );
    }


    @Then("Verify success message is displayed")
    public void verify_success_message_is_displayed() {

        WebElement successMessage =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.tagName("strong")
                        )
                );

        Assert.assertTrue(
                "Success message is not displayed",
                successMessage.isDisplayed()
        );

        String actualMessage = successMessage.getText();

        Assert.assertTrue(
                "Expected successful login message was not found",
                actualMessage.contains("Congratulations")
                        || actualMessage.contains("successfully logged in")
        );
    }




    @Then("Verify Log out button is displayed")
    public void verify_log_out_button_is_displayed() {

        WebElement logoutButton =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.linkText("Log out")
                        )
                );

        Assert.assertTrue(
                "Log out button is not displayed",
                logoutButton.isDisplayed()
        );
    }


    @Then("Verify error message is displayed")
    public void verify_error_message_is_displayed() {

        WebElement errorMessage =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.id("error")
                        )
                );

        Assert.assertTrue(
                "Error message is not displayed",
                errorMessage.isDisplayed()
        );
    }


    @Then("Verify error message is {string}")
    public void verify_error_message_is(String expectedMessage) {

        WebElement errorMessage =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.id("error")
                        )
                );

        String actualMessage =
                errorMessage.getText();

        Assert.assertEquals(
                "Error message does not match",
                expectedMessage,
                actualMessage
        );
    }

    @After
    public void close_browser() {

        if (driver != null) {

            driver.quit();
        }
    }
}