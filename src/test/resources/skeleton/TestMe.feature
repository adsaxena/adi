Feature: TestMe parameterisation

  Scenario Outline: TestMe login for multiple user
    Given I am launching the TestMe app in chrome
    And I click on sign-in link
    When I provide username <"Uname">
    And I provide password <"Pass">
    Then I click on login and verify login status

    Examples: 
      | Uname   | Pass        |
      | Lalitha | Password123 |
      | zxcvbnm | zxcvbnm123  |
