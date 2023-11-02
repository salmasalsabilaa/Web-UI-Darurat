@tag
Feature: Register
  I want to create new user in register
  
  Background: 
  Given I open website Alta shop
  When I click login icon
  And I click register button

  @Register-valid-data
  Scenario: Register with valid data nama lengkap, email, and password
     And I input valid nama_lengkap
     And I input valid email
     And I input valid password
     And I clik register button
     Then I able to create new user
  
  @Register-alreadyused-data
  Scenario: Register with valid data nama lengkap,password, and already used email
     And I input valid nama_lengkap
     And I input valid email
     And I input valid password
     And I clik register button
     Then I able to see alert   
  
  @Register-invalid-data   
  Scenario Outline: Register with Invalid data Nama Lengkap, email, and password
    And I input <nama_lengkap> in field nama_lengkap
    And I input <email> in field email
    And I input <password> in field password
    And I clik register button
    Then I able to see alert

    Examples: 
      | nama_lengkap| email         | password |
      |             |john@gmail.com | J0hnD_   |
      | John Doe    |               | J0hnD_   |
      | John Doe    |john@gmail.com |          |
      |             |               |          |
      
     
        