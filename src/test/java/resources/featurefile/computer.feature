@regression
Feature: Login Test
As user I want to login into nop commerce website

  @smoke
  Scenario: User should verify Product Arrange In AlphaBatical Order
    Given I click on computer
    When I click on desktop
    Then I sort by position Z to A

  @sanity
  Scenario: User should verify Product Add to shopping cart sucessfully
    Given I click on computer
    When I click on desktop
    And I verify product arrange in decending order
    And I click on add to cart
    And I verify build your own computer
    And I select dual core function
    And I select Gb Functionality
    And I select hdd radio
    And I select Vista Premium Option
    And  I click on Microsoft Office Option
    And I verify Price Text
    And I click on Add to Card Button
    And I verify Procduct Added To Cart
    And I mouse Hove rOn Go To Cart
    And I verify Message Shopping Cart
    And I Change Quntity
    And I verify Total Price Text
    And I click On Check Box Tick
    And I click On Check Out Button
    And I click On Check Out As Guest Button
    And I send Text To First Name
    And I send Text To Last Name
    And I send Text To email field
    And I send Text To Country Field
    And I send Text To City Field
    And I send Text To Adress Field
    And I send Text To Zip Code Field
    And I send Text To Phone Number Field
    And I click On Countinue Button one
    And I click On Next Day Button
    And I click On Countinue Button two
    And I click On CreditCard Radio Button
    And I select credit Card Radio Button two
    And I click On Credit Card from The Option
    And I select Maste rCard Tye
    And I send Txt To Crd Holder Name
    And I send Txt To Card Number
    And I send Txt To Expire Month
    And I send Txt To Expire Yearr
    And I send Txt To Card Code Cvv
    And I click On Continue third
    And I verify Payment Method Credit Car
    And I verify Shipping Method Text
    And I verify Price text two
    And I click On Confirm Button Forth
    And I verify Thankyou Text
    And I verify Your Order Procced
    And I click on Final Continue
  Then I verify Welcome to Our Store