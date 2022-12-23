package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(UsedCarPage.class.getName());

    public UsedCarPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement verifyNewAndUsedSearchCar;

    @CacheLookup
    @FindBy(id = "makes")
    WebElement selectMake;

    @CacheLookup
    @FindBy(id = "models")
    WebElement selectModel;

    @CacheLookup
    @FindBy(id = "locations")
    WebElement selectLocation;

    @CacheLookup
    @FindBy(id ="priceTo")
    WebElement selectPriceTo;

    @CacheLookup
    @FindBy(xpath ="//input[@id='search-submit']")
    WebElement clickOnFindMyNextCarTab;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Used Cars For Sale')]")
    WebElement getUsedCardsForSaleText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='carListing--textCol1']//h5")
    WebElement resultMake;


    public String getNewAndUsedSearchCarText(){
        log.info("get New And Used Search Car Text" +verifyNewAndUsedSearchCar.getText());
        return getTextFromElement(verifyNewAndUsedSearchCar);
    }

    public void selectMakeFromDropDown(String make){
        log.info("select Make From Drop Down" + selectMake.toString());
        selectByVisibleTextFromDropDown(selectMake,make);
    }

    public void selectModelFromDropDown(String model){
        log.info("select Model From Drop Down" + selectModel.toString());
        selectByVisibleTextFromDropDown(selectModel,model);
    }

    public void selectLocationFromDropDown(String location){
        log.info("select Location From Drop Down " + selectLocation.toString());
        selectByVisibleTextFromDropDown(selectLocation,location);
    }

    public void selectPriceToFromDropDown(String price){
        log.info("select Price From Drop Down " + selectPriceTo.toString());
        selectByValueFromDropDown(selectPriceTo,price);
    }

    public void clickOnFindMyNextCarButton(){
        log.info("click On Find My Next Car Button " + clickOnFindMyNextCarTab.toString());
        clickOnElement(clickOnFindMyNextCarTab);
    }
    public void verifyMakeInResult(){
        log.info("verify Make In Result " + resultMake.getText());
        getTextFromElement(resultMake);
    }
    public String getUsedCarForSaleMessage(){
        log.info("get Used Car For Sale Message " + getUsedCardsForSaleText.getText());
        return getTextFromElement(getUsedCardsForSaleText);
    }

}