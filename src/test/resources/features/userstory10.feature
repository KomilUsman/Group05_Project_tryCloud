Feature: As a user, I should be able to access to Files module.

  Background:
    Given user is on login page

  Scenario Outline: verify user login successful "<username>"
    When user enters login "<username>" and "<password>"
    Then user clicks login button
    Then user arrives on dashboard page
    Then user go to files page
    Then verify user can click any button

    Examples:
      | username | password    |
      | User5    | Userpass123 |

    Scenario Outline:
      When user enters login "<username>" and "<password>"
      Then user clicks login button
      Then user arrives on dashboard page
      Then user go to files page
      When user check the current storage
      And user upload file
      And refresh the page
      Then verify the storage usage is increased

    Examples:
      | username | password    |
      | User5    | Userpass123 |