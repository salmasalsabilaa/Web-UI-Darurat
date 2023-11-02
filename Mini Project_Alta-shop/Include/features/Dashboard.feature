@tag
Feature: Dashboard
  I want to access dashboard page
  
  Background: 
  Given I open website Alta shop dashboard

  @tag1
  Scenario: select product to add to cart
    When I click beli button on a product
    Then I verify cart icon
  
  Scenario: select two identical product to add to cart
    When I click beli button on a product
    And I click beli button on same product
    Then I verify cart icon  
    
  Scenario: select two different product to add to cart
    When I click beli button on a product
    And I click beli button on different product
    Then I verify cart icon    

  Scenario: select product to see details
    When I click detail button on a product
    Then I directed to product detail
    
  Scenario: select category
    When I click category doropdown
    And I click gaming category
    Then I see gaming colection items 
    
  Scenario: delect category
    When I click X on category doropdown
    Then I directed to dashboard  
