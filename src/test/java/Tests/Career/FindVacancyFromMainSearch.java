package Tests.Career;

import Helpers.Rules.PrevAndPostconditions;
import Helpers.Steps.CareerSteps;
import Tests.BaseTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class FindVacancyFromMainSearch extends BaseTest {

    CareerSteps careerSteps = new CareerSteps();

    @Rule
    public PrevAndPostconditions CreateAndCloseDriverAfterTest = new PrevAndPostconditions();

    @Test
    public void verifyingThatSearchFieldOnVacanciesPageContainsSearchValue(){

        careerSteps.openMainPage();
        careerSteps.fillTheSearchField("Тестирование");
        careerSteps.startSearch();

        Assert.assertEquals("Тестирование", careerSteps.getSearchFieldValue());
    }

}
