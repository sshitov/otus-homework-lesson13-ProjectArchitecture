package Helpers.Steps;

import Helpers.Pages.Freelance.AuthorizationPage;
import Helpers.Pages.Freelance.MainPage;
import Helpers.Pages.Freelance.RestorePasswordPage;
import Helpers.Pages.Freelance.TasksPage;
import org.openqa.selenium.WebElement;

public class FreelanceSteps {

    public void openMainPage(){
        MainPage mainPage = new MainPage();
        mainPage.openFreelanceMainPage();
    }

    public void navigateToTwitter(){
        MainPage mainPage = new MainPage();
        mainPage.openTwitterPage();
    }

    public void navigateToOrdersPage(){
        MainPage mainPage = new MainPage();
        mainPage.openOrderSection();
    }

    public void selectSiteTestingFilter(){
        TasksPage tasksPage = new TasksPage();
        tasksPage.selectSiteTestingFilter();
    }

    public String siteTestingFilterStatus(){
        TasksPage tasksPage = new TasksPage();
        return tasksPage.siteTestingFilterStatus();
    }

    public String mobileTestingFilterStatus(){
        TasksPage tasksPage = new TasksPage();
        return tasksPage.mobileTestingFilterStatus();
    }

    public String softTestingFilterStatus(){
        TasksPage tasksPage = new TasksPage();
        return tasksPage.softTestingFilterStatus();

    }

    public void navigateToAuthorizationPage(){
        MainPage mainPage = new MainPage();
        mainPage.openAuthorizationPage();
    }

    public void navigateToRestorePasswordPage(){
        AuthorizationPage authorizationPage = new AuthorizationPage();
        authorizationPage.openRestorePasswordPage();
    }

    public void fillEmailField(String text){
        RestorePasswordPage restorePasswordPage = new RestorePasswordPage();
        restorePasswordPage.fillEmail(text);
    }

    public void submitRestorePasswordForm(){
        RestorePasswordPage restorePasswordPage = new RestorePasswordPage();
        restorePasswordPage.submitForm();
    }

    public WebElement getErrorText(){
        RestorePasswordPage restorePasswordPage = new RestorePasswordPage();
        return restorePasswordPage.getErrorMessage();
    }
}
