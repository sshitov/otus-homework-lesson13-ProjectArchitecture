package Tests.Community;

import Helpers.Rules.PrevAndPostconditions;
import Helpers.Steps.CommunitySteps;
import Tests.BaseTest;
import org.hamcrest.core.StringContains;
import org.junit.*;
import org.junit.rules.ErrorCollector;

public class ChangeLanguage extends BaseTest {

    CommunitySteps communitySteps = new CommunitySteps();

    @Rule
    public PrevAndPostconditions CreateAndCloseDriverAfterTest = new PrevAndPostconditions();

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void changeLanguageToEnglish() {

        communitySteps.openMainPage();
        communitySteps.openLangSettings();
        communitySteps.selectLangEnglish();
        communitySteps.saveLangSettings();

        refreshPage();

        errorCollector.checkThat("Url does not contain en", currentUrl(), new StringContains("https://habr.com/en/"));
        errorCollector.checkThat("The HeaderText is not meet to expected", communitySteps.getHeaderText(), new StringContains("All streams"));
    }
}