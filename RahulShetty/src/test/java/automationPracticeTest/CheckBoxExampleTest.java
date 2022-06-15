package automationPracticeTest;

import automationPracticePages.HomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxExampleTest extends CommonAPI {

        //this test case checks of checkBox #2 can be clicked on and checked
        @Test
        public void checkBoxExampleOption2Test () {
            HomePage homePage = new HomePage(getDriver());
            homePage.checkBoxExampleOption2();
            waitFor(3);
            Assert.assertTrue(homePage.checkBoxIsChecked(homePage.checkBoxExampleOption2Element));


        }
    }

