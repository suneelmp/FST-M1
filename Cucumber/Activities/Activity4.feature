@activity4
Feature: Login Test

@ScenarioLogin
Scenario: Testing Login without Examples
	Given User logs into the home page
	When User enters "admin" and "password"
	And Clicks the Submit button
	Then Get the confirmation text and verify message