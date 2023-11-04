@B30G19-210
Feature: Default

	#Users with appropriate rolls should see 8 filters on the account page of customers section.
	@B30G19-207
	Scenario: Sales manage should see 8 filter items on the Accounts page
		Given   the user logged in as "Sales manager"
		    And    User click on the customer button
		    And    The "Sales manager" clicks on the Account option
		    And    The user clicks on the Filter option
		    And    The user should see the following filter items
		      | Account name  |
		      | Contact name  |
		      | Contact email |
		      | Contact phone |
		      | Owner         |
		      | Business Unit |
		      | Created At    |
		      | Updated At    |	

	#Users with appropriate rolls should see 8 filters on the account page of customers section.
	@B30G19-208
	Scenario: Store manager should see 8 filter items on the Accounts page
		Given   the user logged in as "Store manager"
		    And    User click on the customer button
		    And    The "Store manager" clicks on the Account option
		    And    The user clicks on the Filter option
		    And    The user should see the following filter items
		      | Account name  |
		      | Contact name  |
		      | Contact email |
		      | Contact phone |
		      | Owner         |
		      | Business Unit |
		      | Created At    |
		      | Updated At    |	

	#Users with appropriate rolls should see 8 filters on the account page of customers section.
	@B30G19-209
	Scenario: Driver should see 8 filter items on the Accounts page
		Given   the user logged in as "Driver"
		    And    User click on the customer button
		    And    The "Driver" clicks on the Account option
		    And    The user clicks on the Filter option
		    And    The user should see the following filter items
		      | Account name  |
		      | Contact name  |
		      | Contact email |
		      | Contact phone |
		      | Owner         |
		      | Business Unit |
		      | Created At    |
		      | Updated At    |