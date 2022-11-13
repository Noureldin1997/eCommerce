@smoke
Feature: F08 | wishlist feature
  Scenario: scenario 1 wishlist
    When user adds a product to the wishlist
    Then the corresponding product should be added to the wishlist

  Scenario: scenario 2 wishlist
    When user adds a product to the wishlist
    Then the corresponding product should be added to the wishlist
    And the number of items in the list is updated