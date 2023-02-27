Feature: user should verify number of modules

  Background:
    Given the user is oo login page

  @wip
  Scenario: Verify the POS managers access to 22 modules.
    Given the user is logged in as POSmanager
    Then verify all enable modules equals 22