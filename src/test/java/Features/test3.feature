Feature: Performance on Application

  Background:
    Given Open the firefox and open the xenonstack home page

  Scenario: Checking the loading time of the websites
    When User go the websites
    Then measure websites load time