@filters
Feature: Filters
  As a end user
  I want filter the search results
  So that i can view refined products

  Scenario: Filter By customer Rating
    Given I am Homepage
    When I search for a product "nike"
    And I select a customer rating as "2or more"
    Then I should be able to see product with in range of customer rating




