package Tests.Freelance;

import Helpers.Rules.PrevAndPostconditions;
import Helpers.Steps.FreelanceSteps;
import Tests.BaseTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class RestorePassword extends BaseTest {

    FreelanceSteps freelanceSteps = new FreelanceSteps();

    @Rule
    public PrevAndPostconditions CreateAndCloseDriverAfterTest = new PrevAndPostconditions();

    @Test
    public void verifyingThatErrorMassageIsVisible() {

        freelanceSteps.openMainPage();
        freelanceSteps.navigateToAuthorizationPage();
        freelanceSteps.navigateToRestorePasswordPage();
        freelanceSteps.fillEmailField("incorrectEmail@incorrectEmail.ru");
        freelanceSteps.submitRestorePasswordForm();

        Assert.assertTrue(freelanceSteps.getErrorText().isDisplayed());

    }

}
