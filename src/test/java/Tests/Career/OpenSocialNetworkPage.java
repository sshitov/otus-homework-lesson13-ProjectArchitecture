package Tests.Career;

import Helpers.Rules.PrevAndPostconditions;
import Helpers.Steps.CareerSteps;
import Tests.BaseTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class OpenSocialNetworkPage extends BaseTest {

    CareerSteps careerSteps = new CareerSteps();

    @Rule
    public PrevAndPostconditions CreateAndCloseDriverAfterTest = new PrevAndPostconditions();

    @Test
    public void openSocialNetworkPageFacebook() {

        careerSteps.openMainPage();
        careerSteps.navigateToFacebookPage();
        Assert.assertEquals("https://www.facebook.com/moikrug", currentUrl());

    }
}
