package com.ittraiing.selenium.steps;

import com.ittraiing.selenium.page_objects.ResultsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

public class FilterStepDef {

    private ResultsPage resultsPage = new ResultsPage();

    @And("^I select a customer rating as \"([^\"]*)\"$")
    public void iSelectACustomerRatingAs(String userSelectedReview) {
        resultsPage.selectARating(userSelectedReview);
    }

    @Then("^I should be able to see product with in range of customer rating$")
    public void iShouldBeAbleToSeeProductWithInRangeOfCustomerRating() {
        List<Double> actualList = resultsPage.getCustomerRatingOnAllProducts();
        assertThat("List is storing wrong value or filter broken. ",actualList,everyItem(greaterThanOrEqualTo(2.0)));
    }
}
