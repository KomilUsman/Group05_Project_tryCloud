Feature:As a user, I should be able to add file to favorites.

  Background:
    Given user arrives on dashboard pages
    When user clicks "Files" module

  Scenario:  As a user I should be able to  add a file to favorites.

    When user click action-icon from any file on the page
    And user choose "Add to Favorites" option
    And user click "Favorites" sub-module on the lest side
    Then  Verify the chosen file is listed on the table
  #(Pre-condition: there should be at least 1 file is uploaded)

