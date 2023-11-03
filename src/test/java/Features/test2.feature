
Feature: Functionality on Application

  Background:
    Given Open the firefox then open the xenonstack home page

  Scenario: Checking Contact us working
    When User click contact us
    Then User should be get to the contact us form

  Scenario: If we click xenonstack logo redirect to home page
    When User clicks Xenonstack logo At any Pages
    Then User should redirect to home page

  Scenario: Checking Take the First Step working
    When User click Take the First Step
    Then User get to see the content of Take the First Step

  Scenario: Checking search tab querry working properly or not
    When User click search buttom and search anythings
    Then Search engine is working properly

  Scenario: Checking search tab searchig content or not
    When User search try to search something
    Then User should get the content of the topic

  Scenario: Checking if something not found
    When User search something which is not present
    Then User see no results

