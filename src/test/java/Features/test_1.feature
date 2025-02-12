Feature: This is test1 login feature
  Background:
    Given User open browser
    When User Hit URL
    Then User land on HomePage of Application

@TabValidation
  Scenario: To verify user is able to log-in into application
    Given When user is on Home Page
    When User enters user name as "test_1" and
    And User enters password as "Pass@111"
    Then User successfully logged into application
@WebValidation
  Scenario Outline: To verify user is able to log-in into application with multiple credentials
    Given When user is on Home Page
    When User enters user name as "<username>" and
    And User enters password as "<password>"
    Then  User successfully logged into application
    Examples:
    |username|password|
    |user1   |pwd 1   |
    |user2   |pwd 2   |
    |user3   |pwd 3   |