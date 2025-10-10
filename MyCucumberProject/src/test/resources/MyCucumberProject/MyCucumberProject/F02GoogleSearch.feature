Feature: Google Search

  Scenario: To validate search functionality on Google
    Given Open Google
    When Enter keyword to search
    And Hit Enter key
    Then A valid search should display
