Feature: Verifying categories

Scenario: Verify filters are working

Given Navigate to website
When User clicks on Womens category
And user selects color black and category tops
Then results are filtered based on selection