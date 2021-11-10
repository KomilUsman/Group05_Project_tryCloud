
@us14
Feature: As a user, I should be able to access search any item/ users from the homepage.

  Background:
    Given user arrives on dashboard pages
  Scenario: Verify users can search any files/folder/users from the search box.

    When User click magnifier icon on the right top
    Then Search any existing file,folder,user name
    Then  And Verify the app displays the expected result option
