Feature: Access restriction to Vehicle Contracts page

  Background:
    Given the user has navigated to the application login page

  @access @driver
  Scenario: Drivers should NOT be able to access the Vehicle contracts page
    Given the user with role "Driver" is logged in
    When the user attempts to navigate to the Vehicle Contracts page
    Then the user should be redirected to an access denied page
    And the app should display the message "You do not have permission to perform this action."
