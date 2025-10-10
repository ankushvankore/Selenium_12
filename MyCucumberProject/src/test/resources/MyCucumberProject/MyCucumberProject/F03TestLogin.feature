Feature: Login on Test Application

  Scenario: To validate login functionality on Test Application with valid data
    Given Open Test Application
    When Enter Valid username
    When Enter valid password
    And Click on Login button
    Then Home page should display

  Scenario: To validate login functionality on Test Application with invalid data
    Given Open Test App
    When Enter invalid username
    When Enter invalid password
    And I Click on Login button
    Then Error message should display
