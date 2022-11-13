@smoke
Feature: F04_search | user should be able to search for products with either name of SKU

  Scenario Outline: user searches with a product name
    Given user presses at search
    When user enters "<name>" in search
    And presses on the search button
    Then user could search using name successfully

    Examples:
      | name  |
      | Nikon |
      | Apple |
      | Book  |

  Scenario Outline: user searching with SKU
    Given user presses at search
    When user enters "<SKU>" in search
    And presses on the search button
    And user clicks on the product in search result
    Then user could search using "<SKU>" successfully

    Examples:
      |    SKU    |
      | AP_MBP_13 |
      | SF_PRO_11 |
      | APPLE_CAM |
