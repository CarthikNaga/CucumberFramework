Feature:place the order for products
@PlaceOrder
  Scenario Outline: Search exprince for product search in both home and Offer page
    Given User is on GreenCart Landing Page
    When  User searched for Short name <name> and extract actual name of the product
    And Added "3" items of the selected product to cart
    Then User proceeds to Chekcout and validate the <name> items in checkout page
    And Verify user has ability to enter promo code and place the order

Examples:
    |name |
    |Tom  |