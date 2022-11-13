@smoke
Feature: F06 | clicking the home sliders
  Scenario: clicking the nokia home slider should direct to the appropriate URL
    When user clicks on the nokia slider
    Then the user should be directed to the correct nokia product
  Scenario: clicking the iphone home slider should direct to the appropriate URL
    When user clicks on the iphone slider
    Then the user should be directed to the correct iphone product