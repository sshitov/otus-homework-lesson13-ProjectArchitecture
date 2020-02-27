package Helpers.Pages.Career;

import Tests.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    protected String careerMainUrl = "https://career.habr.com/";

    @FindBy(css = "[href*='salaries']")
    protected WebElement salariesMenuSection;

    @FindBy(css = "[class='icon-facebook-with-circle']")
    protected WebElement facebookLink;

    @FindBy(css = "[class='block_best_vacancies'] [href='/vacancies']")
    protected WebElement allVacancies;

    @FindBy(css = "[id='q']")
    protected WebElement searchField;

    @FindBy (css = "[type='submit']")
    protected WebElement submitSearch;

    @FindBy (css = "[class='division'][href*='testing']")
    protected WebElement testingVacancies;

    public WebElement getTestingVacancies() {
        return testingVacancies;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSubmitSearch() {
        return submitSearch;
    }

    public WebElement getAllVacancies() {
        return allVacancies;
    }

    public String getCareerMainUrl() {
        return careerMainUrl;
    }

    public WebElement getSalariesMenuSection() {
        return salariesMenuSection;
    }

    public WebElement getFacebookLink() {
        return facebookLink;
    }

    public void openCareerMainPage(){
        BaseTest.getDriver().get(getCareerMainUrl());
    }

    public void openSalariesPage(){
        getSalariesMenuSection().click();
    }

    public void openAllVacancies(){
        getAllVacancies().click();
    }

    public void fillTheSearchField(String text){
        getSearchField().clear();
        getSearchField().sendKeys(text);
    }

    public void submitSearchForm(){
        getSubmitSearch().click();
    }

    public void openTestingVacancies(){
        getTestingVacancies().click();
    }

    public void openFacebookPage(){
        getFacebookLink().click();
    }
}
