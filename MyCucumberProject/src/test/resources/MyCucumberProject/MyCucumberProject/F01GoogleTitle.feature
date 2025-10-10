Feature: Google Titile

  Scenario: To validate title of Google
    Given Open Google
    When Read the title of page
    Then Title should be Google
