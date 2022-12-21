@regression
Feature: Login Test
  As user I want to login into nop commerce website

  @smoke
  Scenario: User should verify Page Navigation
    Given I click on computer
    When I click on electronics
    And I click on appearals
    And I click on digital downloads
    And I click on books
    And I click on jewelary
    Then I click on gift cards

