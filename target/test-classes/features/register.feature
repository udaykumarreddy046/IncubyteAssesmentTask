Feature: User Registration
  Scenario: Register with valid details
    Given I open the Magento homepage
    When I navigate to the registration page
    And I fill the registration form with valid data
    And I submit the registration form
    Then I should see a registration success message
