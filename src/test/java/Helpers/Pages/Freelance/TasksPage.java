package Helpers.Pages.Freelance;

import Tests.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {

    public TasksPage(){ PageFactory.initElements(BaseTest.getDriver(), this);}

    @FindBy(css = "[id='category_testing_sites']")
    protected WebElement siteTestingFilter;

    @FindBy(css = "[id='category_testing_mobile']")
    protected WebElement mobileTestingFilter;

    @FindBy(css = "[id='category_testing_software']")
    protected WebElement softTestingFilter;

    public WebElement getSiteTestingFilter() {
        return siteTestingFilter;
    }

    public WebElement getMobileTestingFilter() {
        return mobileTestingFilter;
    }

    public WebElement getSoftTestingFilter() {
        return softTestingFilter;
    }

    public void selectSiteTestingFilter(){
        String filtrationBySites = "document.querySelector(\"[id='category_testing_sites']\").click();";
        ((JavascriptExecutor) BaseTest.getDriver()).executeScript(filtrationBySites);
    }

    public String siteTestingFilterStatus() {
        return getSiteTestingFilter().getAttribute("checked");
    }

    public String mobileTestingFilterStatus() {
        return getMobileTestingFilter().getAttribute("checked");
    }

    public String softTestingFilterStatus() {
        return getSoftTestingFilter().getAttribute("checked");
    }
}
