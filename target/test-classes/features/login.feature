Feature: User Login
  Scenario: Login with valid credentials
    Given I open the Magento homepage
    When I navigate to the login page
    And I enter valid login credentials
    And I click the login button
    Then I should be logged in successfully