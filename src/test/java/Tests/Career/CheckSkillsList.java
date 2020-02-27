package Tests.Career;

import Helpers.Rules.PrevAndPostconditions;
import Helpers.Steps.CareerSteps;
import Tests.BaseTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class CheckSkillsList extends BaseTest {

    public CareerSteps careerSteps = new CareerSteps();

    @Rule
    public PrevAndPostconditions CreateAndCloseDriverAfterTest = new PrevAndPostconditions();

    @Test
    public void checkThatListSkillsContainsJava(){

        String searchSkill;

        careerSteps.openMainPage();
        careerSteps.navigateToSalariesPage();
        searchSkill = careerSteps.findSkillInSkillsList("Java");

        Assert.assertNotNull(searchSkill);
    }

}
