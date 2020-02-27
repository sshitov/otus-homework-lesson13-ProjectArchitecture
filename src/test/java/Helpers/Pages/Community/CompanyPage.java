package Helpers.Pages.Community;

import Tests.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {

    public CompanyPage(){
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    String otusCompanyPageUrl = "https://habr.com/ru/company/otus/";

    @FindBy(css = "[class='defination-list__value'] a")
    protected WebElement otusSiteUrl;

    @FindBy(css = "[class='page-header__info-title']")
    protected WebElement companyTitle;

    @FindBy(css = ".tabs__level.tabs__level_bottom")
    protected WebElement blogFilterButton;

    public WebElement getBlogFilterButton(){
        return blogFilterButton;
    }

    public WebElement getCompanyTitle() {
        return companyTitle;
    }

    public String getOtusCompanyPageUrl() {
        return otusCompanyPageUrl;
    }

    public WebElement getOtusSiteUrl() {
        return otusSiteUrl;
    }

    public void openOtusSite(){
        getOtusSiteUrl().click();
    }

    public String getCompanyTitleText(){
        return getCompanyTitle().getText();
    }

}
