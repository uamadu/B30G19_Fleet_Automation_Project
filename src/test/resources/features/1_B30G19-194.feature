@B30G19-206
Feature: Default
	Background: User is already in the log in page
		    Given the user is on the login page
		

	#{color:#de350b}{*}User Story{*}:{color}  As a user, I want to see edit car info icons from the Vehicle page.
	#
	# 
	#
	#{color:#de350b}*AC #1:*  {color}users should see “{*}view, edit, delete{*}” when they hover the mouse over the 3 dots “…” 
	@B30G19-203
	Scenario: US06TC1 As a driver user, I want to see edit car info icons from the Vehicle page.
		    Given user is already logged in as driver
		    When user hover over to Fleet and click Vehicles
		    Then user is on the All Cars page and hover over to three dots
		    And user should see below info signs while hovering over
		    |View|
		    |Edit|
		    |Delete|	

	#{color:#de350b}*User Story* :{color}  As a user, I want to see edit car info icons from the Vehicle page.
	#
	# 
	#
	#{color:#de350b}*AC #1:*  {color}users should see “{*}view, edit, delete{*}” when they hover the mouse over the 3 dots “…” 
	@B30G19-204
	Scenario: US06TC2As a store manager, I want to see edit car info icons from the Vehicle page.
		    Given user is already logged in as storeManager
		    When user move to element over to Fleet and click Vehicles
		    Then user is on the All Cars page and move to  over to three dots
		    And user should see below info signs while moving to three dots over
		      |View|
		      |Edit|
		      |Delete|	

	#{color:#de350b}*User Story* :{color}  As a user, I want to see edit car info icons from the Vehicle page.
	#
	# 
	#
	#{color:#de350b}*AC #1:*  {color}users should see “{*}view, edit, delete{*}” when they hover the mouse over the 3 dots “…” 
	@B30G19-205
	Scenario: US06TC3 As a sales manager, I want to see edit car info icons from the Vehicle page.
		    Given user is already logged in as salesManager
		    When user move to element over to Fleet and click Vehicles
		    Then user is on the All Cars page and move to  over to three dots
		    And user should see below info signs while hovering over
		      |View|
		      |Edit|
		      |Delete|