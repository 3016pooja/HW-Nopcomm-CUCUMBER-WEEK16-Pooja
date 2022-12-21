package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage () {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[1]/a")
    WebElement computer ;

   // By computer=By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a");
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[2]/a")
    WebElement electronics ;
   // By electronics=By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a");
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[3]/a")
    WebElement apparel ;
   // By apparel=By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a");
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[4]/a")
    WebElement digitalDownloads ;
  //  By digitalDownloads=By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a");
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[5]/a")
    WebElement books ;
    //By books=By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a");
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[6]/a")
    WebElement jewelry ;
   // By jewelry=By.xpath("//div[@class='header-menu']/ul[1]/li[6]/a");
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[7]/a")
    WebElement giftCards ;
   // By giftCards=By.xpath("//div[@class='header-menu']/ul[1]/li[7]/a");


    public void clickOnComputer(){
        clickOnElement(computer);
        log.info("Clicking on login link : " + computer.toString());

    }
    public void clickOnElectronicsr(){
        clickOnElement(electronics);
        log.info("Clicking on login link : " + electronics.toString());

    }
    public void clickOnAppearals(){
        clickOnElement(apparel);
        log.info("Clicking on login link : " + apparel.toString());

    }
    public void clickOndigitalDownloads(){
        clickOnElement(digitalDownloads);
        log.info("Clicking on login link : " + digitalDownloads.toString());

    }
    public void clickOnbooks(){
        clickOnElement(books);
        log.info("Clicking on login link : " + books.toString());

    }
    public void clickOnJewelary(){
        clickOnElement(jewelry);
        log.info("Clicking on login link : " + jewelry.toString());

    }
    public void clickOnGiftCards(){
        clickOnElement(giftCards);
        log.info("Clicking on login link : " + giftCards.toString());

    }
    public String getUrl() {

        return driver.getCurrentUrl();
    }


}
