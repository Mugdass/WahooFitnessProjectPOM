@WahooTag
Feature: Find two random products and remove one to continue to the shopping cart
  I want to use this template for my feature file

  Scenario Outline: How to find two random products on Wahoo and checkout scenario outline
    Given I am on the Wahoo Homepage "https://wahoofitness.com/"
    When I Click On Shop button
    And I go back and forth to look for a random product to add to the cart until I find the two products
    And I Click On Shopping Cart Icon
    And I Make Sure Cart is Visible
    And I Remove one Item
    And I click OK in the pop up to Confirm
    And I again Make Sure Cart is Visible
    Then I verify a Successful Removal of that one item
    When I click on Edit Cart Link
    And I Change the Quantity
    And I Click Proceed Check Out button
    And I Click Blue Place Order button
    And I Click button to Exit Error Message
    And I type Email Address
    And I type First Name
    And I type Last Name
    And I type Street Address
    And I type City
    And I type Country
    And I type State
    And I type Zip Code
    And I Retype Zip Code
    And I type Phone Number
    And I click OK button on the Address Validation pop up to Continue
    And I Click a button To Switch To Express Shipping
    And I click to Select a Credit Card Option
    And I type Credit Card Number
    And I type Expiration Date
    And I type Cv
    And I click place order button
