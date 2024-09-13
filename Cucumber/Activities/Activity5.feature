@activity5
Feature: Data driven test with Example

Scenario Outline: Testing with Data from Scenario
    Given User logs into the home page
    When User enters "<Usernames>" and "<Passwords>"
    Then Get the confirmation text and verify message
    
Examples:
    | Usernames | Passwords |
    | admin     | password  |
    | adminUser | Password  |
