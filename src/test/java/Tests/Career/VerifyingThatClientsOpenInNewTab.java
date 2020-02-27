package Tests.Career;

import Helpers.Rules.PrevAndPostconditions;
import Helpers.Steps.CareerSteps;
import Tests.BaseTest;
import org.hamcrest.core.StringContains;
import org.hamcrest.core.IsEqual;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class VerifyingThatClientsOpenInNewTab extends BaseTest {

    CareerSteps careerSteps = new CareerSteps();

    @Rule
    public PrevAndPostconditions CreateAndCloseDriverAfterTest = new PrevAndPostconditions();

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void verifyingThatClientsOpenInNewTab() {

        careerSteps.openMainPage();
        careerSteps.navigateToBestVacancies();

        selectBrowserTab(1);

        errorCollector.checkThat(getBrowserTabs().size(), new IsEqual<>(2));
        errorCollector.checkThat(currentUrl(), new StringContains("https://career.habr.com/vacancies"));

    }
}
