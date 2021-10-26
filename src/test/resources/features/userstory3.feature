Feature: Access to Files module
  As a user,
  I should be able to access to Files module.

  Background:
    Given user is on login page


  Scenario Outline: verify users can access to Files module
    When user enters with valid credentials "<username>" and "<password>"
    When user clicks on login button
    Then verify the page title is "Files - Trycloud"

    Examples:
      | username | password    |
      | User5    | Userpass123 |

  @us_03
    Scenario Outline:verify users can select all the uploaded files from the page
      When user enters with valid credentials "<username>" and "<password>"
      When user clicks on login button
      When user clicks the top left checkbox of the table
      Then verify all files are selected

      Examples:
        | username | password    |
        | User5    | Userpass123 |