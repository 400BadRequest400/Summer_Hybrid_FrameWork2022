package homePageTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import homePage.AmazonMusicPage;

public class AmazonMusicTest extends CommonAPI {

    @Test
    public void getAmazonMusicTest(){

        AmazonMusicPage amazonMusicPage = new AmazonMusicPage(getDriver());
        amazonMusicPage.setAmazonMusicPage();

        String expectedResult = "Amazon Sign-In";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
