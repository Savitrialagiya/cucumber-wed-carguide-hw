package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buyCar;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCarsLink;


    @CacheLookup
    @FindBy(xpath = "//a[@href=\"/buy-a-car/used-car-search\"]")
    WebElement clickOnUsedLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement clickOnFindADealer;



    public void mouseHoverOnBuyCar() {
        log.info("mouse Hover On Buy Car " + buyCar.toString());
        mouseHoverToElement(buyCar);
    }

    public void clickOnSearchCarsLink(){
        log.info("click On Search Cars Link " + searchCarsLink.toString());
        clickOnElement(searchCarsLink);
    }


    public void clickOnUsedLink(){
        log.info(" click On Used Link " + clickOnUsedLink.toString());
        clickOnElement(clickOnUsedLink);

    }
    public void clickOnFidADealerTab(){
        log.info("Click on find a dealer tab " + clickOnFindADealer.toString());
        clickOnElement(clickOnFindADealer);
    }
}