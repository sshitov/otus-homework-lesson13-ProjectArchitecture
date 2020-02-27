package Helpers.Pages.Community;

import Tests.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompaniesPage {

    public CompaniesPage(){
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    @FindBy(css = "[id='companies_suggest']")
    protected WebElement searchField;

    @FindBy(css = "[class*='media-obj_company'] > a")
    protected WebElement firstCompanyInList;

    public WebElement getFirstCompanyInList() {
        return firstCompanyInList;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public void fillSearchField(String text){
        getSearchField().clear();
        getSearchField().sendKeys(text);
    }

    public void openFirstCompanyInCompaniesList() throws InterruptedException {
        Thread.sleep(500);
        getFirstCompanyInList().click();
    }
}
