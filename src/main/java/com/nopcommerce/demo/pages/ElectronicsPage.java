package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ElectronicsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ElectronicsPage.class.getName());

    public ElectronicsPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h2[1]/a[1]")
    WebElement cellPhones ;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellphonesText ;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listViewclick ;
    //By listViewclick = By.xpath("//a[contains(text(),'List')]");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/img[1]")
    WebElement nonokiaProduct ;


    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement priceText ;
    //By priceText = By.xpath("//span[@id='pri-20']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement changQnty ;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addtoCart ;
    //By addtoCart = By.xpath("//button[@id='add-to-cart-button-20']");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement addtoCartText ;
   // By addtoCartText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeBar ;
    //By closeBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart ;
   // By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart ;
    //By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement ShoppingCartText ;
   // By ShoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]")
    WebElement priceText1 ;
    //By priceText1 = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    @CacheLookup
    @FindBy(xpath= "//input[@id='termsofservice']")
    WebElement agreeButton ;
   // By agreeButton = By.xpath("//input[@id='termsofservice']");
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement chekoutButton ;
   // By chekoutButton = By.xpath("//button[@id='checkout']");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText ;
   // By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerButton ;
   // By registerButton = By.xpath("//button[contains(text(),'Register')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText ;
    //By registerText = By.xpath("//h1[contains(text(),'Register')]");
    @CacheLookup
    @FindBy(name = "FirstName")
    WebElement firstName ;
    //By firstName = By.name("FirstName");
    @CacheLookup
    @FindBy(name = "LastName")
    WebElement lastNmae ;
   // By lastNmae = By.name("LastName");
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailId ;
    //By emailId = By.id("Email");
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password ;
   // By password = By.id("Password");
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword ;
   // By confirmPassword = By.id("ConfirmPassword");
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton1 ;
   // By registerButton1 = By.xpath("//button[@id='register-button']");
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registerText1 ;
   // By registerText1 = By.xpath("//div[contains(text(),'Your registration completed')]");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement onContinueTab ;
   // By onContinueTab = By.xpath("//a[contains(text(),'Continue')]");
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement iagreebutton ;
  //  By iagreebutton = By.xpath("//input[@id='termsofservice']");
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut2 ;
   // By checkOut2 = By.xpath("//button[@id='checkout']");
    @CacheLookup
    @FindBy(name = "BillingNewAddress.CountryId")
    WebElement countryNmae ;
   // By countryNmae = By.name("BillingNewAddress.CountryId");
    @CacheLookup
    @FindBy(name = "BillingNewAddress.City")
    WebElement city ;
   // By city = By.name("BillingNewAddress.City");
    @CacheLookup
    @FindBy(name = "BillingNewAddress.Address1")
    WebElement address ;
   // By address = By.name("BillingNewAddress.Address1");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postOcde ;
   // By postOcde = By.id("BillingNewAddress_ZipPostalCode");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber ;
   // By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement continue3 ;
   // By continue3 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_2']")
    WebElement radiosecondDay ;
   // By radiosecondDay = By.xpath("//input[@id='shippingoption_2']");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement continue4 ;
   // By continue4 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement paymentMethod ;
   // By paymentMethod = By.xpath("//input[@id='paymentmethod_1']");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement creditCardMethod ;
   // By creditCardMethod = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    @CacheLookup
    @FindBy(xpath = "//select[@class='dropdownlists']")
    WebElement visa ;

   // By visa = By.xpath("(//select[@id='CreditCardType']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderNameNokia ;
   // By cardHolderNameNokia = By.xpath("//input[@id='CardholderName']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberNokia ;
   // By cardNumberNokia = By.xpath("//input[@id='CardNumber']");
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expiryMonthNokia ;
    //By expiryMonthNokia = By.xpath("//select[@id='ExpireMonth']");
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expiryYearNokia ;
   // By expiryYearNokia = By.xpath("//select[@id='ExpireYear']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeNokia ;
    //By cardCodeNokia = By.xpath("//input[@id='CardCode']");
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueCheckoutNokia ;
   // By continueCheckoutNokia = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement creditCaedText ;
   // By creditCaedText = By.xpath("//span[contains(text(),'Credit Card')]");
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shipping Method:')]")
    WebElement ShippingMethodText ;
   // By ShippingMethodText = By.xpath("//span[contains(text(),'Shipping Method:')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confrimClick ;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankyouText ;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement yourOrderSucessfullText ;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continue5 ;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcometoOurStore ;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logoutLink2 ;
//By logoutLink2=By.xpath("//a[@class='ico-logout']");
    // Mouse Hover on “Cell phones” and click
    public void mouseHoverOnCellPhone() {
        clickOnElement(cellPhones);
        log.info("Clicking on login link : " + cellPhones.toString());

    }

    public void clickonCellPhonesoptin() {
        clickOnElement(cellPhones);
        log.info("Clicking on login link : " + cellPhones.toString());

    }

    //2.3	Verify the text “Cell phones”
    public String verifytextCellPhones() {
        String message=getTextFromElement(cellphonesText);
        log.info("Clicking on login link : " + cellphonesText.toString());

        return message;

    }

    //2.4	Click on List View Tab
    public void clickOnlistView() {
        clickOnElement(listViewclick);
        log.info("Clicking on login link : " + listViewclick.toString());

    }

    //2.5	Click on product name “Nokia Lumia 1020” link
    public void clickOnNokia() {
        try {
            clickOnElement(nonokiaProduct);

        } catch (StaleElementReferenceException ignored) {

        }
        clickOnElement(nonokiaProduct);
    }

    public String verifytextofPrice() {
        String message=getTextFromElement(priceText);
        log.info("Clicking on login link : " + priceText.toString());

        return message;

    }

    //Change quantity to 2
    public void SendTexttochangeQuntity() {
        Actions actions1 = new Actions(driver);
        WebElement quntity = driver.findElement((By) changQnty);
        quntity.clear();
        sendTextToElement(changQnty, "2");
        log.info("Clicking on login link : " + changQnty.toString());

    }

    //2.9Click on “ADD TO CART” tab
    public void clickOnAddtoCart() {
        clickOnElement(addtoCart);
        log.info("Clicking on login link : " + addtoCart.toString());

    }

    //2.10	Verify the Message "The product has been added to your shopping cart" on Top green Bar
    public String verifytextProdutAddedToCart() {
        String message=getTextFromElement(addtoCartText);
        log.info("Clicking on login link : " + addtoCartText.toString());

        return message;

    }

    public void clickOnCloseTheBar() {
        clickOnElement(closeBar);
        log.info("Clicking on login link : " + addtoCartText.toString());

    }

    //2.11	Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void mousehpveronShopingCart() {
        mouseHoverToElementAndClick(shoppingCart);
        log.info("Clicking on login link : " + shoppingCart.toString());

    }

    public void mouseHvoerOngoToCart() {
        clickOnElement(goToCart);
        log.info("Clicking on login link : " + goToCart.toString());

    }

    public String verifyShoppingcartText() {
        log.info("Clicking on login link : " + ShoppingCartText.toString());
        return getTextFromElement(ShoppingCartText);
    }

    public String verifyPriceText() {
        log.info("Clicking on login link : " + priceText1.toString());
        return getTextFromElement(priceText1);
    }

    //2.15	click on checkbox “I agree with the terms of service”
    public void clickOnAgreeTermsandServicesr() {
        clickOnElement(agreeButton);
        log.info("Clicking on login link : " + agreeButton.toString());

    }

    public void clickOnChekout() {
        clickOnElement(chekoutButton);
        log.info("Clicking on login link : " + chekoutButton.toString());


    }

    //2.17	Verify the Text “Welcome, Please Sign In!”
    public String verifyWelcomeSignIn() {
        String message= getTextFromElement(welcomeText);
        log.info("Clicking on login link : " + welcomeText.toString());

        return message;
    }


    public void clickOnRegister() {
        clickOnElement(registerButton);
        log.info("Clicking on login link : " + registerButton.toString());

    }


    public String verifyRegisterText() {
        String message= getTextFromElement(registerText);
        log.info("Clicking on login link : " + registerText.toString());

        return message;

    }


    public void sentTextToFirstName(String frnam) {
        sendTextToElement(firstName,frnam);
        log.info("Clicking on login link : " + firstName.toString());

    }

    public void sentTextToLastName(String lasnam) {
        sendTextToElement(lastNmae, lasnam);
        log.info("Clicking on login link : " + lastNmae.toString());

    }

    public void sentTextToEmailId(String email) {
        sendTextToElement(emailId,email);
        log.info("Clicking on login link : " + emailId.toString());

    }

    public void sentTextToPassword(String passwrd) {
        sendTextToElement(password, passwrd);
        log.info("Clicking on login link : " + password.toString());


    }
    public void sentTextToconfirmPassword(String cfmpsw) {
        sendTextToElement(confirmPassword,cfmpsw);
        log.info("Clicking on login link : " + confirmPassword.toString());



    }
    public void clickonRegisterButton1() {
        clickOnElement(registerButton1);
        log.info("Clicking on login link : " + registerButton1.toString());

    }

    //2.22	Verify the message “Your registration completed”
    public String verifytextyourRegistrationcompleted() {
        String message=getTextFromElement(registerText1);
        log.info("Clicking on login link : " + registerText1.toString());

        return message;
    }
    //2.23	Click on “CONTINUE” tab

    public void clickonContinueButton1() {
        clickOnElement(onContinueTab);
        log.info("Clicking on login link : " + onContinueTab.toString());

    }

    //click on checkbox “I agree with the terms of service”
    public void clickonCheckBoxIagree() {
        clickOnElement(iagreebutton);
        log.info("Clicking on login link : " + iagreebutton.toString());

    }

    // /2.26Click on “CHECKOUT”
    public void clickonChekoutButton2() {
        clickOnElement(checkOut2);
        log.info("Clicking on login link : " + checkOut2.toString());

    }

    //2.27	Fill the Mandatory fields
    public void enterCountryName(String country) {
        selectByVisibleTextFromDropDown(countryNmae,country);
        log.info("Clicking on login link : " + countryNmae.toString());

    }

    public void enterCityName(String town) {
        sendTextToElement(city, "Bareli");
        log.info("Clicking on login link : " + city.toString());


    }

    public void enterResidanceAddress(String addr) {
        sendTextToElement(address, addr);
        log.info("Clicking on login link : " + address.toString());


    }

    public void enterZipcodeofArea(String zipcod) {
        sendTextToElement(postOcde,zipcod);
        log.info("Clicking on login link : " + postOcde.toString());


    }

    public void enterPhoneNumber(String num) {
        sendTextToElement(phoneNumber, num);
        log.info("Clicking on login link : " + phoneNumber.toString());


    }

    public void clickONContinue3() {
        clickOnElement(continue3);
        log.info("Clicking on login link : " + continue3.toString());

    }
    public void clickOn2ndDayButton() {
        clickOnElement(radiosecondDay);
        log.info("Clicking on login link : " + radiosecondDay.toString());

    }
    public void clickONContinue4() {
        clickOnElement(continue4);
        log.info("Clicking on login link : " + continue4.toString());

    }

    public void clickOnPaymentMethodField() {
        clickOnElement(paymentMethod);
        log.info("Clicking on login link : " + paymentMethod.toString());

    }

    public void clickOnMethodCreditCard() {
        clickOnElement(creditCardMethod);
        log.info("Clicking on login link : " + creditCardMethod.toString());

    }
    public void selectVisa(String vs) {
        selectByVisibleTextFromDropDown(visa, "Master card");
        log.info("Clicking on login link : " + visa.toString());

        // selectByVisibleTextFromDropDown(visa,vs);
    }
    public void enterCardHolderNameNokia(String cardnam) {
        sendTextToElement(cardHolderNameNokia, "Mr rohit shett");
        log.info("Clicking on login link : " + cardHolderNameNokia.toString());


    }

    public void enterCardNumberNokia(String crnum) {
        sendTextToElement(cardNumberNokia, crnum);
        log.info("Clicking on login link : " + cardNumberNokia.toString());

    }

    public void enterExpiryMonthNokia(String exp) {
        selectByVisibleTextFromDropDown(expiryMonthNokia, "01");
        log.info("Clicking on login link : " + expiryMonthNokia.toString());

    }

    public void enterExpiryYearNokia(String exyear) {
        selectByVisibleTextFromDropDown(expiryYearNokia, "2025");
        log.info("Clicking on login link : " + expiryYearNokia.toString());

    }

    public void enterCardCodeNokia(String cod) {
        sendTextToElement(cardCodeNokia, "999");
        log.info("Clicking on login link : " + cardCodeNokia.toString());

    }
    public void clickOnContinueCheckoutNokia() {
        clickOnElement(continueCheckoutNokia);
        log.info("Clicking on login link : " + continueCheckoutNokia.toString());

    }



    public String verifycreditCardMethod() {
        String message=getTextFromElement(creditCaedText);
        log.info("Clicking on login link : " + creditCaedText.toString());

        return message;
    }

    //Verify “Shipping Method” is “2nd Day Air”
    public String verif2ndDayAirMethod() {
        String message=getTextFromElement(ShippingMethodText);
        log.info("Clicking on login link : " + ShippingMethodText.toString());

        return message;

    }

    public void clickOnConfirmButton2() {
        clickOnElement(confrimClick);
        log.info("Clicking on login link : " + confrimClick.toString());

    }

    //2.39	Verify the Text “Thank You”
    public String verifThankYouText() {
        String message=getTextFromElement(thankyouText);
        log.info("Clicking on login link : " + thankyouText.toString());

        return message;

    }

    //2.40	Verify the message “Your order has been successfully processed!”
    public String verifYourOrderSucessfullyPlaced() {
        String message=getTextFromElement(yourOrderSucessfullText);
        log.info("Clicking on login link : " + yourOrderSucessfullText.toString());

        return message;

    }
    //2.41	Click on “CONTINUE”
    public void clickOnContinueButton5() {
        clickOnElement(continue5);
        log.info("Clicking on login link : " + continue5.toString());

    }
    //2.42	Verify the text “Welcome to our store”
    public String verifWelcomeToOurStorePage() {
        String message=getTextFromElement(welcometoOurStore);
        log.info("Clicking on login link : " + welcometoOurStore.toString());

        return message;

    }
    //Click on “Logout” link
    public void clickOnLogOutLink2(){
        clickOnElement(logoutLink2);
        log.info("Clicking on login link : " + logoutLink2.toString());

    }
    //verify url:

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
