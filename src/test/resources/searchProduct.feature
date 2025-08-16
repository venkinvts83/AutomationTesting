Feature: Search and Place the order on Products page

  Scenario Outline: Search experience for the user when he search product on Home Page and Offers page.
    Given User is on landing page
    When user searched with short name <Name> and extracted actual name of product
    Then user searched for the same short name <Name> in offers page to check if product exists
    Then validate product name matches with offers page product name
    Examples:
      | Name |
      | Tom  |
      | Beet |
      | Pot  |