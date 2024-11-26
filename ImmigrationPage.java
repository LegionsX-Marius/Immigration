package pages.orangehrm;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ImmigrationPage extends BasePage {
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[5]/a")
    public WebElement pressImmigration;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")
    private WebElement pressADD;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[1]/div[2]/div")
    private WebElement selectDocument;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")
    private WebElement series;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input")
    private WebElement selectissuedDate;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/div/div/input")
    private WebElement selectExpiryDate;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[4]/div/div[2]/input")
    private WebElement eligibleStatus;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[5]/div/div[2]/div/div/div[1]")
    private WebElement issuedBy;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[6]/div/div[2]/div/div/input")
    private WebElement eligibleReviewDate;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[7]/div/div[2]/textarea")
    private WebElement comments;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]")
    private WebElement clickSave;


    public void pressImmigration(){
        waitPage().until(ExpectedConditions.visibilityOf(this.pressImmigration));
        click(pressImmigration);
    }

    public void pressADD() {
        click(pressADD);
    }

    public void selectDocument() {
        waitPage().until(ExpectedConditions.visibilityOf(this.selectDocument));
        click(selectDocument);
    }

    public void series() {
        addText(String.valueOf(series), this.series);
    }

    public void selectissuedDate() {
        click(selectissuedDate);
    }

    public void selectExpiryDate() {
        click(selectExpiryDate);
    }

    public void eligibleStatus() {
        addText(String.valueOf(eligibleStatus), this.eligibleStatus);
    }

    public void issuedBy() {
        click(issuedBy);
    }

    public void eligibleReviewDate() {
        click(eligibleReviewDate);
    }

    public void comments() {
        addText(String.valueOf(comments), this.comments);
    }

    public void clickSave() {
        click(clickSave);
    }
}
