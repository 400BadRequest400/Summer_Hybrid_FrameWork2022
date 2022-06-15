package homePageTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import homePage.AmazonNewReleasesPage;

public class AmazonNewReleasesTest extends CommonAPI {

    @Test(enabled = true)
    public void amazonNewReleasesButton(){
        AmazonNewReleasesPage amazonNewReleasesPage = new AmazonNewReleasesPage(getDriver());
        amazonNewReleasesPage.setAmazonNewReleases();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases on Amazon";
        String actualResult =getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
