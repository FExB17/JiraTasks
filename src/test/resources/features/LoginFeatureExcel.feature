@test
Feature: Login functionality

  Agile story: As a user I should be able to login with valid credentials


  Background: For all scenarios user has to be already on the login page
    Given User is on login page

  @humanResources
  Scenario: Login as a Human Resources user
    When "Human Resources" User enters valid username and password
    # And User enters valid password
    # And User clicks login button
   # Then User should be logged in


  @marketing
  Scenario: Login as a marketing user
    When "Marketing" User enters valid username and password
    # And User enters valid password
   # And User clicks login button
   # Then User should be logged in


  @helpdesk
  Scenario: Login as a helpdesk user
    When "Helpdesk" User enters valid username and password
    # And User enters valid password
    # And User clicks login button
   # Then User should be logged in