Feature: User Registration and Login
@Order1

  Scenario: Register with valid details & Login with the same credentials
    Given I open the Magento homepage
    When I navigate to the registration page
    And I fill the registration form with valid data
    And I submit the registration form
    Then I should see a registration success message
    
    
    Given I open the Magento homepage
    When I navigate to the login page
    And I enter valid login credentials
    And I click the login button
    Then I should be logged in successfully
    And I should get logged out successfully