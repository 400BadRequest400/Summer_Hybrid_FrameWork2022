package automationPracticeTest;

import automationPracticePages.OpenNewWindowPage;
import base.CommonAPI;
import org.testng.annotations.Test;

public class OpenNewWindowsTest extends CommonAPI {


    @Test
            public void setOpenNewWindowPageTest(){
        OpenNewWindowPage openNewWindowPage = new OpenNewWindowPage(getDriver());
        openNewWindowPage.openNewWindow();


    }


}
