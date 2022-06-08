Feature: Search and place the order for products
@OfferPage
  Scenario Outline: Search exprince for product search in both home and Offer page
    Given User is on GreenCart Landing Page
    When  User searched for Short name <name> and extract actual name of the product
    Then  User searched for <name> shortname in offer page
    And Validate product name in offers page matched with Landing Page

Examples:
    |name |
    |Tom  |
    |Beet |