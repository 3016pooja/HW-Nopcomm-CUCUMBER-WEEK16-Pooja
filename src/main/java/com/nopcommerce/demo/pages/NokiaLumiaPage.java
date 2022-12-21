package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NokiaLumiaPage extends Utility {
    private static final Logger log = LogManager.getLogger(NokiaLumiaPage.class.getName());

    public NokiaLumiaPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Nokia Lumia 1020']")
    WebElement verifyNokiaLumia ;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),' $349.00 ')]")
    WebElement verifyPrice ;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement changeQuantity2 ;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart ;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verifyProductAdded ;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeAlert ;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCart ;



    public String getVerifyNokiaLumia() {
        String message=getTextFromElement(verifyNokiaLumia);
        log.info("Clicking on login link : " + verifyNokiaLumia.toString());
        return message;

    }

    public String getVerifyPrice() {
        String message=getTextFromElement(verifyPrice);
        log.info("Clicking on login link : " + verifyPrice.toString());
        return message;

    }

    public void sendChangeQuantity2(String chng) {
        sendTextToElement(changeQuantity2, Keys.BACK_SPACE + "2");
        log.info("Clicking on login link : " + changeQuantity2.toString());
    }

    public void clickAddToCart() {
        clickOnElement(addToCart);
        log.info("Clicking on login link : " + addToCart.toString());
    }

    public String getVerifyProductAdded() {
        String message=getTextFromElement(verifyProductAdded);
        log.info("Clicking on login link : " + verifyProductAdded.toString());
        return message;

    }

    public void clickCloseAlert() {
        clickOnElement(closeAlert);
        log.info("Clicking on login link : " + closeAlert.toString());
    }

    public void clickShoppingCart() {
        clickOnElement(shoppingCart);
        log.info("Clicking on login link : " + shoppingCart.toString());
    }
}
