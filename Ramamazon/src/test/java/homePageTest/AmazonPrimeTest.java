package homePageTest;

import base.CommonAPI;
import org.testng.annotations.Test;
import homePage.AmazonPrimePage;

public class AmazonPrimeTest extends CommonAPI {


    @Test
    public void amazonPrimeButton(){
        AmazonPrimePage amazonPrimePage = new AmazonPrimePage(getDriver());

        amazonPrimePage.setAmazonPrime();

    }
}
