
Feature: Login Functionality on Application

  Background:
    Given Open the firefox and open xenonstack login page

  Scenario: Successful Login
    When User enters correct username and password
    Then User should be logged in successfully

  Scenario: Invalid Login
    When User enters incorrect username and password
    Then User should see an error message

    Scenario:
    When User enters wrong email and correct password
    Then User should see an error message1

    Scenario:
    When User enters correct email and wrong password
    Then User should see an error message2
