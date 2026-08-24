Feature: Positive Login Test

  Scenario: Successful login with valid username and password

    Given User launches Edge browser
    When User navigates to "https://practicetestautomation.com/practice-test-login/"
    Then Verify login page is displayed

    When User enters username "student"
    And User enters password "Password123"
    And User clicks Submit button

    Then Verify URL contains "practicetestautomation.com/logged-in-successfully/"
    And Verify success message is displayed
    And Verify Log out button is displayed