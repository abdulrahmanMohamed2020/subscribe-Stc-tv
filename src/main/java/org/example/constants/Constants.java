package org.example.constants;

import java.util.HashMap;
import java.util.Map;

public class Constants {


    public static Map<String,String> getLiteCurrencies() {

        Map<String,String> currencyLite = new HashMap<>();
        currencyLite.put("bh","2 BHD/month");
        currencyLite.put("sa","15 SAR/month");
        currencyLite.put("kw","1.2 KWD/month");

        return currencyLite;
    }

    public static Map<String,String> getClassicCurrencies() {

        Map<String,String> currencyClassic = new HashMap<>();
        currencyClassic.put("bh","3 BHD/month");
        currencyClassic.put("sa","25 SAR/month");
        currencyClassic.put("kw","2.5 KWD/month");

        return currencyClassic;
    }

    public static Map<String,String> getPremiumCurrencies() {

        Map<String,String> currencyPremium = new HashMap<>();
        currencyPremium.put("bh","6 BHD/month");
        currencyPremium.put("sa","60 SAR/month");
        currencyPremium.put("kw","4.8 KWD/month");

        return currencyPremium;
    }
}
