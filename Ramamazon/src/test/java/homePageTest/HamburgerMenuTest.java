package homePageTest;

import base.CommonAPI;
import org.testng.annotations.Test;
import homePage.HamburgerMenuPage;

public class HamburgerMenuTest extends CommonAPI {
    @Test(enabled = true)

    public void getHamburgerMenu(){
        HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage(getDriver());

        hamburgerMenuPage.setHamburgerMenu();
    }

}
