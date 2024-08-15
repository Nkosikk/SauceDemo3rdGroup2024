Feature: Login

  @login @regression @smoke
  Scenario Outline: As a user i want to login to sauce demo and verify that i can see the home page
    Given login page is displayed
    And I enter username <username>
    And I enter password <password>
    When I click login button
    Then Homepage is displayed
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |