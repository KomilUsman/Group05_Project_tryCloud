Feature: As a user,
  I should be access all the main modules of the app.

  Background:
    Given user is on login page


  Scenario Outline:  verify users access to the main modules
    When user enter with valid credentials "<username>" and "<password>"
    When user clicks login button
    Then Verify user see the following modules
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |
      | More      |
    Examples:
      | username | password    |
      | User5    | Userpass123 |
      | User35   | Userpass123 |
      | User65   | Userpass123 |
      | User95   | Userpass123 |



