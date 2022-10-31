
Feature: Search product

Scenario: Verify Search Results by searching an item

  Given Navigate to website
  When User search for a product blouse
  Then User get the product related to "<blouse>"
