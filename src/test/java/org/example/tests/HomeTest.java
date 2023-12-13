package org.example.tests;

import org.example.base.BaseTest;
import org.example.pages.HomePage;

import org.example.constants.Constants;
import org.example.base.CustomSoftAssert;
import org.testng.annotations.Test;

import java.util.List;

public class HomeTest extends BaseTest {

    HomePage homePage;

    @Test(description = "Validate the packages, price and currency for all countries")
    public void validatePackages() {
        CustomSoftAssert softAssert = new CustomSoftAssert();

        homePage = new HomePage(getDriver());

        List<String> countriesStr = homePage.getCountries();

        countriesStr.forEach(country -> {
            homePage.clickOnCountryBtn();
            homePage.selectCountry(country);

            softAssert.assertEquals(homePage.getLitePlan(),"LITE");
            softAssert.assertEquals(homePage.getClassicPlan(),"CLASSIC");
            softAssert.assertEquals(homePage.getPremiumPlan(),"PREMIUM");

            softAssert.assertEquals(homePage.getLiteCurrency(),Constants.getLiteCurrencies().get(country),"Lite currency is not correct for this country: " +country);
            softAssert.assertEquals(homePage.getClassicCurrency(),Constants.getClassicCurrencies().get(country),"Classic currency is not correct for this country: " +country);
            softAssert.assertEquals(homePage.getPremiumCurrency(),Constants.getPremiumCurrencies().get(country),"Premium currency is not correct for this country: " +country);

        });
        softAssert.assertAll();
    }
}
