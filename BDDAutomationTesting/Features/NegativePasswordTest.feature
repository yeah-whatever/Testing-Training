Feature: Negative Password Login Test

  Scenario: Login with invalid password

    Given User launches Edge browser
    When User navigates to "https://practicetestautomation.com/practice-test-login/"
    Then Verify login page is displayed

    When User enters username "student"
    And User enters password "incorrectPassword"
    And User clicks Submit button

    Then Verify error message is displayed
    And Verify error message is "Your password is invalid!"