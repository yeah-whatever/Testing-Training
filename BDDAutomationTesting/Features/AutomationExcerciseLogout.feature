Feature: Login User with Incorrect Email and Password - Automation Exercise

  Scenario: Login with invalid email and password

    Given User should Launch Edge browser

    When User should Navigate to url "https://automationexercise.com"

    Then User should Verify that home page is visible successfully

    When Click on "Signup / Login" button

    Then Verify "Login to your account" is visible

    When Enter incorrect email address and password

    And Click "login" button

    Then Verify error "Your email or password is incorrect!" is visible