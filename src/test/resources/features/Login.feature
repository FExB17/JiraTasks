@test
Feature: Login functionality

  Agile story: As a user I should be able to login with valid credentials


  Background: For all scenarios user has to be already on the login page
    Given User is on login page

  @humanResources
  Scenario Outline: Login as a  user
    When User enters valid username "<username>"
    And User enters valid password "<password>"
    And User clicks login button
    Then User should be logged in

    @humanResources
    Examples:
      | username                 | password |
      | hr1@cybertekschool.com   | UserUser |
      | hr2@cybertekschool.com   | UserUser |
      | hr3@cybertekschool.com   | UserUser |
      | hr4@cybertekschool.com   | UserUser |
      | hr5@cybertekschool.com   | UserUser |
      | hr6@cybertekschool.com   | UserUser |
      | hr99@cybertekschool.com  | UserUser |
      | hr100@cybertekschool.com | UserUser |
      | hr101@cybertekschool.com | UserUser |

    @marketing
    Examples:
      | username                        | password |
      | marketing1@cybertekschool.com   | UserUser |
      | marketing2@cybertekschool.com   | UserUser |
      | marketing3@cybertekschool.com   | UserUser |
      | marketing4@cybertekschool.com   | UserUser |
      | marketing5@cybertekschool.com   | UserUser |
      | marketing6@cybertekschool.com   | UserUser |
      | marketing99@cybertekschool.com  | UserUser |
      | marketing100@cybertekschool.com | UserUser |
      | marketing101@cybertekschool.com | UserUser |

    @helpdesk
    Examples:
      | username                       | password |
      | helpdesk1@cybertekschool.com   | UserUser |
      | helpdesk2@cybertekschool.com   | UserUser |
      | helpdesk3@cybertekschool.com   | UserUser |
      | helpdesk4@cybertekschool.com   | UserUser |
      | helpdesk5@cybertekschool.com   | UserUser |
      | helpdesk6@cybertekschool.com   | UserUser |
      | helpdesk99@cybertekschool.com  | UserUser |
      | helpdesk100@cybertekschool.com | UserUser |
      | helpdesk101@cybertekschool.com | UserUser |

 # @marketing
 # Scenario Outline: Login as a marketing user
  #  When User enters valid username "<username>"
  #  And User enter valid password "<password>"
  #  And User clicks login button
   # Then User should be logged in


  #  Examples:
      | username                        | password |
      | marketing1@cybertekschool.com   | UserUser |
      | marketing2@cybertekschool.com   | UserUser |
      | marketing3@cybertekschool.com   | UserUser |
      | marketing4@cybertekschool.com   | UserUser |
      | marketing5@cybertekschool.com   | UserUser |
      | marketing6@cybertekschool.com   | UserUser |
      | marketing99@cybertekschool.com  | UserUser |
      | marketing100@cybertekschool.com | UserUser |
      | marketing101@cybertekschool.com | UserUser |



 # @helpdesk
 # Scenario Outline: Login as a helpdesk user
 #   When User enters valid username "<username>"
 #   And User enter valid password "<password>"
  #  And User clicks login button
  #  Then User should be logged in


 #   Examples:
      | username                       | password |
      | helpdesk1@cybertekschool.com   | UserUser |
      | helpdesk2@cybertekschool.com   | UserUser |
      | helpdesk3@cybertekschool.com   | UserUser |
      | helpdesk4@cybertekschool.com   | UserUser |
      | helpdesk5@cybertekschool.com   | UserUser |
      | helpdesk6@cybertekschool.com   | UserUser |
      | helpdesk99@cybertekschool.com  | UserUser |
      | helpdesk100@cybertekschool.com | UserUser |
      | helpdesk101@cybertekschool.com | UserUser |