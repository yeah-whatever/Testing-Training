Feature: Negative Username Login Test

  Scenario: Login with invalid username

    Given User launches Edge browser
    When User navigates to "https://practicetestautomation.com/practice-test-login/"
    Then Verify login page is displayed

    When User enters username "incorrectUser"
    And User enters password "Password123"
    And User clicks Submit button

    Then Verify error message is displayed
    And Verify error message is "Your username is invalid!"