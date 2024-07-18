Feature: Learn More login page validation

  @LM
  Scenario: Validate the login page with valid username and password
    #Given User navigate to the LearnMore login page
    When User enter the username "LearnMore" and password "Abc"
    And User clicks the Login button
    Then User validates the Login error message

