package Tests.Community;

import Helpers.Rules.PrevAndPostconditions;
import Helpers.Steps.CommunitySteps;
import Tests.BaseTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class OpenDeveloperSite extends BaseTest {

    CommunitySteps communitySteps = new CommunitySteps();

    @Rule
    public PrevAndPostconditions CreateAndCloseDriverAfterTest = new PrevAndPostconditions();

    @Test
    public void openDeveloperSite() {

        communitySteps.openMainPage();
        communitySteps.navigateToDeveloperSite();

        Assert.assertEquals("https://tmtm.ru/", currentUrl());

    }
}
