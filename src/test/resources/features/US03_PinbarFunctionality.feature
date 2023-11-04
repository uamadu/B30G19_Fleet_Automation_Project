@B30G19-202
Feature: Default

	Background:
		#@B30G19-199
		Given the user is on the login page

	@B30G19-200
	Scenario Outline: US03_AC01TC01 Verify main header and image header for pinbar functionality 
		Given user logged in with "<username>" and "<password>"
		    When user click the “Learn how to use this space” link on the homepage,
		    Then user should see: “How To Use Pinbar”
		    And user should see “Use the pin icon on the right top corner of page to create fast access link in the pinbar.”
		    Examples:
		      | username        | password    |
		      | user2           | UserUser123 |
		      | storemanager52  | UserUser123 |
		      | salesmanager102 | UserUser123 |	


	@B30G19-201
	Scenario Outline: US03_AC02TC02  Verify the instruction image source
		Given user logged in with "<username>" and "<password>"
		    When user click the “Learn how to use this space” link on the homepage,
		    Then users should see an image on the page.
		    Examples:
		      | username        | password    |
		      | user2           | UserUser123 |
		      | storemanager52  | UserUser123 |
		      | salesmanager102 | UserUser123 |

