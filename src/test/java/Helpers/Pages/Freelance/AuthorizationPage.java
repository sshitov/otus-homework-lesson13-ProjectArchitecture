package Helpers.Pages.Freelance;

import Tests.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {

    public AuthorizationPage(){
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    @FindBy(css = ".login-page__forgot-password a")
    protected WebElement restorePasswordLink;

    public WebElement getRestorePasswordLink(){
        return restorePasswordLink;
    }

    public void openRestorePasswordPage(){
        getRestorePasswordLink().click();
    }
}
