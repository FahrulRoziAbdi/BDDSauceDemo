@CheckOut
Feature: Checkout
  As a user I want to finish Checkout

  Scenario: Checkout product
    Given User already on login page
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page
    When User sorting product list by "Name (Z to A)"
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

#    Given User is on the login page
#    When User inputs "standard_user" as the userName and "secret_sauce" as the password
#    Then User is redirected to the product page
#    When User sorts the product list by "Name (Z to A)"
#    And User picks the product "Test.allTheThings T-Shirt Red"
#    And User picks the product "Sauce Labs Onesie"
#    Then User proceeds to checkout
#    And User verifies that the products are in the cart list
#    And User removes "Test.allTheThings T-Shirt Red" from the cart
#    And User clicks on checkout
#    Then User is redirected to the checkout overview page
#    When User inputs "fahrul" as the firstname, "tampan" as the lastname, and "1234" as the postcode
#    Then User is redirected to the checkout summary page
#    And User verifies the item total
#    And User wants to finish the checkout in the cart
#    Then User is redirected to the complete checkout page
