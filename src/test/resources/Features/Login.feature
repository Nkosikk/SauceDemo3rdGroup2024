@login @regression @smoke
Feature: Login

  @invalidlogin
  Scenario Outline: As a user i want to login to sauce demo and verify that i can see the home page
    Given login page is displayed
    And I enter username <username>
    And I enter password <password>
    When I click login button
    Then Homepage is displayed
    Examples:
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user    | secret_sauce |
      | error_user      | secret_sauce |
      | visual_user     | secret_sauce |

  Scenario Outline: As a user i want to login with invalid details and verify that i can see the home page
    Given login page is displayed
    And I enter username <username>
    And I enter password <password>
    When I click login button
    Then validate erorr message returned
    Examples:
      | username        | password     |
      | standard        | secret_sauce |
      | locked_out_user | secr_sauce   |
      | problem         | ret_sauce    |
