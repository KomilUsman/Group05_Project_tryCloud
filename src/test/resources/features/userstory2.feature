Feature: As a user,
  I should be access all the main modules of the app.

  Scenario Outline:  verify users access to the main modules
    Given user is on homePage
    Then Verify user see the following modules"<main modules>"
    Examples:
      | main modules   |
      | Dashboard Desk |
      | Files          |
      | Photos         |
      | Activity       |
      | Talk           |
      | Contacts       |
      | Circles        |
      | Calendar       |
      | Desk           |

