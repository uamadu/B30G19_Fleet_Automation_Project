@B30G19-216
Feature: Default


	@B30G19-213

		Scenario: Menu Options for salesmanager
		    Given the user is on the login page
			When  the user logged in with username as "salesmanager101" and password as "UserUser123"
		    Then user should be able to see following modules
		      | Dashboards         |
		      | Fleet              |
		      | Customers          |
		      | Sales              |
		      | Activities         |
		      | Marketing          |
		      | Reports & Segments |
		      | System             |	


	@B30G19-214

		Scenario: Menu Options for store manager
		    Given the user is on the login page
		    When  the user logged in with username as "storemanager85" and password as "UserUser123"
		    Then user should be able to see following modules
		      | Dashboards         |
		      | Fleet              |
		      | Customers          |
		      | Sales              |
		      | Activities         |
		      | Marketing          |
		      | Reports & Segments |
		      | System             |	


	@B30G19-215

		Scenario: Menu Options for driver
		    Given the user is on the login page
		    When the user logged in with username as "user1" and password as "UserUser123"
		    Then user should be able to see following modules
		      | Fleet      |
		      | Customers  |
		      | Activities |
		      | System     |