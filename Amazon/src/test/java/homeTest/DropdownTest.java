package homeTest;

import base.CommonAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import home.HomePage;
import reporting.TestLogger;

public class DropdownTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(DropdownTest.class);

    @Test(enabled = false)
    public void selectBabyOption(){
        HomePage homePage = new HomePage(getDriver());
        homePage.searchElement("flash mcqueen cars");
        homePage.clickSearchBtn();
        homePage.selectOptionFromMenuDropdown("Baby");
        waitFor(5);
    }

    @Test(enabled = false)
    public void getDropdownList(){
        HomePage homePage = new HomePage(getDriver());
        for (String str:homePage.getHomePageDropdownOptions()) {
            LOG.info(str);
        }
    }
    @Test(enabled = true)
    public void selectKindleStoreOptionFromDropdown(){

//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));


        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromMenuDropdownWithSelectOptions("Kindle Store");
        waitFor(5);
        LOG.info("test passed");
    }
    @Test(enabled = false)
    public void selectAlexaSkillsOptionFromDropdown(){
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromMenuDropdownWithGivenText("Alexa Skills");
        waitFor(5);
    }
}
