@place_order_anonymous
Feature: place an order without credit card
  Context:
      As a QA engineer,
      I want to verify that user can place an order without a credit card,
      so that user can perform an order

  Scenario: Add to cart anonymous
    Given User opens the index page
    And try to perform an order without credit card
    Then order should be validated