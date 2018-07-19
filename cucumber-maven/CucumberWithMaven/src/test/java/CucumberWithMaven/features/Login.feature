Feature: Failed logon due to invalid credentials
	Stackoverflow user should not be able to login using invalid credentials

Scenario: Attempt to log into an account with invalid details
	Given user navigates to stackoverflow website
	And user clicks on the login button on homepage
	And user enters an invalid username and password combination
	When user clicks on the login button
	Then user should be informed their information is incorrect
	

	
