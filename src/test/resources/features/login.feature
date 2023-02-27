@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    Then the user should be see "<expectedType>" discuss module as dashboard
    Examples:
      | userType         | expectedType       |
      | posmanager       | POSManager23       |
      | crmmanager       | EventsCRMManager23 |
      | salesmanager     | SalesManager23     |
      | inventorymanager | InventoryManager23 |
      | expensesmanager  | ExpensesManager23  |


  Scenario: Verify the user is login
    Given the user logged in as "POSmanager"
    Then verify the "POSmanager" user type is logged in




