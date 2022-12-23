package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class CarDealerPage extends Utility {
    private static final Logger log = LogManager.getLogger(CarDealerPage.class.getName());

    public CarDealerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Find a Car Dealership Near You')]")
    WebElement getCarDealerNearYouText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerListing--name']//a")
    List<WebElement> dealersNameOnPage;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElement nextButton;

    public String getCarDealersShipNearYouMessage(){
        log.info("Get car dealersShip near you text " + getCarDealerNearYouText.getText());
        return getTextFromElement(getCarDealerNearYouText);
    }

    public String getDealersName(String dealerName){
        for (WebElement e: dealersNameOnPage) {
            String str = e.getText();
            if (str.equalsIgnoreCase(dealerName)){
                log.info("Get dealer name " + str);
                return str;
            }
        }
        return null;
    }
    public void clickOnNextButton()  {
        clickOnElement(nextButton);
        log.info("Clicking on next button.");
    }


}