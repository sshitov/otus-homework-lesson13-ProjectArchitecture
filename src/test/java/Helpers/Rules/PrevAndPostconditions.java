package Helpers.Rules;

import Tests.BaseTest;
import org.junit.rules.ExternalResource;

public class PrevAndPostconditions extends ExternalResource {

    @Override
    protected void before() {
        BaseTest.createDriver();
    }

    @Override
    protected void after() {
        BaseTest.closeDriver();
    }
}
