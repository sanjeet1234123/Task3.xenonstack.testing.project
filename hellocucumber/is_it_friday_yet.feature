#Feature: Is it Friday yet?
#  Everybody wants to know when it's Friday
#
#  Scenario: Sunday isn't Friday
#    Given today is Sunday
#    When I ask whether it's Friday yet
#    Then I should be told "Nope"
Feature: Reset functionality on login page of Application


  Scenario: Verification of Reset button


    Given Open the Firefox and launch the application


    When Enter the Username and Password


    Then Reset the credential
