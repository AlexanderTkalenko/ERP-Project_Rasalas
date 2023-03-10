Feature: User should be able to manage quotations on the Sale page

  Background: User is already in the log in page
    Given the user is on the login page

  @wipPelin
    Scenario: Verify the POS managers are able to manage quotations on the Sales page.
      Given the user is logged in as POSmanager
      And the user is on the Sales page
      Then the user selects the Quotations under Orders
      And the user selects checkbox next to quotation number
      Then verify all checkboxes are selected


  Scenario: Verify the Sales managers are able to manage quotations on the Sales page.
    Given the user is logged in as Sales manager
    And the user is on the Sales page
    Then the user selects the Quotations under Orders
    And the user selects checkbox next to quotation number
    Then verify all checkboxes are selected