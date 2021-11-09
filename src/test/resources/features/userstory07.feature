Feature: As a user, I should be able to delete a file / folder.


  Background:
    Given user is on login page

  Scenario Outline: verify user login successful "<username>"
    When user enters login "<username>" and "<password>"
    Then user clicks login button
    Then user arrives on dashboard page
    Then user go to files page

    Then user clicks delete files option
    Then user verifies deleted file is displayed on the page
    Examples:
      | username | password    |
      | User5    | Userpass123 |
      | User35   | Userpass123 |
      | User65   | Userpass123 |
      | User95   | Userpass123 |

