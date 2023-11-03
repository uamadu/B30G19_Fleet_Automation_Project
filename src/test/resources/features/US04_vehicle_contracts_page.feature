Feature: Access to Vehicle contracts page

  Scenario: Store managers and Sales managers access the Vehicle contracts page
    Given I am logged in as a "Store manager" or "Sales manager"
    When I navigate to the Vehicle contracts page
    Then the URL should be "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract"
    And the title should be "All - Vehicle Contract - Entities - System - Car - Entities - System"

  Scenario: Drivers should NOT be able to access the Vehicle contracts page
    Given I am logged in as a "Driver"
    When I try to navigate to the Vehicle contracts page
    Then the app should display "You do not have permission to perform this action."

