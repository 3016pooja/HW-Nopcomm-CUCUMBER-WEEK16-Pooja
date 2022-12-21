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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility{
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h2[@class='title']//a")
    WebElement desktop ;
    //By desktop = By.xpath("//h2[@class='title']//a");

    @CacheLookup
    @FindBy(name = "products-orderby")
    WebElement nameZtoA ;
    //By nameZtoA = By.name("products-orderby");
    @CacheLookup
    @FindBy(className = "product-title")
    WebElement verifyProductsArranged ;
    // By verifyProductsArranged = By.className("product-title");
    //@CacheLookup
   // @FindBy(xpath = "//button[@type='button'][normalize-space()='Add to cart'])[1]")
    //WebElement buildYourOwnComputer;
    //By buildYourOwnComputer = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCartButton ;
    //By addToCartButton=By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComTxt ;
    //By buildYourOwnComTxt=By.xpath("//h1[contains(text(),'Build your own computer')]");

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement dualCoreFunctionality ;
    //By dualCoreFunctionality=By.name("product_attribute_1");
    @CacheLookup
    @FindBy(name = "product_attribute_2")
    WebElement gbRamFunctionality ;
    // By gbRamFunctionality=By.name("product_attribute_2");
    @CacheLookup
    @FindBy(xpath = "//label[@for='product_attribute_3_7']")
    WebElement hDDRadio ;
    //By hDDRadio=By.xpath("//label[@for='product_attribute_3_7']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement vistaPremium ;
    //By vistaPremium=By.xpath("//input[@id='product_attribute_4_9']");

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement microsoftOffice ;
    // By microsoftOffice=By.xpath("//input[@id='product_attribute_5_12']");

    @CacheLookup
    @FindBy(xpath = "//span[text()='$1,475.00']")
    WebElement priceText ;
    // By priceText=By.xpath("//span[text()='$1,475.00']");

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart ;
    // By addToCart=By.xpath("//button[@id='add-to-cart-button-1']");

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddedToYourCartTxt ;
    //By productAddedToYourCartTxt=By.xpath("//p[@class='content']");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart ;
    //By shoppingCart=By.xpath("//a[contains(text(),'shopping cart')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart ;
    //By goToCart=By.xpath("//button[contains(text(),'Go to cart')]");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartTxr ;
    // By shoppingCartTxr=By.xpath("//h1[contains(text(),'Shopping cart')]");
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement quntityField ;
    //By quntityField=By.xpath("//input[@value='1']");
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateCart ;
    //By updateCart=By.xpath("//button[@id='updatecart']");
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[4]/td[2]")
    WebElement totalText ;
    //  By totalText=By.xpath("//tbody/tr[4]/td[2]");
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkboxButton ;
    //By checkboxButton=By.xpath("//input[@id='termsofservice']");

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut ;
    //By checkOut=By.xpath("//button[@id='checkout']");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')")
    WebElement welcomeSignInText ;
    //By welcomeSignInText=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkoutAsGuest ;
    // By checkoutAsGuest=By.xpath("//button[contains(text(),'Checkout as Guest')]");

    @CacheLookup
    @FindBy(name = "BillingNewAddress.FirstName")
    WebElement firstNameField ;
    // By firstNameField=By.name("BillingNewAddress.FirstName");

    @CacheLookup
    @FindBy(name = "BillingNewAddress.LastName")
    WebElement lastNameField ;
    // By lastNameField=By.name("BillingNewAddress.LastName");

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailIdFiedl ;
    // By emailIdFiedl=By.id("BillingNewAddress_Email");
    @CacheLookup
    @FindBy(name= "BillingNewAddress.CountryId")
    WebElement counrtyNameField ;
    //By counrtyNameField=By.name("BillingNewAddress.CountryId");


    @CacheLookup
    @FindBy(name = "BillingNewAddress.City")
    WebElement cityNameFiled ;
    //By cityNameFiled=By.name("BillingNewAddress.City");

    @CacheLookup
    @FindBy(name = "BillingNewAddress.Address1")
    WebElement addressField ;
    //By addressField=By.name("BillingNewAddress.Address1");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postcodeField ;
    //By postcodeField=By.id("BillingNewAddress_ZipPostalCode");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber ;
    //By phoneNumber=By.id("BillingNewAddress_PhoneNumber");
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton1 ;
    //By continueButton1=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Next Day Air ($0.00)')]")
    WebElement nextDayRadioButton ;
    //By nextDayRadioButton=By.xpath("//label[contains(text(),'Next Day Air ($0.00)')]");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement continue2 ;
    // By continue2=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCard ;
    // By creditCard=By.xpath("//input[@id='paymentmethod_1']");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement selectCreditCard1 ;
    //By selectCreditCard1=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCardType ;
    // By creditCardType=By.xpath("//select[@id='CreditCardType']");

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Master card')]")
    WebElement mastercardTye ;
    //By mastercardTye=By.xpath("//option[contains(text(),'Master card')]");

    @CacheLookup
    @FindBy(name = "CardholderName")
    WebElement cardHolderName ;
    // By cardHolderName=By.name("CardholderName");
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber ;
    // By cardNumber=By.id("CardNumber");
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth ;
    //By expireMonth=By.id("ExpireMonth");
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear ;
    //By expireYear=By.id("ExpireYear");
    @CacheLookup
    @FindBy(xpath= "//input[@id='CardCode']")
    WebElement cardCode ;
    // By cardCode=By.id("CardCode");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
    WebElement continue3 ;
    // By continue3=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement paymentMethodText ;
    // By paymentMethodText=By.xpath("//li[@class='payment-method']");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]")
    WebElement shippingMethodText ;
    //By shippingMethodText=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]");
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]")
    WebElement totalpriceText2 ;
    // By totalpriceText2=By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton ;
    //By confirmButton=By.xpath("//button[contains(text(),'Confirm')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankyouText ;
    //  By thankyouText=By.xpath("//h1[contains(text(),'Thank you')]");
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement sucessfullMessage ;
    //By sucessfullMessage=By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continue5 ;
    // By continue5=By.xpath("//button[contains(text(),'Continue')]");
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement wecometoOurSotreTexy ;
    // By wecometoOurSotreTexy=By.xpath("//h2[contains(text(),'Welcome to our store')]");


    public void clickonDesktop() {
        clickOnElement(desktop);
        log.info("Clicking on login link : " + desktop.toString());

    }

    public void sortByPositionZtoA(String value) {
        selectByValueFromDropDown(nameZtoA,value);
        log.info("Clicking on login link : " + nameZtoA.toString());

    }
    // 1.4	Verify the Product will arrange in Descending order.
    public String verifyProductsArrangeDescendingOrder() {
        String message= getTextFromElement(verifyProductsArranged);
        log.info("Clicking on login link : " + verifyProductsArranged.toString());
        return message;


        //  System.out.println("The number of products on page are:" + driver.findElements(verifyProductsArranged).size());
    }
//2.3	Select Sort By
//2.4	position "Name: A to Z"
public void sortByPositionAtoZ(String atoz) {
    selectByValueFromDropDown(nameZtoA,atoz);
    log.info("Clicking on login link : " + nameZtoA.toString());

}

    public void verifyDescendingOrder(){
        List<WebElement> product = driver.findElements(By.className("product-title"));
        ArrayList<String> beforeFilterProductList = new ArrayList<>();
        for (WebElement element : product) {
            beforeFilterProductList.add(element.getText());
        }

        Collections.reverse(beforeFilterProductList);
        //1.3 Select Sort By position "Name: Z to A"
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"),"Name: Z to A");
        //After filter get product list
        product = driver.findElements(By.className("product-title"));
        ArrayList<String> afterFilterProductList = new ArrayList<>();
        for (WebElement element : product) {
            afterFilterProductList.add(element.getText());
        }
        Collections.reverse(afterFilterProductList);
       // Assert.assertEquals(beforeFilterProductList, afterFilterProductList);
    }

//  2.5	Click on "Add To Cart"
//public void clickBuildYourOwnComputer () {
   //

    //clickOnElement(buildYourOwnComputer);

    public void clickOnAddToCart() {
        try {
            clickOnElement(addToCartButton);
        } catch (
                StaleElementReferenceException e) {
            clickOnElement(addToCartButton);
        }
    }
           // 2.6	Verify the Text "Build your own computer"
    public String verifyBuildyourowncomputerText(){
        String message=getTextFromElement(buildYourOwnComTxt);
        log.info("Clicking on login link : " + buildYourOwnComTxt.toString());
        return message;
    }
            //2.7	Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    public void selectDualCoreE2200(String core){
        selectByValueFromDropDown(dualCoreFunctionality,core);
        log.info("Clicking on login link : " + dualCoreFunctionality.toString());

    }

//2.7.Select "8GB [+$60.00]" using Select class.
public void select8GbFunctionality(String ram){
    selectByValueFromDropDown(gbRamFunctionality,ram);
    log.info("Clicking on login link : " + dualCoreFunctionality.toString());

}
//2.8	Select HDD radio "400 GB [+$100.00]"2.8	Select HDD radio "400 GB [+$100.00]"
public void selectHddRadioOption(){
    clickOnElement(hDDRadio);
    log.info("Clicking on login link : " + hDDRadio.toString());

}
// 2.9	Select OS radio "Vista Premium [+$60.00]"
public void selectVistaPremiumOption(){
    clickOnElement(vistaPremium);
    log.info("Clicking on login link : " + vistaPremium.toString());
}
// 2.10	Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
public void clickonMicrosoftOfficeOption(){
    clickOnElement(microsoftOffice);
    log.info("Clicking on login link : " + microsoftOffice.toString());

}
           // 2.11	Verify the price "$1,475.00"
           public String verifyPriceText(){

               String message=getTextFromElement(priceText);
               log.info("Clicking on login link : " + priceText.toString());
               return message;
           }

    // 2.12 Click on "ADD TO CARD" Button.
    public void clickonAddtoCardButton() {
        clickOnElement(addToCart);
        log.info("Clicking on login link : " + addToCart.toString());
    }

//2.13	Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
public String verifyProcductAddedToCart(){
    String message=getTextFromElement(productAddedToYourCartTxt);
    log.info("Clicking on login link : " + productAddedToYourCartTxt.toString());

    return message;
}
// 2.14	Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void mouseHoverOnShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        WebElement shopping=driver.findElement((By) shoppingCart);
        WebElement goToCard=driver.findElement((By) goToCart);
        Actions actions1=new Actions(driver);
        actions1.moveToElement(shopping).moveToElement(goToCard).click().build().perform();
    }
    public void mouseHoverOnGoToCart(){
        clickOnElement(shoppingCart);
        log.info("Clicking on login link : " + shoppingCart.toString());

    }

    //2.15 verify the message'Shopping cart'.
    public String verifyMessageShoppingCart() {
        String message=getTextFromElement(shoppingCartTxr);
        log.info("Clicking on login link : " + shoppingCartTxr.toString());

        return message;
    }
    //2.16	Change the Qty to "2" and Click on "Update shopping cart"
    public void ChangeQuntity(String qty) {
        quntityField.clear();
        sendTextToElement(quntityField, qty);
        log.info("Clicking on login link : " + quntityField.toString());

        clickOnElement(updateCart);
        log.info("Clicking on login link : " + updateCart.toString());


    }
    public String verifyTotalPriceText() {
        String message=getTextFromElement(totalText);
        log.info("Clicking on login link : " + totalText.toString());

        return message;
    }
    public void clickOnCheckBoxTick(){
        clickOnElement(checkboxButton);
        log.info("Clicking on login link : " + checkboxButton.toString());

    }
           public void clickOnCheckOutButton(){
        clickOnElement(checkOut);
               log.info("Clicking on login link : " + checkOut.toString());
           }

    public String verifyWelcomSignInText() {
        log.info("Clicking on login link : " + welcomeSignInText.toString());
        return getTextFromElement(welcomeSignInText);
    }
           // 2.21Click on “CHECKOUT AS GUEST” Tab
           public void clickOnCheckOutAsGuestButton(){
               clickOnElement(checkoutAsGuest);
               log.info("Clicking on login link : " + checkoutAsGuest.toString());
           }
             //2.22	Fill the all mandatory field
    public void sendTextToFirstName(String frnm){
        sendTextToElement(firstNameField,frnm);
        log.info("Clicking on login link : " + firstNameField.toString());
    }
    public void sendTextToLastName(String lasnm){
        sendTextToElement(lastNameField,lasnm);
        log.info("Clicking on login link : " + lastNameField.toString());
    }
    public void sendTextToEmailIdField(String eml){
        sendTextToElement(emailIdFiedl,eml);
        log.info("Clicking on login link : "+ emailIdFiedl.toString());
    }
    public void sendTextToCountryField(String cntry){
        selectByVisibleTextFromDropDown(counrtyNameField,cntry);
        log.info("Clicking on login link : " + counrtyNameField.toString());
    }

    public void sendTextToCityField(String twn){
        sendTextToElement(cityNameFiled,twn);
        log.info("Clicking on login link : " + cityNameFiled.toString());

    }
    public void sendTextToAdressField(String socity){
        sendTextToElement(addressField,socity);
        log.info("Clicking on login link : " +addressField.toString());
    }
    public void sendTextToZipCodeField(String pscd){
        sendTextToElement(postcodeField,pscd);
        log.info("Clicking on login link : " + postcodeField.toString());
    }
    public void sendTextToPhoneNumberField(String phnu){
        sendTextToElement(phoneNumber,phnu);
        log.info("Clicking on login link : " + phoneNumber.toString());
    }
    public void clickOnCountinueButton1(){
        clickOnElement(continueButton1);
        log.info("Clicking on login link : " + continueButton1.toString());
    }
            //2.24	Click on Radio Button “Next Day Air($0.00)”
            public void clickOnNextDayButton(){
                clickOnElement(nextDayRadioButton);
                log.info("Clicking on login link : " + nextDayRadioButton.toString());
            }
           // 2.25	Click on “CONTINUE”
           public void clickOnCountinueButton2(){
               clickOnElement(continue2);
               log.info("Clicking on login link : " + continue2.toString());
           }
           // 2.26	Select Radio Button “Credit Card”
    public void clickOnCreditCardRadioButton(){
        clickOnElement(creditCard);
        log.info("Clicking on login link : " + creditCard.toString());
    }
    public void selectcreditCardRadioButton2(){
        clickOnElement(selectCreditCard1);
        log.info("Clicking on login link : " + selectCreditCard1.toString());
    }
            //2.27	Select “Master card” From Select credit card dropdown
            public void clickOnCreditCardfromTheOption(){
                clickOnElement(creditCardType);
                log.info("Clicking on login link : " + creditCardType.toString());
            }
    public void selectMasterCardTye(){
        clickOnElement(mastercardTye);
        log.info("Clicking on login link : " + mastercardTye.toString());
    }
//2.28Fill all the details
    public void sendTxtToCrdHolderName(String crnam){
        sendTextToElement(cardHolderName,crnam);
        log.info("Clicking on login link : " + cardHolderName.toString());
    }
    public void sendTxtToCardNumber(String cnumber){
        sendTextToElement(cardNumber,"0245 0245 0654 0587");
        log.info("Clicking on login link : " + cardNumber.toString());
    }
    public void sendTxtToExpireMonth(String holdrnam){
        selectByVisibleTextFromDropDown(expireMonth,"08");
        log.info("Clicking on login link : " + expireMonth.toString());
    }
    public void sendTxtToExpireYearr(String expyear){
        selectByVisibleTextFromDropDown(expireYear,"2024");
        log.info("Clicking on login link : " + expireYear.toString());
    }
    public void sendTxtToCardCodeCvv(String cvvnum) {
        sendTextToElement(cardCode,cvvnum);
        log.info("Clicking on login link : " + cardCode.toString());

    }
    public void clickOnContinue3(){
        clickOnElement(continue3);
        log.info("Clicking on login link : " + continue3.toString());

    }
    // 2.30Verify “Payment Method” is “Credit Card”
    public String verifyPaymentMethodCreditCar(){
        String message=getTextFromElement(paymentMethodText);
        log.info("Clicking on login link : " + paymentMethodText.toString());
        return message;
    }
    //Verify “Shipping Method” is “Next Day Air”
    public String verifyShippingMethodText(){
        String message=getTextFromElement(shippingMethodText);
        log.info("Clicking on login link : " + shippingMethodText.toString());
        return message;
    }
    public String verifyPricetext2(){
        String message=getTextFromElement(totalpriceText2);
        log.info("Clicking on login link : " + totalpriceText2.toString());
        return message;
    }
    //2.34	Click on “CONFIRM”
    public void clickOnConfirmButton4(){
        clickOnElement(confirmButton);
        log.info("Clicking on login link : " + confirmButton.toString());
    }
//2.35Verify the Text “Thank You”
public String verifyThankyouText(){
    String message=getTextFromElement(thankyouText);
    log.info("Clicking on login link : " + thankyouText.toString());
    return message;
}
 public String verifyYourOrderProcced(){
               String message=getTextFromElement(sucessfullMessage);
     log.info("Clicking on login link : " + sucessfullMessage.toString());
               return message;
           }

public void clickonFinalContinue(){
    clickOnElement(continue5);
    log.info("Clicking on login link : " + continue5.toString());
}
            public String verifyWelcomtoOurStore(){

                String message=getTextFromElement(wecometoOurSotreTexy);
                log.info("Clicking on login link : " + wecometoOurSotreTexy.toString());
                return message;
            }

}
