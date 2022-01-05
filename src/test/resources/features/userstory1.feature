@test @ui @smoke
Feature: As a user I should be able to login with valid credentials


  Background:
    Given user is on login page


  Scenario Outline: verify user login successful "<username>"
    When user enters login "<username>" and "<password>"
    Then user clicks login button
    Then user arrives on dashboard page
    Examples:
      | username | password    |
      | User5    | Userpass123 |
      | User35   | Userpass123 |
      | User65   | Userpass123 |
      | User95   | Userpass123 |



  Scenario Outline: verify invalid user login unsuccessful "<username>"
    When user enters login "<username>" and "<password>"
    Then user clicks login button
    Then user gets error message
    Examples:
      | username | password    |
      | Uaser5    | Userpass123 |

