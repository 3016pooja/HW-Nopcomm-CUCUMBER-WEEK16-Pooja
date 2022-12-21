package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage extends Utility {
    private static final Logger log = LogManager.getLogger(CellPhonesPage.class.getName());

    public CellPhonesPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyCellPhones ;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listView ;



   // @CacheLookup
   // @FindBy(xpath = "//div[@class='picture']//img[@title='Show details for Nokia Lumia 1020']")
   // WebElement nokiaLumia ;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/img[1]")
    WebElement nokiaLumia ;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement nokiaLumiaclickonmsg ;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement clickonshoppingcart ;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verifyProductAdded ;


    public String clickonmessage(){
        String message=getTextFromElement(nokiaLumiaclickonmsg);
        log.info("Clicking on login link : " + nokiaLumiaclickonmsg.toString());
        return message;
    }

    public String getVerifyProductAdded() {
 log.info("verify the product price "+ verifyProductAdded.toString());
        String message=getTextFromElement(verifyProductAdded);
        return message;

    }

    public void clickshoppingcartbutton(){
        clickOnElement(clickonshoppingcart );
        log.info("Clicking on login link : " + clickonshoppingcart .toString());

    }

    public void clickListView(){
        clickOnElement(listView);
        log.info("Clicking on login link : " + listView.toString());

    }
    public void clickOnNokiaLumia(){
        clickOnElement(nokiaLumia);
        log.info("Clicking on login link : " + nokiaLumia.toString());

    }

    public String getVerifyCellPhones(){
        String message=getTextFromElement(verifyCellPhones);
        log.info("Clicking on login link : " + verifyCellPhones.toString());
        return message;
    }


}
