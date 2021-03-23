Feature: Validating IConnect ICM Functionality

  @Smoke1
  Scenario Outline: Validate IConnect User Login

    Given I am on IConnect application
    When I enter <Username> and <Password>
    Then I see the IConnect Home Page

    Examples:
      | Username   | Password   |
      | &USERNAME& | &PASSWORD& |


  @Smoke1
  Scenario: Checking campaign functionality

    Given I am on IConnect home page
    And  I click campaign button via Workspace
    And I select SMS and click continue
    When I add data tag and save template
    Then I should see the Please enter campaign name error message