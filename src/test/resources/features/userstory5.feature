Feature:As a user, I should be able to able to access to Files module.

  Background:
    Given user is on login page

    Scenario Outline: verify user login successful "<username>"
      When user enters login "<username>" and "<password>"
      Then user clicks login button
      Then user arrives on dashboard page

      Then user go to files page
      Then user clicks Remove from Favorites
      Then user verifies  that the file is removed from Favorites sub-module’s table

      Examples:
        | username | password    |
        | User5    | Userpass123 |



