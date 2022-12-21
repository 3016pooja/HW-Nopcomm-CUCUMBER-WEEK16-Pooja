package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.CellPhonesPage;
import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.NokiaLumiaPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ElectronicsSteps {
    @When("^I  mouse Hove rOn CellPhone$")
    public void iMouseHoveROnCellPhone() {
        new ElectronicsPage().mouseHoverOnCellPhone();
    }

    @Then("^I verify text CellPhones$")
    public void iVerifyTextCellPhones() {
        String actualMessage =  new ElectronicsPage().verifytextCellPhones();

    }

    @When("^I click on Cell Phones optin$")
    public void iClickOnCellPhonesOptin() {
        new ElectronicsPage(). clickonCellPhonesoptin();
    }

    @And("^I get Verify CellPhones$")
    public void iGetVerifyCellPhones() {
        String expectedMessage = "Cell phones";
        String actualMessage =  new CellPhonesPage().getVerifyCellPhones();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I click List View$")
    public void iClickListView() {
        new CellPhonesPage().clickListView();
    }

    @And("^I click On Nokia Lumia$")
    public void iClickOnNokiaLumia() {
        new CellPhonesPage().clickOnNokiaLumia();
    }
    @And("^I click on nokia lumia again$")
    public void iClickOnNokiaLumiaAgain() {
        new CellPhonesPage().clickOnNokiaLumia();
    }
    @And("^I send Change Quantity Two$")
    public void iSendChangeQuantityTwo() {
        new NokiaLumiaPage().sendChangeQuantity2("2");
    }

    @And("^I click Add To Cart$")
    public void iClickAddToCart() {
        new  NokiaLumiaPage().clickAddToCart();
    }
    @And("^I verify text of nokia$")
    public void iVerifyTextOfNokia() {


       //Assert.assertEquals(new CellPhonesPage().clickonmessage(), "The product has been added to your shopping cart");
        Assert.assertEquals("text verify ",new CellPhonesPage().getVerifyProductAdded(), "The product has been added to your shopping cart");

    }
    @And("^I cick on shopping cart button$")
    public void iCickOnShoppingCartButton() {
        new CellPhonesPage().clickshoppingcartbutton();
    }
    @And("^I Verify Product Added$")
    public void iVerifyProductAdded() {
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage =   new  NokiaLumiaPage().getVerifyProductAdded();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I click Close Alert$")
    public void iClickCloseAlert() {
        new  NokiaLumiaPage().clickCloseAlert();
    }

    @And("^I click Shopping Cart$")
    public void iClickShoppingCart() {
        new  NokiaLumiaPage().clickShoppingCart();
    }

    @And("^I verify Shopping cart Text$")
    public void iVerifyShoppingCartText() {
        String expectedMessage = "Shopping cart";
        String actualMessage =   new ElectronicsPage().verifyShoppingcartText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }

    @And("^I verify Price Text elecronic$")
    public void iVerifyPriceTextElecronic() {
        String expectedMessage = "$698.00";
        String actualMessage = new ElectronicsPage().verifyPriceText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }

    @And("^I click On Agree Terms and Servicesr$")
    public void iClickOnAgreeTermsAndServicesr() {
        new ElectronicsPage().clickOnAgreeTermsandServicesr();
    }

    @And("^I click On Chekout$")
    public void iClickOnChekout() {
        new ElectronicsPage().clickOnChekout();
    }

    @And("^I verify Welcome SignIn$")
    public void iVerifyWelcomeSignIn() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new ElectronicsPage().verifyWelcomeSignIn();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I click On Register$")
    public void iClickOnRegister() {
        new ElectronicsPage().clickOnRegister();
    }

    @And("^I verify Register Text$")
    public void iVerifyRegisterText() {
        String expectedMessage = "Register";
        String actualMessage = new ElectronicsPage().verifyRegisterText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }
    @And("^I sent TextTo First Name$")
    public void iSentTextToFirstName() {
        new ElectronicsPage().sentTextToFirstName("anil");
    }

    @And("^I sent Text To LastName$")
    public void iSentTextToLastName() {
        new ElectronicsPage().sentTextToLastName("ambani");
    }

    @And("^I sent Text To EmailId$")
    public void iSentTextToEmailId() {
        new ElectronicsPage().sentTextToEmailId("queenindia26@gmail.com");
    }

    @And("^I sent Text To Password$")
    public void iSentTextToPassword() {
        new ElectronicsPage().sentTextToPassword("queeneliza123");
    }

    @And("^I sen Text To confirmPassword$")
    public void iSenTextToConfirmPassword() {
        new ElectronicsPage().sentTextToconfirmPassword("queeneliza123");
    }

    @And("^I click on RegisterButton$")
    public void iClickOnRegisterButton() {
        new ElectronicsPage().clickonRegisterButton1();
    }

    @And("^I verify text your Registration completed$")
    public void iVerifyTextYourRegistrationCompleted() {
        new ElectronicsPage().verifytextyourRegistrationcompleted();
    }

    @And("^I click on Continue Button One$")
    public void iClickOnContinueButtonOne() {
        new ElectronicsPage().clickonContinueButton1();
    }

    @And("^I click on CheckBox I agree$")
    public void iClickOnCheckBoxIAgree() {
        new ElectronicsPage().clickonCheckBoxIagree();
    }

    @And("^I click on Chekout ButtoN second$")
    public void iClickOnChekoutButtoNSecond() {
        new ElectronicsPage().clickonChekoutButton2();
    }

    @And("^I enter Country Name$")
    public void iEnterCountryName() {
        new ElectronicsPage().enterCountryName("India");
    }

    @And("^I enter City Name$")
    public void iEnterCityName() {
        new ElectronicsPage().enterCityName("Bareli");
    }

    @And("^I enter Residance Address$")
    public void iEnterResidanceAddress() {
        new ElectronicsPage().enterResidanceAddress("25 Pratiksa");
    }

    @And("^I enteR Zip code of Area$")
    public void iEnteRZipCodeOfArea() {
        new ElectronicsPage().enterZipcodeofArea("ha35hy");
    }

    @And("^I enter PhoneNumber$")
    public void iEnterPhoneNumber() {
        new ElectronicsPage().enterPhoneNumber("07500087124");
    }

    @And("^I click ON Continue Three$")
    public void iClickONContinueThree() {
        new ElectronicsPage().clickONContinue3();
    }

    @And("^I click On second  Day Button$")
    public void iClickOnSecondDayButton() {
        new ElectronicsPage().clickOn2ndDayButton();
    }

    @And("^I click ON Continue four$")
    public void iClickONContinueFour() {
        new ElectronicsPage().clickONContinue4();
    }

    @And("^I click On Payment Method Field$")
    public void iClickOnPaymentMethodField() {
        new ElectronicsPage().clickOnPaymentMethodField();
    }

    @And("^I click On Method Credit Card$")
    public void iClickOnMethodCreditCard() {
        new ElectronicsPage().clickOnMethodCreditCard();
    }

    @And("^I select Visa$")
    public void iSelectVisa() {
        new ElectronicsPage().selectVisa("Master card");
    }

    @And("^I enter Card Holder Name Nokia$")
    public void iEnterCardHolderNameNokia() {
        new ElectronicsPage().enterCardHolderNameNokia("Mr rohit shett");
    }

    @And("^I enter Card Number Nokia$")
    public void iEnterCardNumberNokia() {
        new ElectronicsPage().enterCardNumberNokia("4242424242424242");
    }

    @And("^I enter Expiry Month Nokia$")
    public void iEnterExpiryMonthNokia() {
        new ElectronicsPage().enterExpiryMonthNokia("01");
    }

    @And("^I enter Expiry YearNokia$")
    public void iEnterExpiryYearNokia() {
        new ElectronicsPage().enterExpiryYearNokia("2025");
    }

    @And("^I enter Card CodeNokia$")
    public void iEnterCardCodeNokia() {
        new ElectronicsPage().enterCardCodeNokia("999");
    }

    @And("^I click On Continue Checkout Nokia$")
    public void iClickOnContinueCheckoutNokia() {
        new ElectronicsPage().clickOnContinueCheckoutNokia();
    }

    @And("^I verify  nd Day Air Method$")
    public void iVerifyNdDayAirMethod() {
        String expectedMessage = "Shipping Method:";
        String actualMessage =  new ElectronicsPage().verif2ndDayAirMethod();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I click On Confirm Button two$")
    public void iClickOnConfirmButtonTwo() {
        new ElectronicsPage().clickOnConfirmButton2();
    }

    @And("^I verify ThankYou Text$")
    public void iVerifyThankYouText() {
        String expectedMessage = "Thank you";
        String actualMessage =     new ElectronicsPage().verifThankYouText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I verify Your Order Sucessfully Placed$")
    public void iVerifyYourOrderSucessfullyPlaced() {
        String expectedMessage = "Your order has been successfully processed!";
        String actualMessage =  new ElectronicsPage().verifYourOrderSucessfullyPlaced();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I click On Continue Button Fifth$")
    public void iClickOnContinueButtonFifth() {
        new ElectronicsPage().clickOnContinueButton5();
    }

    @And("^I verif Welcome To Our Store Page$")
    public void iVerifWelcomeToOurStorePage() {
        String expectedMessage = "Welcome to our store";
        String actualMessage =     new ElectronicsPage().verifWelcomeToOurStorePage();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I click OnLogOut Link$")
    public void iClickOnLogOutLink() {
        new ElectronicsPage().clickOnLogOutLink2();
    }

    @And("^I get Url$")
    public void iGetUrl() {
        String expectedMessage = "https://demo.nopcommerce.com/";
        String actualMessage =   new ElectronicsPage().getUrl();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }



}
