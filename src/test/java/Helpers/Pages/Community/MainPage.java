package Helpers.Pages.Community;

import Tests.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    String communityMainUrl = "https://habr.com/ru/";

    @FindBy(css = ".stacked-menu [href*='develop']")
    protected WebElement devThread;

    @FindBy(css = "[class*='page-header']")
    protected WebElement pageHeaderText;

    @FindBy(css = "[class*='link_vkontakte']")
    protected WebElement linkVK;

    @FindBy(css = "[class*='copyright'] [class='footer__link']")
    protected WebElement developerSiteLink;

    @FindBy(css = "button[class*='show_lang_settings']")
    protected WebElement langSettings;

    @FindBy(css = "[Type='submit']")
    protected WebElement langSettingsButton;

    @FindBy(css = "[href='/companies/']")
    protected WebElement allCompanies;

    public WebElement getAllCompanies(){
        return allCompanies;
    }

    public WebElement getLangSettingsButton() {
        return langSettingsButton;
    }

    public WebElement getLangSettings() {
        return langSettings;
    }

    public WebElement getDeveloperSiteLink() {
        return developerSiteLink;
    }

    public WebElement getLinkVK() {
        return linkVK;
    }

    public WebElement getPageHeaderText() {
        return pageHeaderText;
    }

    public String getCommunityMainUrl() {
        return communityMainUrl;
    }

    public WebElement getDevThread() {
        return devThread;
    }

    public void openCommunityMainPage(){
        BaseTest.getDriver().get(getCommunityMainUrl());
    }

    public void selectDevThread(){
        getDevThread().click();
    }

    public String PageHeaderTextValue(){
        return getPageHeaderText().getText();
    }

    public void openVKPage(){
        getLinkVK().click();
    }

    public void openDeveloperSite(){
        getDeveloperSiteLink().click();
    }

    public void openLangSettings(){
        getLangSettings().click();
    }

    public void selectLangEnglish(){
        String script = "document.querySelector(\"[id='hl_langs_en']\").click();";
        ((JavascriptExecutor) BaseTest.getDriver()).executeScript(script);
    }

    public void saveLangSettings(){
        getLangSettingsButton().click();
    }

    public void openAllCompanies(){
        getAllCompanies().click();
    }
}
