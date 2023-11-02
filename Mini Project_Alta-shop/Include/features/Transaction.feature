
@tag
Feature: Transaction
  I want to do a transaction
  
  Background: 
  Given I open website Alta shop dashboard to do transaction
  When I click beli button on a product in the dashboard
  And I click beli button on a different product in the dashboard
  And I click cart icon

  @tag1
  Scenario: Add product qty by click + button
  And I click + on first product qty
  Then qty product added
  
  Scenario: Reduce product qty by click - button
  And I click - on second product qty
  Then qty first product reduced
  
  Scenario: Reduce product qty by click - button until qty empty
  And I click - on second product qty
  And I click - on first product qty
  Then order is empty showed
  
  Scenario: Purchase Product
  And I click Bayar
  And I input email to login
  And I input Password to login
  And I click login to login
  Then I go transaction history

 Scenario: See transaction history
  And I click user icon
  And I input email to login
  And I input Password to login
  And I click login to login
  And I click menu transaction history 
  Then I go transaction history page
  
  