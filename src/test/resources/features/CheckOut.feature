@CheckOut
Feature: Checkout
  As a user I want to finish Checkout

  Scenario: Checkout product
    Given User already on login page
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page
    And User sorting product list by "Name (Z to A)"
    And User pick product Test.allTheThings T-Shirt Red
    And User pick product Sauce Labs Onesie
    Then User checkout product
    And User verify that products in a cart list
    And User remove Test.allTheThings T-Shirt Red from Cart
    And User click checkout
    Then User already on check out overview page
    When User input "fahrul" as firstname, input "tampan" as lastname, and input "1234" as postcode
    Then User already on checkout summary page
    And User verify item total
    And User want to finish CheckOut in Cart
    Then User has already on Complete checkout
