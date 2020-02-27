package Tests.Community;

import Helpers.Rules.PrevAndPostconditions;
import Helpers.Steps.CommunitySteps;
import Tests.BaseTest;
import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class FindCompanyBlog extends BaseTest {

    CommunitySteps communitySteps = new CommunitySteps();

    @Rule
    public PrevAndPostconditions CreateAndCloseDriverAfterTest = new PrevAndPostconditions();

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void findCompanyBlogPosts() throws InterruptedException {

        communitySteps.openMainPage();
        communitySteps.navigateToAllCompanies();
        communitySteps.fillTheCompaniesSearchField("Otus");
        communitySteps.navigateToCompanyPage();

        errorCollector.checkThat("The companyTitle is not meet to expected",
                communitySteps.getCompanyTitle(), new StringContains("OTUS. Онлайн-образование"));
        Assert.assertTrue(communitySteps.blogFilterButton().isDisplayed());

    }

}
