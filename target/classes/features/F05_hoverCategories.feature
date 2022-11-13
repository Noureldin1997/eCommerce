@smoke
Feature: F05 | user should be able to select any sub-category appropriately
  Scenario: user should be able to hover categories and select sub-categories
    When user hovers electronics category
    And user selects Cell phones sub-category
    Then user should go to the sub category page successfully