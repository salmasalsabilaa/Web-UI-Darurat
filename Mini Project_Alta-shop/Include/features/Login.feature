@tag
Feature: Login
  I want to login to my account
  
  Background: 
  Given I open website Alta shop for login
  When I click login icon on dashboard

  @Login-valid-data
  Scenario: Login with valid data nama lengkap, email, and password
     And I input valid email in login page
     And I input valid password in login page
     And I clik login button on login page
     Then I able to direct to dashboard
  
  @Login-valid-data
  Scenario Outline: Login with Invalid data Nama Lengkap, email, and password
    And I input <email> in field email in login page
    And I input <password> in field password in login page
    And I clik login button on login page
    Then I able to see alert in login page

    Examples: 
      | email         | password |
      |jon@gmail.com  | J0hnD_   |
      |john@gmail.com | J0hnD    |
      |               | J0hnD_   |
      |john@gmail.com |          |
      |               |          |