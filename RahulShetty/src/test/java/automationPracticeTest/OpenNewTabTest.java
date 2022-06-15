package automationPracticeTest;

import automationPracticePages.OpenNewTabPage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class OpenNewTabTest extends CommonAPI {

    @Test
    public void openNewTabTest(){
        OpenNewTabPage openNewTabPage = new OpenNewTabPage(getDriver());
        openNewTabPage.openNewTab();
    }
}
