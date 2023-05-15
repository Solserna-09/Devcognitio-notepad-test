Feature: online-notepad Page

  Scenario: Write a note
    Given user enters the online notepad site
    When the user selects the rich text note button and write a note
    Then the user will see that it was created successfully.