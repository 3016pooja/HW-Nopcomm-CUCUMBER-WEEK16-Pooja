package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Jay Vaghani
 */
public class HomepageSteps {
    @Given("^I click on computer$")
    public void iClickOnComputer() {
       new HomePage().clickOnComputer();
    }

    @When("^I click on electronics$")
    public void iClickOnElectronics() {
        new HomePage().clickOnElectronicsr();
    }

    @And("^I click on appearals$")
    public void iClickOnAppearals() {
        new HomePage().clickOnAppearals();
    }

    @And("^I click on digital downloads$")
    public void iClickOnDigitalDownloads() {
        new HomePage().clickOndigitalDownloads();
    }

    @And("^I click on books$")
    public void iClickOnBooks() {
        new HomePage().clickOnbooks();
    }

    @And("^I click on jewelary$")
    public void iClickOnJewelary() {
        new HomePage().clickOnJewelary();
    }

    @Then("^I click on gift cards$")
    public void iClickOnGiftCards() {
        new HomePage().clickOnGiftCards();

    }
}
