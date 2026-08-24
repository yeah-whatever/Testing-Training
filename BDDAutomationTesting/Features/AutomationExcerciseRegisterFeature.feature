Feature: Register User - Automation Exercise

  Scenario: Successfully register a new user

    Given User should Launch Edge browser

    When User should Navigate to url "https://automationexercise.com"

    Then User should Verify that home page is visible successfully

    When Click on "Signup / Login" button

    Then Verify "New User Signup!" is visible

    When Enter name and new email address

    And Click "Signup" button

    Then Verify that "ENTER ACCOUNT INFORMATION" is visible

    When Fill account information with title name email password and date of birth

    And Select "Sign up for our newsletter!" checkbox

    And Select "Receive special offers from our partners!" checkbox

    And Fill address information with first name last name company address country state city zipcode and mobile number

    And Click "Create Account" button

    Then Verify that "ACCOUNT CREATED!" is visible

    When Click "Continue" button

    Then Verify that "Logged in as username" is visible

    When Click "Delete Account" button

    Then Verify that "ACCOUNT DELETED!" is visible

    And Click "Continue" button