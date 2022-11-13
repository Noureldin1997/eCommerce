@smoke
Feature: F03_currencies | user should be able to change the currency correctly
  Scenario:user changing the currency to change the currency of the product
    When user chooses currency
    Then the Euro sign is visible