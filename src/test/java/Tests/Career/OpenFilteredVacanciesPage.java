package Tests.Career;

import Helpers.Rules.PrevAndPostconditions;
import Helpers.Steps.CareerSteps;
import Tests.BaseTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class OpenFilteredVacanciesPage extends BaseTest {

    CareerSteps careerSteps = new CareerSteps();

    @Rule
    public PrevAndPostconditions CreateAndCloseDriverAfterTest = new PrevAndPostconditions();

    @Test
    public void openFilteredVacanciesPageByTesting() {

        careerSteps.openMainPage();
        careerSteps.openTestingVacancies();

        selectBrowserTab(1);

        Assert.assertEquals("true", careerSteps.getFilterTestingStatus());

    }

}
