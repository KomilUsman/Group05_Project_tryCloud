@us11
Feature: As a user, I should be able to access to Talks module.

  Background:
    Given user arrives on dashboard pages
    When user clicks "Talk" module

  Scenario:verify users can access to Talks module
    Then  Verify the page tile is "Talk - Trycloud"

  Scenario:  verify users can send message
    And Search a user from search box on the left
    And Write a message
    And Click submit button
    Then Verify the message is displayed on the conversation log