package com.carsguide.cucumber.steps;

import com.carsguide.pages.CarDealerPage;
import com.carsguide.pages.Homepage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class FindDealerSteps {
    @And("^I click Find a Dealer$")
    public void iClickFindADealer() {
        new Homepage().clickOnFidADealerTab();
    }

    @Then("^I navigate to car-dealers page$")
    public void iNavigateToCarDealersPage() {
        Assert.assertEquals("Find a Car Dealership Near You",
                new CarDealerPage().getCarDealersShipNearYouMessage());
    }

    @And("^I should see the dealer names dealersName are display on page$")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(DataTable dataTable) {
//        List<List<String>> userList = dataTable.asLists(String.class);
//        for (List<String> e: userList) {
//            //System.out.println(e);
//            System.out.println(e.get(0));
//        }

        List<String> expectedList = dataTable.asList(String.class);
        for(String e:expectedList){
            while(new CarDealerPage().getDealersName(e)==null){
                new CarDealerPage().clickOnNextButton();
            }

            Assert.assertEquals("Dealer not found",e,new CarDealerPage().getDealersName(e));
        }
    }
    }

