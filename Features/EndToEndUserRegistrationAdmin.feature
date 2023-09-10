@LoginLogoutAdmin
Feature: Feature is to test usre registration and perform login - logout

Background:
	Given User is on Login Page
	When User enters username


@Smoke
Scenario: Registration for Normal User and perform login and logout
	And  User enters password
	And  User clicks on signin button 
	Then User should be logged in
	
@Sanity
Scenario: Registration for Normal User and perform login and logout
	And  User enters password
	And  User clicks on signin button 
	
@Sanity  @Regression
Scenario: Registration for Normal User and perform login and logout
	And  User enters password
	And  User clicks on signin button 
	