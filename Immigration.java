package com.serra.automation.stepsdefinition.orangehrm;

import io.cucumber.java.en.Then;
import pages.orangehrm.ImmigrationPage;

public class Immigration {
    ImmigrationPage immigration;

    public Immigration(){
        immigration = new ImmigrationPage();
    }

    @Then("Press Immigration")
    public void pressImmigration() {
        immigration.pressImmigration();
    }

    @Then("Press +ADD")
    public void pressADD() {
        immigration.pressADD();
    }

    @Then("Select Document")
    public void selectDocument() {
        immigration.selectDocument();
    }

    @Then("Series {}")
    public void series(String seriesName) {
        immigration.series();
    }

    @Then("Select Issued Date")
    public void selectIssuedDate() {
        immigration.selectissuedDate();
    }

    @Then("Select Expiry Date")
    public void selectExpiryDate() {
        immigration.selectExpiryDate();
    }

    @Then("Eligible Status {}")
    public void eligibleStatus(String eligibleStatusOne) {
        immigration.eligibleStatus();
    }

    @Then("Issued By")
    public void issuedBy() {
        immigration.issuedBy();
    }

    @Then("Eligible Review Date")
    public void eligibleReviewDate() {
        immigration.eligibleReviewDate();
    }

    @Then("CommentsOne {}")
    public void comments(String commentsOne) {
        immigration.comments();
    }

    @Then("Click Save")
    public void clickSave() {
        immigration.clickSave();
    }
}
