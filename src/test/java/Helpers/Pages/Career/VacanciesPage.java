package Helpers.Pages.Career;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VacanciesPage {

    public VacanciesPage(){
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    protected String careerMainUrl = "https://career.habr.com/";
    protected String careerVacanciesPath = "vacancies";

    @FindBy(css = "[class='icon-cross']")
    protected WebElement InformationBlockCrossIcon;

    @FindBy(css = "[id='vacancies_search_filer_form_q']")
    protected WebElement searchField;

    @FindBy(css = "[id='division_testing']")
    protected WebElement filterByTesting;

    protected static By informationBlock = By.cssSelector("[class='top_notice type_global']");

    public static By getInformationBlock(){
        return informationBlock;
    }

    public WebElement getFilterByTesting() {
        return filterByTesting;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public String getCareerMainUrl() {
        return careerMainUrl;
    }

    public String getCareerVacanciesPath() {
        return careerVacanciesPath;
    }

    public WebElement getInformationBlockCrossIcon() {
        return InformationBlockCrossIcon;
    }


    public static void waitForInfoBlockIsGone(){
        BaseTest.getWait().until(ExpectedConditions.invisibilityOfElementLocated(getInformationBlock()));
    }

    public void closeInformationBlock(){
        getInformationBlockCrossIcon().click();
    }

    public String SearchFieldValue(){
        return getSearchField().getAttribute("value");
    }

    public String FilterTestingStatus(){
        return getFilterByTesting().getAttribute("checked");
    }
}
