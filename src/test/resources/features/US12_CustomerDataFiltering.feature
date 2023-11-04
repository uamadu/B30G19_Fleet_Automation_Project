@thisss
Feature:  filter customers’ info on the Account page



  Scenario: Sales manager role and filter option on account page
    Given   the user logged in as "sales manager"
    And    User click on the customer button
    And    The "sales manager" clicks on the Account option
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



  Scenario: Store manager role and filter option on account page
    Given  the user logged in as "store manager"
    And    User click on the customer button
    And    The "store manager" clicks on the Account option
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


  Scenario: Driver role and filter option on account page
    Given   the user logged in as "driver"
    And    User click on the customer button
    And    The "driver" clicks on the Account option
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

