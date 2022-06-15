package homePageTest;

import base.CommonAPI;
import org.testng.annotations.Test;
import homePage.AmazonRegistryPage;

public class AmazonRegistryTest extends CommonAPI {
    @Test
    public void getAmazonRegistry(){
        AmazonRegistryPage amazonRegistryPage = new AmazonRegistryPage(getDriver());

        amazonRegistryPage.setAmazonRegistry();
    }
}
