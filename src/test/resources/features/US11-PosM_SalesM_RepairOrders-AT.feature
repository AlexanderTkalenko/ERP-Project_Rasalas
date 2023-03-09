@us11
Feature: user should be able to manage repair orders on the Repairs page


  Scenario: verify the user can select all the repair orders by clicking the top checkbox
    Given the user logged in as "POSmanager"
    When the user go to the Repairs page
    And the user is select all the repair orders by clicking "Repair Reference" checkbox


  Scenario: verify the user can select all the repair orders by clicking the top checkbox
    Given the user logged in as "Salesmanager"
    When the user go to the Repairs page
    And the user is select all the repair orders by clicking "Repair Reference" checkbox