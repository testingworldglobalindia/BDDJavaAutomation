@LoginLogout
Feature: Test End to end search and payment using credit card

Background:
	Given User is on Login Page
	When User enters username


@Smoke
Scenario: Registration for Normal User and perform login and logout
	Given User is on Login Page
	When User enters username 
	And  User enters password
	And  User clicks on signin button
	Then User verify welcome message
	And  User verify home page display
	When User clicks on Compose button
	And User enter email id in To field
	And User enter Subject line
	And User enter body text
	And User click on Send button
	Then User verify email send success message
	When User click on Sent items link
	Then User verify email display in sent items
	When User click on Logout button
	Then User verify logged out message
	And User verify it navigate to login page
	
@Sanity
Scenario: Registration for Normal User and perform login and logout
	And  User enters password
	And  User clicks on signin button 
	
@Sanity  @Regression
Scenario: Registration for Normal User and perform login and logout
	And  User enters password
	And  User clicks on signin button 
	
	

	