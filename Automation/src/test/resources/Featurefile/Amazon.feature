Feature: To validate the amazon functionality

  @Amazon
  Scenario: User verifies the search functionality
    #Given User login to the Amazon home page
    When User enter the "iPhone" in the search box
    And User clicks on the Search icon
    Then User validates the search result with the page title

    @MouseActions
    Scenario: Mouse hower actions
      Given User login to the Amazon home page
      When user hower the mouse on the login
      And user clicks on the category dropdown

      @Table
      Scenario: Table handling
        Given User extract the table column values


