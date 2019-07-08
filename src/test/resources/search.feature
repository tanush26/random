@search
Feature: Search
  As a end user
  I want to search for a product
  So that i can view respective product

  @smoke
  Scenario: Search for a product
    Given I am Homepage
    When I search for a product "puma"
    Then I should be able to see respective product

  @regression
  Scenario Outline: Search for a product
    Given I am Homepage
    When I search for a "<product>"
    Then I should be able to see respective product
    Examples:
      | product |
      | AJ      |
      | puma    |
      | Nike    |


