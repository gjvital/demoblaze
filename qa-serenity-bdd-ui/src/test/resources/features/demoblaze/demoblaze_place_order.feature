@place_order
Feature: Perform and order with different type of credit card
  Context:
      As a QA engineer,
      I want to verify that demoblze accept AMEX and VISA credit card as payment method,
      so that user can place orders 

  Scenario: Place an order using AMEX credit card
    Given User opens the index page
    And go to Laptops section
    And Find MacBook Pro, and add it to cart 
    And Go to cart click “Place Order” button
    When user Fill with bellow mocked information
    Then Verify the purchase confirmation succeed

  Scenario: Place an order using VISA credit card
    Given User opens the index page
    And go to Laptops section
    And Find MacBook Pro, and add it to cart 
    And Go to cart click “Place Order” button
    When user Fill with bellow mocked information
    Then Verify the purchase confirmation succeed