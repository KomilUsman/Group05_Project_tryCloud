
@us13
Feature: As a user, I should be able to access to Contacts module.
Background:
   Given user is on login page


  Scenario:  As a user, I should be able to access to Contacts module.
    Then verify user is on the dashboard
    When user Click contacts module
    Then verify the contact names are in the list


