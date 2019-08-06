Feature: Search product
  Test user can search any specific product

  Scenario: search using full text
    Given user is displayed with amazon home page
    When user enters the search "iphone"
    And click the search button
    Then "iphone" page should be displayed    