@Sales
  Feature: Sales
    As a user I want to finish Checkout

  Scenario: User sort product cart
    Given User already on login page
    When User input "standar_user" as userName and input "secret_sauce" as password
    Then User already on product page
    When User sorting product list by "Name (Z to A)"
