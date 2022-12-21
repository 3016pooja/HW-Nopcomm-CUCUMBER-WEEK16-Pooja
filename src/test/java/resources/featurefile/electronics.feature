Feature: Login Test
  As user I want to login into nop commerce website

  @smoke
  Scenario: User should Navigate To Cell Phones Page Successfully
    Given I click on electronics
    When I  mouse Hove rOn CellPhone
    Then I verify text CellPhones

  @sanity
  Scenario: User should verify That The Product Added  And Place OrderSuccessfully
  Given I click on electronics
 When I click on Cell Phones optin
 And I get Verify CellPhones
#    And I click List View
    And I click On Nokia Lumia
#     And I click on nokia lumia again
    And I send Change Quantity Two
    And I click Add To Cart
#     And I verify text of nokia
#     And I cick on shopping cart button
    And I Verify Product Added
    And I click Close Alert
    And I click Shopping Cart
    And I verify Shopping cart Text
    And I verify Price Text elecronic
    And I click On Agree Terms and Servicesr
    And I click On Chekout
    And I verify Welcome SignIn
    And I click On Register
    And I verify Register Text
    And I sent TextTo First Name
    And I sent Text To LastName
    And I sent Text To EmailId
    And I sent Text To Password
    And I sen Text To confirmPassword
    And I click on RegisterButton
    And I verify text your Registration completed
    And I click on Continue Button One
    And I click on CheckBox I agree
    And I click on Chekout ButtoN second
    And I enter Country Name
    And I enter City Name
    And I enter Residance Address
    And I enteR Zip code of Area
    And I enter PhoneNumber
    And I click ON Continue Three
    And I click On second  Day Button
    And I click ON Continue four
    And I click On Payment Method Field
    And I click On Method Credit Card
    And I select Visa
    And I enter Card Holder Name Nokia
    And I enter Card Number Nokia
    And I enter Expiry Month Nokia
    And I enter Expiry YearNokia
    And I enter Card CodeNokia
    And I click On Continue Checkout Nokia
    And I verify  nd Day Air Method
    And I click On Confirm Button two
    And I verify ThankYou Text
    And I verify Your Order Sucessfully Placed
    And I click On Continue Button Fifth
    And I verif Welcome To Our Store Page
    And I click OnLogOut Link
    And I get Url
