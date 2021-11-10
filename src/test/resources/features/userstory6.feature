Feature: As a user, I should be able to access to Files module.
  Background:
    Given user is on login page

  Scenario Outline: verify user login successful "<username>"
    When user enters login "<username>" and "<password>"
    Then user clicks login button
    Then user arrives on dashboard page
    Then user go to files page
    Then user clicks the “+” icon on top
    Then user clicks “New Folder”
    Then user creates a folder name
    Then user clicks “Submit“ icon
    Then the folder is displayed on the page

    Examples:
      | username | password    |
      | User5    | Userpass123 |
