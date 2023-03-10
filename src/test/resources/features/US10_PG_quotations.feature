@wipPelin
Feature: User should be able to manage quotations on the Sale page



    Scenario: Verify the POS managers are able to manage quotations on the Sales page.
      Given the user logged in as "POSmanager"
      And the user is on the Sales page
      And the user selects checkbox next to quotation number
      Then verify all checkboxes are selected


  Scenario: Verify the Sales managers are able to manage quotations on the Sales page.
    Given the user logged in as "Salesmanager"
    And the user is on the Sales page
    And the user selects checkbox next to quotation number
    Then verify all checkboxes are selected