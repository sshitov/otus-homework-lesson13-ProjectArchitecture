package Helpers.Pages.Freelance;

import Tests.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    String freelanceMainUrl = "https://freelance.habr.com/";

    @FindBy(css = "[class*='icon-twitter']")
    protected WebElement twitterLink;

    @FindBy(css = ".header__auth-links [href*='sign_in']")
    protected WebElement signIn;

    @FindBy(css = "[class='primary-navigation__item'] [href*='tasks']")
    protected WebElement orderMenuSection;

    public WebElement getOrderMenuSection(){
        return orderMenuSection;
    }

    public WebElement getTwitterLink(){
        return twitterLink;
    }

    public WebElement getSignIn(){
        return signIn;
    }

    public String getFreelanceMainUrl(){
        return freelanceMainUrl;
    }

    public void openOrderSection(){
        getOrderMenuSection().click();
    }

    public void openFreelanceMainPage(){
        BaseTest.getDriver().get(getFreelanceMainUrl());
    }

    public void openTwitterPage(){
        getTwitterLink().click();
    }

    public void openAuthorizationPage(){
        getSignIn().click();
    }

}
