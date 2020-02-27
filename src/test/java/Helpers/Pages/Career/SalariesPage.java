package Helpers.Pages.Career;

import Tests.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SalariesPage {

    public SalariesPage(){
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    @FindBy(css = "[class='divisions'] [class='skill'] a")
    protected List<WebElement> skillsList;

    public List<WebElement> getSkillsList() {
        return skillsList;
    }

    public List<String> skillsTitles(){
        ArrayList<String> skills = new ArrayList<>();
        for (WebElement webElement : getSkillsList()){
            skills.add(webElement.getAttribute("text"));
        }
        return skills;
    }
}
