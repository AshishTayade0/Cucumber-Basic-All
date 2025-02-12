Feature: This is test2 login feature
  Background:
    Given User open browser
    When User Hit URL
    Then User land on HomePage of Application
  #without tag
  Scenario: To verify user is not able to log-in into application
    Given When user is on Home Page
    When User enters user name as "null" and
    And User enters password as "null"
    Then User should not logged into application
@MobileValidation
  Scenario: To verify user is able to log-in into application
    Given When user is on Home Page
    When User enters user name as "test_2" and
    And User enters password as "Pass@222"
    Then User successfully logged into application
@WebValidation @MobileValidation
  Scenario Outline: To verify user is able to log-in into application with multiple credentials
    Given When user is on Home Page
    When User enters user name as "<username>" and
    And User enters password as "<password>"
    Then  User successfully logged into application
    Examples:
    |username|password|
    |user21  |pwd 21  |
    |user22  |pwd 22  |
    |user23  |pwd 23  |