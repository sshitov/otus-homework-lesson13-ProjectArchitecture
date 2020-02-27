package Helpers.Pages.Freelance;

import Tests.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestorePasswordPage {

    public RestorePasswordPage(){ PageFactory.initElements(BaseTest.getDriver(), this);}

    @FindBy(css = "[name='user[email]']")
    protected WebElement emailField;

    @FindBy(css = "[class*='auth'] button")
    protected WebElement submitButton;

    @FindBy(css = "li[class*='field-error']")
    protected WebElement errorMessage;

    public WebElement getErrorMessage(){
        return errorMessage;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getSubmitForm() {
        return submitButton;
    }

    public void fillEmail(String text){
        getEmailField().clear();
        getEmailField().sendKeys(text);
    }

    public void submitForm(){
        getSubmitForm().click();
    }

}
