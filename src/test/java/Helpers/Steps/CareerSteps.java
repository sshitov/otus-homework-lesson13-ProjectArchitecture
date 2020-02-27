package Helpers.Steps;

import Helpers.Pages.Career.MainPage;
import Helpers.Pages.Career.SalariesPage;
import Helpers.Pages.Career.VacanciesPage;
import Tests.BaseTest;

public class CareerSteps {

    public void openMainPage(){
        MainPage mainPage = new MainPage();
        mainPage.openCareerMainPage();
    }

    public void navigateToSalariesPage(){
        MainPage mainPage = new MainPage();
        mainPage.openSalariesPage();
    }

    public String findSkillInSkillsList(String text){
        SalariesPage salariesPage = new SalariesPage();
        String skill = null;
        for(String title: salariesPage.skillsTitles()){
             if (title.equals(text)) {
                skill = title;
            }
        }
        return skill;
    }

    public void openVacanciesPage(){
        VacanciesPage vacanciesPage = new VacanciesPage();
        BaseTest.getDriver().get(vacanciesPage.getCareerMainUrl() + vacanciesPage.getCareerVacanciesPath());
    }

    public void closeInfoBlock() {
        VacanciesPage vacanciesPage = new VacanciesPage();
        vacanciesPage.closeInformationBlock();
    }

    public void waitForInfoBlockIsGone(){
        VacanciesPage.waitForInfoBlockIsGone();
    }

    public void fillTheSearchField(String text){
        MainPage mainPage = new MainPage();
        mainPage.fillTheSearchField(text);

    }

    public void startSearch(){
        MainPage mainPage = new MainPage();
        mainPage.submitSearchForm();
    }

    public String getSearchFieldValue(){
        VacanciesPage vacanciesPage = new VacanciesPage();
        return vacanciesPage.SearchFieldValue();
    }

    public void openTestingVacancies(){
        MainPage mainPage = new MainPage();
        mainPage.openTestingVacancies();
    }

    public String getFilterTestingStatus(){
        VacanciesPage vacanciesPage = new VacanciesPage();
        return vacanciesPage.FilterTestingStatus();
    }

    public void navigateToFacebookPage(){
        MainPage mainPage = new MainPage();
        mainPage.openFacebookPage();
    }

    public void navigateToBestVacancies(){
        MainPage mainPage = new MainPage();
        mainPage.openAllVacancies();
    }

}
