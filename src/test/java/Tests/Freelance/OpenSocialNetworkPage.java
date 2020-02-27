package Tests.Freelance;

import Helpers.Rules.PrevAndPostconditions;
import Helpers.Steps.FreelanceSteps;
import Tests.BaseTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class OpenSocialNetworkPage extends BaseTest {

    FreelanceSteps freelanceSteps = new FreelanceSteps();

    @Rule
    public PrevAndPostconditions CreateAndCloseDriverAfterTest = new PrevAndPostconditions();

    @Test
    public void openSocialNetworkPageTwitter() {

        freelanceSteps.openMainPage();
        freelanceSteps.navigateToTwitter();
        Assert.assertEquals("https://twitter.com/ru_freelansim", currentUrl());

    }
}
