package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Jay Vaghani
 */
public class ComputerSteps {

    @When("^I click on desktop$")
    public void iClickOnDesktop() {
      new ComputerPage().clickonDesktop();
    }
    @Then("^I sort by position Z to A$")
    public void iSortByPositionZToA() {
        new ComputerPage().sortByPositionZtoA("6");
    }


    @And("^I verify product arrange in decending order$")
    public void iVerifyProductArrangeInDecendingOrder() {
        new ComputerPage().verifyProductsArrangeDescendingOrder();
    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() {
        new ComputerPage().clickOnAddToCart();
    }

    @And("^I verify build your own computer$")
    public void iVerifyBuildYourOwnComputer() {
        new ComputerPage().verifyBuildyourowncomputerText();
    }

    @And("^I select dual core function$")
    public void iSelectDualCoreFunction() {
        new ComputerPage().selectDualCoreE2200("1");
    }
    @And("^I select Gb Functionality$")
    public void iSelectGbFunctionality() {
        new ComputerPage().   select8GbFunctionality("5");
    }
    @And("^I select hdd radio$")
    public void iSelectHddRadio() {
        new ComputerPage().selectHddRadioOption();
    }

    @And("^I select Vista Premium Option$")
    public void iSelectVistaPremiumOption() {
        new ComputerPage().selectVistaPremiumOption();
    }

    @And("^I click on Microsoft Office Option$")
    public void iClickOnMicrosoftOfficeOption() {
        new ComputerPage().clickonMicrosoftOfficeOption();
    }

    @And("^I verify Price Text$")
    public void iVerifyPriceText() {
        String expectedMessage = "$1,475.00";
        String actualMessage =  new ComputerPage().verifyPriceText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I click on Add to Card Button$")
    public void iClickOnAddToCardButton() {
        new ComputerPage(). clickonAddtoCardButton();

    }

    @And("^I verify Procduct Added To Cart$")
    public void iVerifyProcductAddedToCart() {
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage =  new ComputerPage().verifyProcductAddedToCart();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }

    @And("^I mouse Hove rOn Go To Cart$")
    public void iMouseHoveROnGoToCart() {
        new ComputerPage().  mouseHoverOnGoToCart();

    }

    @And("^I verify Message Shopping Cart$")
    public void iVerifyMessageShoppingCart() {
        String expectedMessage = "Shopping cart";
        String actualMessage = new ComputerPage().verifyMessageShoppingCart();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }



    @And("^I Change Quntity$")
    public void iChangeQuntity() {
        new ComputerPage().ChangeQuntity("2");

    }

    @And("^I verify Total Price Text$")
    public void iVerifyTotalPriceText() {
        String expectedMessage = "$2,950.00";
        String actualMessage = new ComputerPage().verifyTotalPriceText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I click On Check Box Tick$")
    public void iClickOnCheckBoxTick() {
        new ComputerPage().clickOnCheckBoxTick();

    }

    @And("^I click On Check Out Button$")
    public void iClickOnCheckOutButton() {
        new ComputerPage().clickOnCheckOutButton();

    }

    @And("^I click On Check Out As Guest Button$")
    public void iClickOnCheckOutAsGuestButton() {
        new ComputerPage().clickOnCheckOutAsGuestButton();
    }

    @And("^I send Text To First Name$")
    public void iSendTextToFirstName() {
        new ComputerPage().sendTextToFirstName("naina");
    }

    @And("^I send Text To Last Name$")
    public void iSendTextToLastName() {
        new ComputerPage().sendTextToLastName("sharma");
    }
    @And("^I send Text To email field$")
    public void iSendTextToEmailField() {
        new ComputerPage().sendTextToEmailIdField("ronypatel125@gmail.com");
    }
    @And("^I send Text To Country Field$")
    public void iSendTextToCountryField() {
        new ComputerPage().sendTextToCountryField("United Kingdom");
    }

    @And("^I send Text To City Field$")
    public void iSendTextToCityField() {
        new ComputerPage().sendTextToCityField("Delhi");
    }

    @And("^I send Text To Adress Field$")
    public void iSendTextToAdressField() {
        new ComputerPage().sendTextToAdressField("29,vasant vihar");
    }

    @And("^I send Text To Zip Code Field$")
    public void iSendTextToZipCodeField() {
        new ComputerPage().sendTextToZipCodeField("ha25gh");
    }


    @And("^I send Text To Phone Number Field$")
    public void iSendTextToPhoneNumberField() {
        new ComputerPage().sendTextToPhoneNumberField("07500085166");
    }

    @And("^I click On Countinue Button one$")
    public void iClickOnCountinueButtonOne() {
        new ComputerPage().clickOnCountinueButton1();
    }

    @And("^I click On Next Day Button$")
    public void iClickOnNextDayButton() {
        new ComputerPage().clickOnNextDayButton();
    }
    @And("^I click On Countinue Button two$")
    public void iClickOnCountinueButtonTwo() {
        new ComputerPage().clickOnCountinueButton2();
    }
    @And("^I click On CreditCard Radio Button$")
    public void iClickOnCreditCardRadioButton() {
        new ComputerPage().clickOnCreditCardRadioButton();
    }

    @And("^I select credit Card Radio Button two$")
    public void iSelectCreditCardRadioButtonTwo() {
        new ComputerPage().selectcreditCardRadioButton2();
    }


    @And("^I click On Credit Card from The Option$")
    public void iClickOnCreditCardFromTheOption() {
        new ComputerPage().clickOnCreditCardfromTheOption();
    }

    @And("^I select Maste rCard Tye$")
    public void iSelectMasteRCardTye() {
        new ComputerPage().selectMasterCardTye();
    }

    @And("^I send Txt To Crd Holder Name$")
    public void iSendTxtToCrdHolderName() {
        new ComputerPage().sendTxtToCrdHolderName("Nayan");
    }

    @And("^I send Txt To Card Number$")
    public void iSendTxtToCardNumber() {
        new ComputerPage().sendTxtToCardNumber("0245 0245 0654 0587");
    }

    @And("^I send Txt To Expire Month$")
    public void iSendTxtToExpireMonth() {
        new ComputerPage().sendTxtToExpireMonth("08");
    }

    @And("^I send Txt To Expire Yearr$")
    public void iSendTxtToExpireYearr() {
        new ComputerPage().sendTxtToExpireYearr("2024");
    }

    @And("^I send Txt To Card Code Cvv$")
    public void iSendTxtToCardCodeCvv() {
        new ComputerPage().sendTxtToCardCodeCvv("0235");
    }

    @And("^I click On Continue third$")
    public void iClickOnContinueThird() {
        new ComputerPage().clickOnContinue3();
    }

    @And("^I verify Payment Method Credit Car$")
    public void iVerifyPaymentMethodCreditCar() {
        String expectedMessage = "Payment Method: Credit Card";
        String actualMessage = new ComputerPage().verifyPaymentMethodCreditCar();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I verify Shipping Method Text$")
    public void iVerifyShippingMethodText() {
        String expectedMessage = "Shipping Method: Next Day Air";
        String actualMessage = new ComputerPage().verifyShippingMethodText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }

    @And("^I verify Price text two$")
    public void iVerifyPriceTextTwo() {
        String expectedMessage = "$2,950.00";
        String actualMessage = new ComputerPage().verifyPricetext2();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I click On Confirm Button Forth$")
    public void iClickOnConfirmButtonForth() {
        new ComputerPage().clickOnConfirmButton4();
    }

    @And("^I verify Thankyou Text$")
    public void iVerifyThankyouText() {
        String expectedMessage = "Thank you";
        String actualMessage = new ComputerPage().verifyThankyouText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);


    }

    @And("^I verify Your Order Procced$")
    public void iVerifyYourOrderProcced() {
        String expectedMessage = "Your order has been successfully processed!";
        String actualMessage = new ComputerPage().verifyYourOrderProcced();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I click on Final Continue$")
    public void iClickOnFinalContinue() {
        new ComputerPage().clickonFinalContinue();
    }


    @Then("^I verify Welcome to Our Store$")
    public void iVerifyWelcomeToOurStore() {
        String expectedMessage = "Welcome to our store";
        String actualMessage = new ComputerPage().verifyWelcomtoOurStore();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);


    }
}
