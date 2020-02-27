package Tests.Career;

import Helpers.Rules.PrevAndPostconditions;
import Helpers.Steps.CareerSteps;
import Tests.BaseTest;
import org.junit.Rule;
import org.junit.Test;

public class CloseTheInformationBlock extends BaseTest {

    CareerSteps careerSteps = new CareerSteps();

    @Rule
    public PrevAndPostconditions CreateAndCloseDriverAfterTest = new PrevAndPostconditions();
    @Test
    public void closeInformationBlock() {

        careerSteps.openVacanciesPage();
        careerSteps.closeInfoBlock();
        careerSteps.waitForInfoBlockIsGone();
    }

}
