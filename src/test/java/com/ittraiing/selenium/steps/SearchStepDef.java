package com.ittraiing.selenium.steps;


import com.ittraiing.selenium.page_objects.HomePage;
import com.ittraiing.selenium.page_objects.ResultsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.is;

public class SearchStepDef {

    private HomePage homePage = new HomePage();
    private ResultsPage resultsPage = new ResultsPage();


    @Given("^I am Homepage$")
    public void i_am_Homepage() {
        String actual = homePage.getHomePageUrl();
        assertThat("HomePage might be end with something or user on different page .", actual, Matchers.endsWith("co.uk/"));
    }


    @When("^I search for a product \"([^\"]*)\"$")
    public void iSearchForAProduct(String searchItem) {
        homePage.dosearch(searchItem);
    }

    @Then("^I should be able to see respective product")
    public void i_should_be_able_to_see_respective_product() {
        String actual = resultsPage.getProductHeader();
        assertThat("you got some difffernt product. ",actual,is(equalToIgnoringWhiteSpace(HomePage.searchedProduct)));
    }
    @When("^I search for a \"([^\"]*)\"$")
    public void i_search_for_a(String item){
        homePage.dosearch(item);
    }



//    @Test
//    public void searchTest(){
//        String actual = homePage.getHomePageUrl();
//        assertThat("HomePage might be end with something or user on different page .", actual, Matchers.endsWith("co.uk/"));
//        homePage.dosearch("nike");
//        String actual2 = resultsPage.getProductHeader();
//        assertThat("","");
//
//    }


}
