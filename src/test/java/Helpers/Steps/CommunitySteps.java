package Helpers.Steps;

import Helpers.Pages.Community.CompaniesPage;
import Helpers.Pages.Community.CompanyPage;
import Helpers.Pages.Community.MainPage;
import Tests.BaseTest;
import org.openqa.selenium.WebElement;

public class CommunitySteps {

    public void openMainPage(){
        MainPage mainPage = new MainPage();
        mainPage.openCommunityMainPage();
    }

    public void openLangSettings(){
        MainPage mainPage = new MainPage();
        mainPage.openLangSettings();
    }

    public void selectLangEnglish(){
        MainPage mainPage = new MainPage();
        mainPage.selectLangEnglish();
    }

    public void saveLangSettings(){
        MainPage mainPage = new MainPage();
        mainPage.saveLangSettings();
    }

    public String getHeaderText(){
        MainPage mainPage = new MainPage();
        return mainPage.PageHeaderTextValue();
    }

    public void navigateToAllCompanies(){
        MainPage mainPage = new MainPage();
        mainPage.openAllCompanies();
    }

    public void fillTheCompaniesSearchField(String text) {
        CompaniesPage companiesPage = new CompaniesPage();
        companiesPage.fillSearchField(text);
    }

    public void navigateToCompanyPage() throws InterruptedException {
        CompaniesPage companiesPage = new CompaniesPage();
        companiesPage.openFirstCompanyInCompaniesList();
    }

    public String getCompanyTitle(){
        CompanyPage companyPage = new CompanyPage();
        return companyPage.getCompanyTitleText();
    }

    public WebElement blogFilterButton(){
        CompanyPage companyPage = new CompanyPage();
        return companyPage.getBlogFilterButton();
    }

    public void openOtusCompanyPage(){
        CompanyPage companyPage = new CompanyPage();
        BaseTest.getDriver().get(companyPage.getOtusCompanyPageUrl());
    }

    public void navigateToCompanySite(){
        CompanyPage companyPage = new CompanyPage();
        companyPage.openOtusSite();
    }

    public void navigateToDeveloperSite(){
        MainPage mainPage = new MainPage();
        mainPage.openDeveloperSite();
    }

    public void navigateToVKPage(){
        MainPage mainPage = new MainPage();
        mainPage.openVKPage();
    }

    public void selectDevThread(){
        MainPage mainPage = new MainPage();
        mainPage.selectDevThread();
    }
}
