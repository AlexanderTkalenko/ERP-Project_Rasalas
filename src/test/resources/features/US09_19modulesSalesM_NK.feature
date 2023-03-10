Feature: As a sales manager, I should be able to see and access the different modules

  Background:User is already in the log in page
    Given the user logged in as "salesmanager"

  @verifyModulesNum
  Scenario: Verify that user as Sales Manager is able to access 19 modules
    And user is able to see 19 modules


  @outline
  Scenario Outline:
    Then user have access to each "<module>"
    Then module title should contain "<expectedTitle>"


    Examples:
      | module          | expectedTitle          |
      | Discuss         | Inbox                  |
      | Calendar        | Meetings               |
      | Notes           | Notes                  |
      | Contacts        | Contacts               |
      | CRM             | Pipeline               |
      | Sales           | Quotations             |
      | Website         | Dashboard              |
      | Point of Sale   | Point of Sale          |
      | Purchases       | Requests for Quotation |
      | Inventory       | Inventory              |
      | Repairs         | Repair Orders          |
      | Invoicing       | Customer Invoices      |
      | Email Marketing | Mass Mailings          |
      | Events          | Events                 |
      | Employees       | Employees              |
      | Leaves          | Leaves Summary         |
      | Expenses        | My Expenses to Submit  |
      | Maintenance     | Maintenance Teams      |
      | Dashboards      | My Dashboard           |









