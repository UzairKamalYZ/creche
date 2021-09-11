Feature: add baby

  Scenario: Registering baby
    Given a baby
    And parents want to register
    When admin register baby
    Then parents should recieve confirmation code.
