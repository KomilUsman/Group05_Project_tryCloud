
@us13
Feature: As a user, I should be able to access to Contacts module.
Background:
   Given user is on login page


  Scenario Outline:  As a user, I should be able to access to Contacts module.
    When user enter valid "<username>" and "<password>"
    And user clicks submit button
    Then verify user is on the dashboard
    When user Click contacts module
    Then verify the contact names are in the list
    Examples:
      | username | password    |
      | User3    | Userpass123 |
      | User33   | Userpass123 |
      | User63   | Userpass123 |
      | User93   | Userpass123 |

