Feature: example mapping

  Scenario Outline: postive search login
    Given User should be in login page
    When  User  enters valid credentials and performs login
    And   clicks the search tab and enters the first four letters of the product
    And   selects product from drop down
    And   click on find details
    And   adds the product to cart
    Then  User should be in add to cart page
    

    Examples: 
      | username  | password    |
      | Lalitha   | password123 |
