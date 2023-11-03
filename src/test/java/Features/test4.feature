Feature: Action Functionality on Application

  Background:
    Given Open the firefox , open the xenonstack home page

  Scenario: Checking hover on services accelerator industries resources company working on not
    When User hover any five heading
    Then User should able to see five heading topics

  Scenario: Checking hover link services accelerator industries resources company working on not
    When User hover accelerator heading
    Then User should able to see content of accelerator and click to it

    When User hover services heading
    Then User should able to see content of services and click to it

    When User hover industries heading
    Then User should able to see content of industries1 and click to it

    When User hover resources heading
    Then User should able to see content of industries and click to it

    When User hover company heading
    Then User should able to see content of company and click to it



