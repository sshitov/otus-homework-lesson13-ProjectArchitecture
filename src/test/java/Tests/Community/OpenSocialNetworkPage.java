package Tests.Community;

import Helpers.Rules.PrevAndPostconditions;
import Helpers.Steps.CommunitySteps;
import Tests.BaseTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class OpenSocialNetworkPage extends BaseTest {

    CommunitySteps communitySteps = new CommunitySteps();

    @Rule
    public PrevAndPostconditions CreateAndCloseDriverAfterTest = new PrevAndPostconditions();

    @Test
    public void openSocialNetworkPageVK() {

        communitySteps.openMainPage();
        communitySteps.navigateToVKPage();

        selectBrowserTab(1);

        Assert.assertEquals("https://vk.com/habr", currentUrl());

    }
}
