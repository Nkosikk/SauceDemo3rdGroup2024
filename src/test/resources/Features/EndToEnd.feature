Feature: End To End

  @login @regression @smoke @endToEnd
  Scenario Outline: As a user i want to login to sauce demo and verify that i can see the home page
    Given login page is displayed
    And I enter username <username>
    And I enter password <password>
    When I click login button
    Then Homepage is displayed
    And I add item to cart
    And I clicks the Shopping cart

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |