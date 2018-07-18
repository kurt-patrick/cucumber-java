Feature: Log into account
	Existing stackoverflow user should be able to login using correct credentials

Scenario: Log into account with correct details
	Given user navigates to stackoverflow website
	And user clicks on the login button on homepage
	And user enters a valid username
	And user enters a valid password
	When user clicks on the login button
	Then user should be taken to the successful login page
	

	
