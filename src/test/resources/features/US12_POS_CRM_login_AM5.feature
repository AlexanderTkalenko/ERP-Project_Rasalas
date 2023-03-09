@wip
Feature: User valid login
  User Story:
  As a POS and event CRM manager, I should be able to Login with valid credentials

  Scenario Outline: Verify user information email
    Given I am on the login page
    When I login using "<email>" and "<password>"
    Then account holder name should be "<name>"
    @posmanager
    Examples:
      | email                 | password   | name         |
      | posmanager55@info.com | posmanager | POSManager55 |
      | posmanager67@info.com | posmanager | POSManager67 |
      | posmanager89@info.com | posmanager | POSManager89 |


    @eventcrmmanager
    Examples:
      | email                       | password         | name               |
      | eventscrmmanager55@info.com | eventscrmmanager | EventsCRMManager55 |
      | eventscrmmanager67@info.com | eventscrmmanager | EventsCRMManager67 |
      | eventscrmmanager89@info.com | eventscrmmanager | EventsCRMManager89 |



