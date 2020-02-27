package Tests.Freelance;

import Helpers.Rules.PrevAndPostconditions;
import Helpers.Steps.FreelanceSteps;
import Tests.BaseTest;
import org.hamcrest.core.StringContains;
import org.hamcrest.core.IsNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class OrdersFiltration extends BaseTest {

    FreelanceSteps freelanceSteps = new FreelanceSteps();

    @Rule
    public PrevAndPostconditions CreateAndCloseDriverAfterTest = new PrevAndPostconditions();

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void ordersFiltrationByTestingSites() {

        freelanceSteps.openMainPage();
        freelanceSteps.navigateToOrdersPage();
        freelanceSteps.selectSiteTestingFilter();

        errorCollector.checkThat("Filter sites is not selected",
                freelanceSteps.siteTestingFilterStatus(), new StringContains("true"));
        errorCollector.checkThat("Filter mobile selected",
                freelanceSteps.mobileTestingFilterStatus(), new IsNull<>());
        errorCollector.checkThat("Filter soft selected",
                freelanceSteps.softTestingFilterStatus(), new IsNull<>());

    }

}
