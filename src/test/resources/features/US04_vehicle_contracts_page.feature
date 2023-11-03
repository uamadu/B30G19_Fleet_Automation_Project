Feature: Access to Vehicle contracts page

  @login
  Scenario Outline: Store managers and Sales managers access the Vehicle contracts page
    Given I am logged in as a <userType>
    When I navigate to the Vehicle contracts page
    Then the URL should be <expectedURL>
    And the title should be <expectedTitle>
    Examples:
      | userType        | expectedURL                                                    | expectedTitle                                                          |
      | "Store manager" | "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract" | "All - Vehicle Contract - Entities - System - Car - Entities - System" |

  Scenario: Drivers should NOT be able to access the Vehicle contracts page
    Given I am logged in as a "Driver"
    When I try to navigate to the Vehicle contracts page
    Then the app should display "You do not have permission to perform this action."

