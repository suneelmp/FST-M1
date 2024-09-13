Feature: Activity2

@ScenarioLogin
Scenario: Login
	Given User logs into the page
	When User enters username and password
	And Clicks the Submit button
	Then Get the confirmation text and verify message