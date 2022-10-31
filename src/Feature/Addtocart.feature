Feature: Adding  products to  cart

  Scenario: Adding a product to cart from popular category

  Given Navigate to website
  And user selects the product from the popular category
  When user adds the product to cart
  Then The product is added to cart successfully

