@B30G19-222
Feature: Default

	Background:
		#@B30G19-211
		Given the user is on the login page of VyTrack application
		


	@B30G19-220
	Scenario: US07AC01 CheckBox options verification for Store Manager
		Given the user logged in as "store manager"
		    When user in on the Fleet-Vehicle page
		    Then user sees all checkboxes as unchecked
		    And user clicks on first checkbox
		    And user sees all cars checked
		    And user clicks in first checkbox
		    And user sees all cars unchecked
		    And user clicks on 3rd checkbox to check a car
		    Then user sees the checkbox is checked	


	@B30G19-221
	Scenario: US07AC02 CheckBox options verification for Sales Manager
		Given the user logged in as "sales manager"
		    When user in on the Fleet-Vehicle page
		    Then user sees all checkboxes as unchecked
		    And user clicks on first checkbox
		    And user sees all cars checked
		    And user clicks in first checkbox
		    And user sees all cars unchecked
		    And user clicks on 3rd checkbox to check a car
		    Then user sees the checkbox is checked