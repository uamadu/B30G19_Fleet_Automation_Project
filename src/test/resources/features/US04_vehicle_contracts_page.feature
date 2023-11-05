Feature: Access to Vehicle contracts page


  Scenario: Store manager or sales manager access to Vehicle contracts page
    Given I am on the login page
    When I login as a store manager or sales manager with username "storemanager55" and password "UserUser123"
    And I click on the fleet drop
    And I select the Vehicle Contracts
    Then I should be on the Vehicle Contracts page



  Scenario: Drivers should NOT be able to access the Vehicle contracts page
    Given I am on the login page
    When I login as a driver with username "user200" and password "UserUser123"
    And I click the Vehicle Contracts
    Then the app should display "You do not have permission to perform this action."
