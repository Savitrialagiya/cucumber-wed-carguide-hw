package com.carsguide.cucumber.steps;

import com.carsguide.pages.Homepage;
import com.carsguide.pages.UsedCarPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on buy\\+sell tab$")
    public void iMouseHoverOnBuySellTab() {
        new Homepage().mouseHoverOnBuyCar();
    }

    @And("^I click Search Cars link$")
    public void iClickSearchCarsLink() {
        new Homepage().clickOnSearchCarsLink();
    }

    @Then("^I navigate to new and used car search page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertEquals("New & Used Car Search - carsguide",
                new UsedCarPage().getNewAndUsedSearchCarText());
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) throws InterruptedException {
        Thread.sleep(2000);
        new UsedCarPage().selectMakeFromDropDown(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model)  {
        new UsedCarPage().selectModelFromDropDown(model);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) throws InterruptedException {
        Thread.sleep(2000);
        new UsedCarPage().selectLocationFromDropDown(location);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) throws InterruptedException {
        Thread.sleep(2000);
    new UsedCarPage().selectPriceToFromDropDown(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new UsedCarPage().clickOnFindMyNextCarButton();
    }


    @And("^I click Used link$")
    public void iClickUsedLink() {
        new Homepage().clickOnUsedLink();
    }

    @Then("^I navigate to Used Cars For Sale page$")
    public void iNavigateToUsedCarsForSalePage() {
        Assert.assertEquals("Used Cars For Sale",new UsedCarPage().getUsedCarForSaleMessage());
    }


    @Then("^I should see the make in results$")
    public void iShouldSeeTheMakeInResults() {
        new UsedCarPage().verifyMakeInResult();
    }
}
