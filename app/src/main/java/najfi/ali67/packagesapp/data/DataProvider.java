package najfi.ali67.packagesapp.data;

import java.util.ArrayList;
import java.util.List;

import najfi.ali67.packagesapp.Models.Package;
import najfi.ali67.packagesapp.R;

public class DataProvider {

    /******************************* Jazz Packages ************************************/
    /**
     * method to get all jazz/warid call packages
     *
     * @return jazz/warid call packages list
     */
    public List<Package> getCallJazzPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Make Your Own Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setOnNet("Any Mins")
                .setOffNet("Any Mins")
                .setSms("Any Msgs")
                .setInternet("Any MB")
                .setValidity("1, 7, 30 Days")
                .setCode("*303#")
                .setDescription("Status: *303*1# for daily validity\nStatus: *303*7# for weekly validity\nStatus: *303*20# for monthly validity")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Daily Day Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("300 Mins")
                .setSms("300 Msgs")
                .setInternet("20 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 14/-")
                .setCode("*340#")
                .setDescription("Take charge of your day with the day bundle. Enjoy 300 On-Net mins, 300 SMS and 20 MBs for the next 24 hours")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Daily Super Offer")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("1440 Mins")
                .setSms("50 Msgs")
                .setInternet("150 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 17/-")
                .setCode("*212#")
                .setDescription("Status: *212*2#\nInfo: *212*3#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Daily Super Plus Offer")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("500 Mins")
                .setOffNet("5 Mins")
                .setSms("500 Msgs")
                .setInternet("500 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 28/-")
                .setCode("*558#")
                .setDescription("Status: *558*2#\nIf you are not subscribed to any bundle base rate will be charged i.e. Rs. 5/MB. Charging pulse will be 512KB")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("3 Day Max Offer")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("100 Mins")
                .setInternet("1 GB")
                .setValidity("3 Days")
                .setPrice("Rs. 35/-")
                .setCode("*631#")
                .setDescription("Status: *631*2#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Weekly Voice Offer")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("600 Mins")
                .setValidity("7 Days")
                .setPrice("Rs. 75/-")
                .setCode("*211#")
                .setDescription("Status: *211*2#\nSharing Code: *308#\nStatus of shared incentive: *308*2#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("ALL IN ONE Social")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("1000 Mins")
                .setInternet("3GB GB")
                .setValidity("7 Days")
                .setPrice("Rs. 89/-")
                .setCode("*668#")
                .setDescription("3 GB Data (WhatsApp, Facebook And IMO)\nStatus Code: *668*2#")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Work From Home Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("Unlimited Mins")
                .setInternet("10 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 95/-")
                .setCode("*117*14#")
                .setDescription("This Offer is usable between 8am - 6pm")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Weekly Hybrid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("100 Mins")
                .setOffNet("20 Mins")
                .setSms("1000 Msgs")
                .setInternet("1 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 120/-")
                .setCode("*407#")
                .setDescription("Status Code: *407*2#\nInfo Code: *407*3#\nDe-Activation Code: *407*4#")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Weekly All Network Offer")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("1000 Mins")
                .setOffNet("60 Mins")
                .setSms("1000 Msgs")
                .setInternet("2 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 170/-")
                .setCode("*700%23")
                .setDescription("Status Code: *700*2%23\nInfo Code: *700*3%23\nDe-Activation Code: *700*4%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Weekly Super Duper")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("1500 Mins")
                .setOffNet("60 Mins")
                .setSms("1500 Msgs")
                .setInternet("3 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 210/-")
                .setCode("*770%23")
                .setDescription("Status Code: *770*2%23\nInfo Code: *770*3%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Weekly Super Plus")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("5000 Mins")
                .setOffNet("70 Mins")
                .setSms("5000 Msgs")
                .setInternet("12 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 250/-")
                .setCode("*505%23")
                .setDescription("Status Code: *505*2%23\n12 GB Data (2am - 2pm)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Mahana Bachat Offer")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("200 Mins")
                .setOffNet("20 Mins")
                .setSms("2000 Msgs")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 75/-")
                .setCode("*614%23")
                .setDescription("Status Code: *614*2%23\nData MBs are usable on WhatsApp Only")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Monthly Super Max")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("6000 Mins")
                .setOffNet("60 Mins")
                .setSms("6000 Msgs")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 299/-")
                .setCode("*506%23")
                .setDescription("Status Code: *506*2%23\n30GB Data [10 GBs + 10 GBs (2am - 2pm) + 10 GBs Youtube]")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Monthly Hybrid Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("10,000 Mins")
                .setOffNet("50 Mins")
                .setSms("1000 Msgs")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 444/-")
                .setCode("*430%23")
                .setDescription("Status Code: *430*2%23\nInfo Code: *430*3%23\nDaily Limit: 330 Mins")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("Monthly Super Duper")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("3000 Mins")
                .setOffNet("150 Mins")
                .setSms("3000 Msgs")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 600/-")
                .setCode("*706%23")
                .setDescription("Status Code: *706*2%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Jazz Super Duper Card")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("2000 Mins")
                .setOffNet("150 Mins")
                .setSms("2000 Msgs")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 600/-")
                .setCode("*601%23")
                .setDescription("Status Code: *601*2%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Monthly Super Duper Plus")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("5000 Mins")
                .setOffNet("300 Mins")
                .setSms("5000 Msgs")
                .setInternet("15 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 977/-")
                .setCode("*707%23")
                .setDescription("Status Code: *707*2%23\nInfo Code: *707*3%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("Voice Infinity Offer")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("100 Mins")
                .setValidity("6 Months")
                .setPrice("Rs. 40/-")
                .setCode("*710%23")
                .setDescription("Status Code: *710*2%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("J 300 PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("1000 Mins")
                .setOffNet("150 Mins")
                .setSms("1000 Msgs")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 499/-")
                .setCode("*777%23")
                .setDescription("Offer for Jazz PostPaid consumer only\nInternet Bundle Details: *443%23\nGet Bill/Incentive details: *1111%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("J 600 PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("2000 Mins")
                .setOffNet("300 Mins")
                .setSms("2000 Msgs")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 799/-")
                .setCode("*777%23")
                .setDescription("Offer for Jazz PostPaid consumer only\nInternet Bundle Details: *443%23, Helpline: 777\nGet Bill/Incentive details: *1111%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("J 999 PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("Unlimited Mins")
                .setOffNet("500 Mins")
                .setSms("1000 Msgs")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 999/-")
                .setCode("*777%23")
                .setDescription("Offer for Jazz PostPaid consumer only\nInternet Bundle Details: *443%23, Helpline: 777\nGet Bill/Incentive details: *1111%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("J 1500 PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOnNet("Unlimited Mins")
                .setOffNet("500 Mins")
                .setSms("7000 Msgs")
                .setInternet("8 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1500/-")
                .setCode("*777%23")
                .setDescription("Offer for Jazz PostPaid consumer only\nInternet Bundle Details: *443%23, Helpline: 777\nGet Bill/Incentive details: *1111%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("J All-Net Lite PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOffNet("100 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 100/-")
                .setDescription("Free minutes are for all on-net and off-net local numbers")
                .build()
        );


        packageList.add(new Package.Builder()
                .setTitle("J All-Net Mini PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOffNet("200 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 200/-")
                .setDescription("Free minutes are for all on-net and off-net local numbers")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("J All-Net Smart PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOffNet("300 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 300/-")
                .setDescription("Free minutes are for all on-net and off-net local numbers")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("J All-Net Super PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOffNet("400 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 400/-")
                .setDescription("Free minutes are for all on-net and off-net local numbers")
                .build()
        );

        packageList.add(new Package.Builder()
                .setTitle("J All-Net Budget PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("1")
                .setImageResId(R.drawable.jazz_warid_logo)
                .setOffNet("500 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 500/-")
                .setDescription("Free minutes are for all on-net and off-net local numbers")
                .build()
        );

        return packageList;
    }

    /**
     * method to get all jazz/warid sms packages
     *
     * @return jazz/warid sms packages list
     */
    public List<Package> getSMSJazzPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Daily SMS + WhatsApp Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("2")
                .setSms("1800 Msgs")
                .setInternet("10 MB")
                .setValidity("1 Day")
                .setCode("*334%23")
                .setDescription("Mb's are usable for WhatsApp Only\nStatus Code: *334*2%23\nInfo Code: *334*3%23\nDe-Activation Code: *334*4%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly SMS + WhatsApp Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("2")
                .setSms("1500 Msgs")
                .setInternet("25 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 20/-")
                .setCode("*101*1*07%23")
                .setDescription("Status Code: *101*2*07%23\nInfo Code: *101*3*07%23\nDe-Activation Code: *101*4*07%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly SMS + WhatsApp Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("2")
                .setSms("12000 Msgs")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 99/-")
                .setCode("*101*1*02%23")
                .setDescription("Status Code: *101*2*02%23\nInfo Code: *101*3*02%23\nDe-Activation Code: *101*4*02%23\nMBs are usable for WhatsApp, Facebook and Imo only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("JSMS-1 PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("2")
                .setSms("250 Msgs")
                .setInternet("250 MB")
                .setValidity("1 Month")
                .setPrice("Rs. 50/-")
                .setCode("*441*17%23")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nSubscription: Jazz: *441*17%23, Warid: *777%23 Menu")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("JSMS-2 PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("2")
                .setSms("750 Msgs")
                .setInternet("750 MB")
                .setValidity("1 Month")
                .setPrice("Rs. 90/-")
                .setCode("*441*18%23")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nSubscription: Jazz: *441*18%23, Warid: *777%23 Menu")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("JSMS-3 PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("2")
                .setSms("Unlimited Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 150/-")
                .setCode("*441*19%23")
                .setDescription("Unlimited (6000 FUP)\nOffer available for Jazz postpaid consumer packages only.\nSubscription: Jazz: *441*19%23, Warid: *777%23Menu ")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz 2000 Add-on PostPaid")
                .setSim("JAZZ_WARID")
                .setNumber("2")
                .setSms("2000 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 50/-")
                .setCode("*441*25%23")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nSubscription: Jazz: *441*25%23, Warid: *777%23 Menu")
                .build()
        );

        return packageList;
    }

    /**
     * method to get all jazz/warid internet packages
     *
     * @return jazz/warid internet packages list
     */
    public List<Package> getInternetJazzPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("SUPER GHANTA OFFER")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("1 Hour")
                .setPrice("Rs. 9/-")
                .setCode("*638%23")
                .setDescription("Status Code: *638*2%23\nEnjoy 1 GB Jazz Super 4G data for an hour at the lowest rate!")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Daily YouTube Social")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 15/-")
                .setCode("*968%23")
                .setDescription("Enjoy Facebook, WhatsApp & Youtube for the whole day")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Daily Extreme")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("2 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 15/-")
                .setCode("*757%23")
                .setDescription("2GB Data (12am - 12pm")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Daily Mega")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 27/-")
                .setCode("*117*4%23")
                .setDescription("Status Code: *117*4*2%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Extreme")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("25 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 75/-")
                .setCode("*117*1%23")
                .setDescription("Status Code: *117*1*2%23\n25GB Data (12am - 12pm)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Youtube + Social")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 89/-")
                .setCode("*660%23")
                .setDescription("Status Code: *660*2%23\n5GB data for IMO, WhatsApp, YouTube & Facebook")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Work From Home Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setOnNet("Unlimited Mins")
                .setInternet("10 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 95/-")
                .setCode("*117*14%23")
                .setDescription("With work from home bundle get 10GB data and unlimited jazz mins from 8am to 6pm for the entire week\nThe offer's incentive is usable between 8am - 6pm")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Premium")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setOffNet("50 Mins")
                .setInternet("4 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 169/-")
                .setCode("*117*47%23")
                .setDescription("Status Code: *117*47*2%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Mega")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("7 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 210/-")
                .setCode("*159%23")
                .setDescription("Status Code: *159*2%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Mega Plus")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("25 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 275/-")
                .setCode("*453%23")
                .setDescription("Status Code: *453*2%23\nThis Offer is currently not available in Bajour, Mohmand, Khyber, Orakzai, Wazirstan, Kurram, Kalat and Kech (Turbat).")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Browser")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 89/-")
                .setCode("*709%23")
                .setDescription("Status Code: *709*2%23\nInfo Code: *709*3%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Social")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setSms("12000 Msgs")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 99/-")
                .setCode("*101*1*02%23")
                .setDescription("Status Code: *101*2*02%23\nInfo Code: *101*3*02%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Mega Plus")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("12 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 349/-")
                .setCode("*117*30%23")
                .setDescription("Status Code: *117*30*2%23\nVolume: 12 GB (6GB 2am - 2pm)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Supreme")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 499/-")
                .setCode("*117*32%23")
                .setDescription("Status Code: *117*32*2%23\nVolume: 20GB (1GB 2am - 2pm)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Premium")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setOffNet("250 Mins")
                .setInternet("25 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 620/-")
                .setCode("*2000%23")
                .setDescription("Status Code: *2000*2%23\n25GB Data (10GB Youtube")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly WhatsApp")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 75/-")
                .setCode("*443%23")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nTo subscribe to 2G, 3G and 4G bundles dial *443%23.\nAlternatively, customers can dial 777 or visit their nearest Jazz Experience Center/Jazz Point.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Streamer")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 250/-")
                .setCode("*443%23")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nTo subscribe to 2G, 3G and 4G bundles dial *443%23.\nAlternatively, customers can dial 777 or visit their nearest Jazz Experience Center/Jazz Point.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Premium")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500/-")
                .setCode("*443%23")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nTo subscribe to 2G, 3G and 4G bundles dial *443%23.\nAlternatively, customers can dial 777 or visit their nearest Jazz Experience Center/Jazz Point.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Supreme")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("14 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 800/-")
                .setCode("*443%23")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nTo subscribe to 2G, 3G and 4G bundles dial *443%23.\nAlternatively, customers can dial 777 or visit their nearest Jazz Experience Center/Jazz Point.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Super")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("24 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1020/-")
                .setCode("*443%23")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nTo subscribe to 2G, 3G and 4G bundles dial *443%23.\nAlternatively, customers can dial 777 or visit their nearest Jazz Experience Center/Jazz Point.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Ultimate")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("50 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1870/-")
                .setCode("*443%23")
                .setDescription("Offer available for Jazz postpaid consumer packages only.\nTo subscribe to 2G, 3G and 4G bundles dial *443%23.\nAlternatively, customers can dial 777 or visit their nearest Jazz Experience Center/Jazz Point.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Social")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 67/-")
                .setCode("*660%23")
                .setDescription("(Facebook, IMO + WhatsApp)\nStatus Code: *660*2%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Youtube")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 90/-")
                .setCode("*570%23")
                .setDescription("Status Code: *570*2%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Social")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("6 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 150/-")
                .setCode("*117*45%23")
                .setDescription("Status Code: *117*45*2%23\nFacebook & WhatsApp Only")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Extreme")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 95/-")
                .setCode("*117*14%23")
                .setDescription("Status Code: *117*14*2%23\nDe-Activation Code: *117*14*4%23\n2am - 2pm")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Extreme")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 168/-")
                .setCode("*117*34%23")
                .setDescription("Status Code: *117*34*2%23\nDe-Activation Code: *117*34*4%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Streamer")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 107/-")
                .setCode("*117*7%23")
                .setDescription("Status Code: *117*7*2%23\nDe-Activation Code: *117*7*4")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Premium")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("3 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 165/-")
                .setCode("*117*47%23")
                .setDescription("Status Code: *117*47*2%23\nDe-Activation Code: *117*47*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Mega")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("7 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 225/-")
                .setCode("*159%23")
                .setDescription("Status Code: *159*2%23\nDe-Activation Code: *159*4")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Weekly Mega 20GB")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 300/-")
                .setCode("*117*48%23")
                .setDescription("10GB (24hr) + 10GB (usable 1am - 8am)\nStatus Code: *117*48*2%23\nDe-Activation Code: *117*48*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Starter")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("4 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 242/-")
                .setCode("*117*77%23")
                .setDescription("2GB 2am - 2pm\nStatus Code: *117*77*2%23\nDe-Activation Code: *117*77*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Starter")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("8 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 422/-")
                .setCode("*117*31%23")
                .setDescription("4GB 2am - 2pm\nStatus Code: *117*31*2%23\nDe-Activation Code: *117*31*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Smart Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("15 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 600/-")
                .setCode("*117*35%23")
                .setDescription("7.5GB (24hr) + 7.5GB (usable 1am - 9am)\nStatus Code: *117*35*2%23\nDe-Activation Code: *117*35*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Basic Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("25 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 999/-")
                .setCode("*117*71%23")
                .setDescription("12.5GB (24hr) + 12.5GB (usable 1am - 9am)\nStatus Code: *117*71*2%23\nDe-Activation Code: *117*71*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Regular Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("60 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1500/-")
                .setCode("*117*73%23")
                .setDescription("30.5GB (24hr) + 30.5GB (usable 1am - 9am)\nStatus Code: *117*73*2%23\nDe-Activation Code: *117*73*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Mega 100GB")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("100 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2000/-")
                .setCode("*117*36%23")
                .setDescription("50GB (24hr) + 50GB (usable 1am - 9am)\nStatus Code: *117*36*2%23\nDe-Activation Code: *117*36*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Heavy Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2500/-")
                .setCode("*117*74%23")
                .setDescription("75GB (24hr) + 75GB (usable 1am - 9am)\nStatus Code: *117*74*2%23\nDe-Activation Code: *117*74*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Three Months Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("3 Months")
                .setPrice("Rs. 5500/-")
                .setCode("*117*15%23")
                .setDescription("50GB/month\nStatus Code: *117*15*2%23\nDe-Activation Code: *117*15*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("6 Months Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("600 GB")
                .setValidity("6 Months")
                .setPrice("Rs. 12000/-")
                .setCode("*117*16%23")
                .setDescription("100GB/month\nStatus Code: *117*16*2%23\nDe-Activation Code: *117*16*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Internet Regular")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("60 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1750/-")
                .setCode("*117*73%23")
                .setDescription("30GB (24hr) + 30GB (usable 1am - 9am)\nStatus Code: *117*73*2%23\nDe-Activation Code: *117*73*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Internet Mega")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("100 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2000/-")
                .setCode("*117*36%23")
                .setDescription("50GB (24hr) + 50GB (usable 1am - 9am)\nStatus Code: *117*36*2%23\nDe-Activation Code: *117*36*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Monthly Internet Heavy")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2500/-")
                .setCode("*117*74%23")
                .setDescription("75GB (24hr) + 75GB (usable 1am - 9am)\nStatus Code: *117*74*2%23\nDe-Activation Code: *117*74*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("3 Months Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("3 Months")
                .setPrice("Rs. 5500/-")
                .setCode("*117*15%23")
                .setDescription("50GB/month\nStatus Code: *117*15*2%23\nDe-Activation Code: *117*15*4")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("6 Months Bundle")
                .setSim("JAZZ_WARID")
                .setNumber("3")
                .setInternet("600 GB")
                .setValidity("6 Months")
                .setPrice("Rs. 12000/-")
                .setCode("*117*16%23")
                .setDescription("100GB/month\nStatus Code: *117*16*2%23\nDe-Activation Code: *117*16*4")
                .build()
        );

        return packageList;
    }

    /**
     * method to get all the jazz/warid location based packages
     *
     * @return jazz/warid location based packages list
     */
    public List<Package> getLocationBasedJazzPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("WhatsApp Daily Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("200 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 2/-")
                .setCode("*311%23")
                .setDescription("Valuing customers convenience, Jazz brings its customers a daily WhatsApp offer for the residents of Alipur, Kabirwala, Khan Bela, Liaqatpur, Muzzaffergarh and Uch Sharif. Once subscribed, the offer will automatically be re-subscribed without having to dial the subs code.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Gujranwala Super Night Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("5 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 6/-")
                .setCode("*775%23")
                .setDescription("Validity: 12am - 9am\nSuper night offer is for Gujranwala only.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Sahiwal Super Night Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("5 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 6/-")
                .setCode("*577%23")
                .setDescription("Validity: 12am - 9am\nSuper night offer is for Sahiwal only.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Janoobi Punjab Super Night Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("5 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 8/-")
                .setCode("*742%23")
                .setDescription("Validity 11pm - 9am (for one day)\nOffer is valid in the following cities: Karor Pakka, Lal Suhanra, Kabirwala, Bahawalpur, Shujabad, Jalalpur, Pirwala, Ahmadpur, East Khanewal, Ahmadpur East, Dera Ghazi Khan, Uch Sharif, Muzaffargarh, Alipur, Layyah, Jatoi Dajal, Tibba Sultanpur, Liaqatpur, Kat Addu, Multan, Taunsa, Dunyapur, Jahanian, Rojhan Rajanpur, Jampur, Yazman, Shorkot")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Sindh Super Data Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("5 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 8/-")
                .setCode("*773%23")
                .setDescription("Validity: 11pm - 9am\nJazz brings an exciting offer for Hyderabad, Kotri & Jamshoro! Enjoy the Premium 4G experience by subscribing to Hyderabad Super Night Offer!")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Karachi Daily Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("1500 Msgs")
                .setInternet("250 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 12/-")
                .setCode("*400%23")
                .setDescription("Offer is valid for entire Karachi and hub areas")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Sindh Daily Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("1500 Msgs")
                .setInternet("250 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 12/-")
                .setCode("*522%23")
                .setDescription("Status Code: *522*2%23\nOffer for Hyderabad, Dadu, Jamshoro, Kotri, Mirpur Khas, Tando Adam, Tando Alayaar and other areas.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("KPK Daily Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("1500 Msgs")
                .setInternet("250 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 12/-")
                .setCode("*291%23")
                .setDescription("Status Code: *291*2%23\nInfo Code: *291*3%23\nOffer for Peshawar, Bajaur Agency, Kurram Agency, Khyber Agency, Charsada, Chakwal, Talagang, Mardan, Jhelum, Mehmand Agency, Taxila, Attock, Bannu, Harripur, Hangu, Tank, Nowshera, Kotli, DI Khan, Mansehra and other areas.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Punjab Daily Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("1000 Msgs")
                .setInternet("250 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 12/-")
                .setCode("*6000%23")
                .setDescription("Status Code: *6000*2%23\nOffer for Mandi, Bahauddin, Gujrat, Gujranwala, Jhang, Bakkhar, Sialkot, Mianwali, Hafizabad, Sargodha, Sheikhupura and other areas.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Lajawab Haftawaar Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("1500 Mins")
                .setOffNet("25 Mins")
                .setSms("2500 Msgs")
                .setInternet("2.5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 54/-")
                .setCode("*565%23")
                .setDescription("Offer is for Mandi Bahaudin, Malakwal, Phalia, Dera Ghazi Khan, Jampur, Rajanpur, Dajal Rojahan, Taunsa")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Sindh Rabta Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("1000 Mins")
                .setValidity("7 Days")
                .setPrice("Rs. 54/-")
                .setCode("*766%23")
                .setDescription("Status Code: *766*2%23\nOffer for Sukkur, Jacobabad, Dharki, Ghotki, Thul, Naushero Feroz")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Super Chenab Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("600 Mins")
                .setOffNet("30 Mins")
                .setSms("600 Msgs")
                .setInternet("6 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 60/-")
                .setCode("*664%23")
                .setDescription("Offer for Chiniot, Rabwa, Laliyan, Bhuwana, Jamiabad, Jhok Kalra, Mathruma, Darul Sadr, Ahmednagar, Chenab Nagar and Kot Syed jalal")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Haftawaar Data Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("500 Mins")
                .setInternet("13 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 70/-")
                .setCode("*545%23")
                .setDescription("3GB Data + 10GB WhatsApp\nOffer for Hyderabad, Jamshoro, Jati, Jhampir, Karachi and more cities")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Sargodha Weekly Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("2000 Mins")
                .setSms("2000 Msgs")
                .setInternet("2 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 89/-")
                .setCode("*627%23")
                .setDescription("Offer for Sargodha and Bhalwal and surrounding cities")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Attock, Harripur and Nowshera Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("300 Mins")
                .setInternet("7 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 100/-")
                .setCode("*589%23")
                .setDescription("7GB Data (2GB 2am - 2pm)\nOffer is for Attock, Haripur and Nowshera Only")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Punjab Haftawaar Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOffNet("50 Mins")
                .setSms("5000 Msgs")
                .setInternet("10 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 100/-")
                .setCode("*307%23")
                .setDescription("Status Code: *307*2%23\n10GB Data (5GB 2am - 2pm)\nThis offer is for subscribers in Gujrat, Lalamusa and Jalalpur Jattan")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Haftawaar All Rounder Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("1000 Mins")
                .setOffNet("50 Mins")
                .setSms("1000 Msgs")
                .setInternet("1 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 120/-")
                .setCode("*747%23")
                .setDescription("Offer is valid for Rawalpindi, Islamabad and Balochistan Cities include Quetta, Khuzdar, Gawadar, Pishin, Jaffarabad, Zhob, Ziarat etc")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Taxila Haftawaar Data Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 120/-")
                .setCode("*596%23")
                .setDescription("Offer is valid for Taxila only")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Peshawar Chakwal Haftawaar Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOffNet("50 Mins")
                .setInternet("10 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 130/-")
                .setCode("*109%23")
                .setDescription("Limited Time Offer")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Sindh Haftawaar Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("5000 Mins")
                .setOffNet("50 Mins")
                .setSms("5000 Msgs")
                .setInternet("10 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 222/-")
                .setCode("*406%23")
                .setDescription("Status Code: *406*2*\nDe-Activation Code: *406*4%23\nOffer is valid for Rahim Yar Khan, Daharki, Sadiqabad, Khan Bela, Kandhkot, Kashmore, Salehpat, Bhiria City, Larkana, Sukkur, Liaqatpur, Jacobabad, Feroze, Shahdkot, Khairpur, Thul, Shikarpur, Pano Aqil, Lakhi")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Karachi Mahana Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("5000 Mins")
                .setOffNet("150 Mins")
                .setSms("5000 Msgs")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 444/-")
                .setCode("*529%23")
                .setDescription("Status Code: *529*2%23\n10GB Data (5GB 2am - 2pm)\nThis offer is for Karachi only")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("DG Khan Monthly Hybrid")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("2000 Mins")
                .setOffNet("200 Mins")
                .setSms("4000 Msgs")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 300/-")
                .setCode("*705%23")
                .setDescription("Status Code: *705*2%23\nFree Minutes / SMS / Data will be usable 24 hours a day")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Karachi Monthly Facebook Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 45/-")
                .setCode("*532%23")
                .setDescription("Status Code: *532*2%23\nOffer for Karachi")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Shahdadkot Monthly Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setOnNet("2000 Mins")
                .setOffNet("200 Mins")
                .setSms("4000 Msgs")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 300/-")
                .setCode("*873%23")
                .setDescription("Limited Time offer")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Multan Social Offer")
                .setSim("JAZZ_WARID")
                .setNumber("4")
                .setInternet("3 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 30/-")
                .setCode("*499%23")
                .setDescription("Status Code: *499*2%23")
                .build()
        );

        return packageList;
    }

    /**
     * method to get all the important code list
     *
     * @return jazz/warid important code list
     */
    public List<Package> getOtherJazzPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Balance Check")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setPrice("Rs. 0.12/-")
                .setCode("*111%23")
                .setDescription("You can also check your balance by dialing 123")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Advance")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setPrice("Rs. 4.60/-")
                .setCode("*112%23")
                .setDescription("Rs. 15 Advance\nDe-Activation Code: *112*4%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Balance Share")
                .setSim("JAZZ_WARID")
                .setPrice("Rs. 4.77+ Tax/-")
                .setNumber("5")
                .setDescription("Dial *100*<9230XXXXXXXX>*<amount>%23\nAfter this, confirmation will have to sent by replying with '1' Jazz Share is a convenient, flexible and an easy service that lets users share balance of any amount ranging from Rs 15 to Rs. 500.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Check Your prepaid Package")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setCode("*444%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Menu")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setDescription("Subscription Send 'List' to 6611 Un-Subscription send 'UnSub' to 6611 with Jazz Menu.\nTo unsubscribe from a service the customer has to type 'unsub <Service Name>' and send it to 6611")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Internet Menu")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setCode("*443%23")
                .setDescription("Read more about your favorite package from the Menu bar")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz FnF Advance")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setPrice("Rs. 1/-")
                .setCode("*1112%23")
                .setDescription("Jazz FnF Advance is an additional service to Jazz advance, which allows any Jazz prepaid subscriber who has already utilized Jazz Advance or Super Advance and not yet repaid Jazz/Advance.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Conference Call")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setCode("*188%23")
                .setDescription("With the Conference call feature, you can add up to 5 numbers on a conference call including on-net, off-net and international numbers\nDe-Activation Code: *188*1%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Beep Call")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setPrice("Rs. 0.05/-")
                .setCode("5188")
                .setDescription("Subscription: Send 'SUB' to 5188\nUn-Subscription: Send 'UNSUB' to 5188 with beep call")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Intro Me")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 0.51/-")
                .setCode("*6060")
                .setDescription("Jazz Intro Me gives the facility to send a quick introduction to the receiver by making a flash message appear on receivers mobile while the phone rings. You have the facility to the customize messages or greeting for every caller.\n Call charges with prefix: Rs. 0.70/30 sec.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("End of Call Notification")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.08/-")
                .setCode("*122%23")
                .setDescription("De-Activation Code: *122*4\n Once subscribed to the End of call notifications, you receive a notification regarding your call cost and the remaining account balance everytime you end a call.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Call & SMS Block Service")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.18/-")
                .setCode("*420%23")
                .setDescription("Now with Jazz's call & SMS Block service customers can block unwanted calls and SMS from on-net and off-net numbers")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Missed Call Alert")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.25/-")
                .setCode("*180%23")
                .setDescription("De-Activation Code: *180*1%23\nThis service notifies a subscriber about the calls missed due to reasons like: out of coverage or handset powered off.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Job Alerts")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.42/-")
                .setCode("5622")
                .setDescription("To subscribe on the service send 'sub' to 5622. To unsubscribed from the service send 'unsub' to 5622. Are you looking for a job? Then jazz job alerts is at your service. Stay up to date with local and international jobs.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Double Up Number")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.44/-")
                .setCode("4030")
                .setDescription("De-Activation Code: 4030\nSubscription Dial 4030 and press '1'.\nUn-subscription Dial 4030 and press '0'.\nCharges Subscription: PKR 1.43/Day. Double Up Number service allows a subscriber to have a virtual number in addition to the primary number on the same SIM.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Tunes")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 2.01 + Tax/-")
                .setCode("230")
                .setDescription("Subscription Dial: 230 or 'sub' to 230\nUn-Subscription Dial 230 or send 'unsub' to 230 SMS: Rs, 9.55 + Tax per SMS")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz My Status")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 1.2/-")
                .setCode("6085")
                .setDescription("Rs. 1.20/day\nSubscription SMS 'SUB' to 6085\nUn-subscription SMS 'UNSUB' to 6525 With Jazz My Status you can post a status to the calling party upon receiving a call from them.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Smart SMS")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 2.99/-")
                .setCode("*66%23")
                .setDescription("Rs. 0.60 + tax per opt-in\nRs. 2.99 + tax Weekly(prepaid)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Call Tag")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 5.98/-")
                .setCode("*642%23")
                .setDescription("Subscription: *642%23\nUn-subscription: Send Unsub to 6425\nCall Charges: Rs. 0.597/min")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Auto Reply")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 7.14/-")
                .setCode("7071")
                .setDescription("De-Activation Code: *7071%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Zero Balance Call")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 7.15/-")
                .setCode("*600%23")
                .setDescription("The Zero Balance Call service allows prepaid customers to generate calls and send SMS to B-party, when they have zero balance.\nAllowed calls: 2 calls of 60 secs each.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("Jazz Notify Me")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 1/-")
                .setCode("*6528%23")
                .setDescription("De-Activation Code: *6528*1%23\nCharges subscription: Rs. 1 + tax")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.jazz_warid_logo)
                .setTitle("SMS Delivery Receipt")
                .setSim("JAZZ_WARID")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 17.92/-")
                .setCode("7344")
                .setDescription("Subscription: Send 'SUB' to 7344\nUn-subscription: Send 'UNSUB' to 7344")
                .build()
        );

        return packageList;
    }

    /******************************* PTCL Packages ************************/

    public List<Package> getCallPTCLPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Freedom 1000")
                .setSim("PTCL")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("900 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 1000/-")
                .setDescription("Unlimited on net calls\n 700 minutes to all nationwide mobile network within Pakistan \n 200 minutes to international Zone 1 destinations Free VAS bundle")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Freedom 3000")
                .setSim("PTCL")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("2200 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 3000/-")
                .setDescription("Unlimited on net calls\n 2000 minutes to all nationwide mobile network within Pakistan \n 200 minutes to international Zone 1 destinations Free VAS bundle")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Freedom 5000")
                .setSim("PTCL")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("4400 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 5000/-")
                .setDescription("Unlimited on net calls\n 4000 minutes to all nationwide mobile network within Pakistan \n 400 minutes to international Zone 1 destinations Free VAS bundle")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Freedom 8000")
                .setSim("PTCL")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("8800 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 8000/-")
                .setDescription("Unlimited on net calls\n 8000 minutes to all nationwide mobile network within Pakistan \n 800 minutes to international Zone 1 destinations Free VAS bundle")
                .build()
        );

        return packageList;
    }

    //Internet packages.
    public List<Package> getInternetPTCLPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Broadband 6 Mbps")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("Unlimited MB")
                .setValidity("1 Month")
                .setPrice("Rs. 1799/-")
                .setDescription("Up to 6Mbps with Unlimited Downloads fro Rs.1,799/-per month\n On existing Telephone connection, internet Installation charges are Rs.2499/-\n On new Telephone connection, internet installation charges are Rs.5,000/-")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Broadband 8 Mbps Free Smart TV")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("Unlimited MB")
                .setValidity("1 Month")
                .setPrice("Rs. 2449/-")
                .setDescription("Up to 8Mbps with free smart TV and Unlimited Downloads & Quality Video Streaming for Rs.2,249/- per month\n On existing Telephone connection, internet Installation charges are Rs.2499/-\n On new Telephone connection, internet installation charges are Rs.5,000/-")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Broadband 25 Mbps Free Smart TV")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("Unlimited MB")
                .setValidity("1 Month")
                .setPrice("Rs. 3299/-")
                .setDescription("Up to 25Mbps with free smart TV and Unlimited Downloads for Rs.3,299/- per month\n On existing Telephone connection, internet Installation charges are Rs.2499/-\n On new Telephone connection, internet installation charges are Rs.5,000/-")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Broadband 50 Mbps Free Smart TV")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("Unlimited MB")
                .setValidity("1 Month")
                .setPrice("Rs. 5099/-")
                .setDescription("Up to 50Mbps with free smart TV and High speed internet and seamless connectivity for Rs.5,099/- per month\n On existing Telephone connection, internet Installation charges are Rs.2499/-\n On new Telephone connection, internet installation charges are Rs.5,000/-")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Broadband 100 Mbps Free Smart TV")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("Unlimited MB")
                .setValidity("1 Month")
                .setPrice("Rs. 7599/-")
                .setDescription("Enjoy Unlimited Downloads, Fast Streaming & Browsing with free smart TV and High speed Internet for Rs.7599/- per month\n On existing Telephone connection, internet Installation charges are Rs.2499/-\n On new Telephone connection, internet installation charges are Rs.5,000/-")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("3G EVO Wingle 9.3 10GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 750/-")
                .setDescription("This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("3G EVO Wingle 9.3 20GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1000/-")
                .setDescription("This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("3G EVO Wingle 9.3 30GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1250/-")
                .setDescription("This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("3G EVO Wingle 9.3 50GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("50 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1500/-")
                .setDescription("This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("EVO Nitro Cloud 10GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 750/-")
                .setDescription("Connect up to 5 WiFi gadgets simultaneously.\n This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("EVO Nitro Cloud 20GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1000/-")
                .setDescription("Connect up to 5 WiFi gadgets simultaneously.\n This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("EVO Nitro Cloud 30GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1250/-")
                .setDescription("Connect up to 5 WiFi gadgets simultaneously.\n This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("EVO Nitro Cloud 50GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("50 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1500/-")
                .setDescription("Connect up to 5 WiFi gadgets simultaneously.\n This product is not available for sale in Karachi, Lahore, Islamabad, Rawalpindi, Azad, Jammu & Kashmir, Faisalabad, Multan, Gujranwala, Sialkot, Balochistan, DGKhan, Bannu, Kohat, Hangu,Karak and Thar")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("PTCL EVO C@rFi 15GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("15 GB")
                .setValidity("3 Month")
                .setPrice("Rs. 4000/-")
                .setDescription("Plug-n-Play C@rFi Product - Simply plug into your vehicle cigarette lighter port to create a wifi hotspot no installation, no hassle")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("PTCL EVO C@rFi 30GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("6 Month")
                .setPrice("Rs. 5000/-")
                .setDescription("Plug-n-Play C@rFi Product - Simply plug into your vehicle cigarette lighter port to create a wifi hotspot no installation, no hassle")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("CharJi EVO Cloud 20GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1000/-")
                .setDescription("Single Mode mobile hotspot device, connect up to 10 WiFi gadgets simultaneously.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("CharJi EVO Cloud 30GB")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1250/-")
                .setDescription("Single Mode mobile hotspot device, connect up to 10 WiFi gadgets simultaneously.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("CharJi EVO Cloud: Karachi Unlimited Packages")
                .setSim("PTCL")
                .setNumber("3")
                .setInternet("Unlimited GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1499/-")
                .setDescription("Price Breakdown:\n 1)CharJi Cloud Device: Rs.2500/-\n 2)CharJi Unlimited Package : Rs.1499/-(incl taxes)\n Cash-On-deliveryCharges : Rs.234/-\n Total Amount: Rs.4733/-(Payable at the time of delivery).")
                .build()
        );

        return packageList;
    }

    //Smart TV Packages.
    public List<Package> getOtherPTCLPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Smart TV App")
                .setSim("PTCL")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 99/-")
                .setDescription("The Smart TV App is absolutely FREE for PTCl Broadband, Smart TV & Char Ji user. You can enjoy hundreds of live Tv channels, movies and TV on-demand on your mobile, tablets (Android & IOS ) and PCs (using browsers eg. Internet explorer Google Chrome etc.) Whenever and whenever you want. Customers using only landline service will be charged Rs 99/- per month")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Smart TV with Broadband")
                .setSim("PTCL")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 525/-")
                .setDescription("This Package includes only Smart TV charges, Customer can get Landline and Broadband Packages of his on choice")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ptcl_logo)
                .setTitle("Smart TV App")
                .setSim("PTCL")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 799/-")
                .setDescription("Smart TV + telephone (Freedom Package)")
                .build()
        );

        return packageList;
    }

    /********************************* Telenor *************************/
    public List<Package> getCallTelenorPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Make your own offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("Any Mins")
                .setOffNet("Any Mins")
                .setSms("Any Msgs")
                .setInternet("Any MB")
                .setValidity("1, 7, 30 Days")
                .setCode("*347%23")
                .setDescription("Get the freedom to choose and personalize an offer that is just perfect for you.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Telenor Good Time Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setInternet("250 MB")
                .setValidity("2 Hour")
                .setPrice("Rs. 6/-")
                .setCode("*345*20%23")
                .setDescription("Enjoy 2 hours of talktime to any Telenor number (except 6pm to 9pm) and 200 MB internet + 50 MB for facebook for 2 hours.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Telenor Superload offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("20 Mins")
                .setValidity("1 Day")
                .setPrice("Rs. 0.8/-")
                .setCode("*5*100%23")
                .setDescription("Get 20 free minutes for all network upon recharge of Rs. 100 or more.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Ticky Pack Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("50 Mins")
                .setValidity("1 Day")
                .setPrice("Rs. 11/-")
                .setCode("*345*050%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Full Day Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setInternet("150 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 13/-")
                .setCode("*5*250%23")
                .setDescription("50MBs + 100MBs WhatsApp")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("3 Day Onnet Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("250 Mins")
                .setSms("500 Msgs")
                .setInternet("15 MB")
                .setValidity("3 Days")
                .setPrice("Rs. 36/-")
                .setCode("*730%23")
                .setDescription("All djuice customers are eligible for this offer.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Telenor 3/3 Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("600 Mins")
                .setSms("300 Msgs")
                .setInternet("50 MB")
                .setValidity("3 Days")
                .setPrice("Rs. 50/-")
                .setCode("*345*243%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("3 Day Sahulat Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("250 Mins")
                .setOffNet("25 Mins")
                .setSms("250 Msgs")
                .setInternet("150 MB")
                .setValidity("3 Days")
                .setPrice("Rs. 52/-")
                .setCode("*5*3%23")
                .setDescription("50 MB internet along with 100 MB Social Pack")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("First Free Call Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setValidity("7 Days")
                .setPrice("Rs. 5/-")
                .setCode("*888%23")
                .setDescription("Get First Telenor Call of the day for free between 12am - 12pm everyday for 7 days, including the day subscriptions.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Haftawaar Offpeak Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setValidity("7 Days")
                .setPrice("Rs. 55/-")
                .setCode("*978%23")
                .setDescription("Unlimited on-net minutes form 12 am - 7 pm")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Sahulat Mini Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("200 Mins")
                .setOffNet("20 Mins")
                .setSms("200 Msgs")
                .setInternet("300 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 75/-")
                .setCode("*170%23")
                .setDescription("100MB internet along with 200MB Social Pack.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Haftawaar Chappar Phaar Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setInternet("420 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 90/-")
                .setCode("*5*700%23")
                .setDescription("70 MB + 350 Social MBs")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Haftawaar Sahulat Offer")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("1000 Mins")
                .setOffNet("70 Mins")
                .setSms("700 Msgs")
                .setInternet("450 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 115/-")
                .setCode("*5*7%23")
                .setDescription("100MB internet along with 350MB Social Pack.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Weekly Easy Card")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("1000 Mins")
                .setOffNet("50 Mins")
                .setSms("1000 Msgs")
                .setInternet("1.5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 135/-")
                .setCode("*963%23")
                .setDescription("Telenor weekly easy card can be subscribed by going to any nearby retailer or by getting an easy card scratch card or by dialing *963%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Weekly Easy Card Plus")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("1500 Mins")
                .setOffNet("60 Mins")
                .setSms("1500 Msgs")
                .setInternet("3 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 175/-")
                .setCode("*175%23")
                .setDescription("Telenor weekly easy card can be subscribe by going to any nearby retailer or by dialing code.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Mega Weekly Easy Card")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("2000 Mins")
                .setOffNet("70 Mins")
                .setSms("2000 Msgs")
                .setInternet("10 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 222/-")
                .setCode("*001%23")
                .setDescription("Internet: 10 GB (include 5GB 1am - 11am)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Easy Card 450")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("500 Mins")
                .setOffNet("50 Mins")
                .setSms("500 Msgs")
                .setInternet("3 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 450/-")
                .setCode("*350%23")
                .setDescription("1 GB internet + 2 GB WhatsApp")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Easy Card 600")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("3000 Mins")
                .setOffNet("150 Mins")
                .setSms("3000 Msgs")
                .setInternet("12 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 600/-")
                .setCode("*530%23")
                .setDescription("Internet 6GB + 6GB (1am - 11am)\nInternational Dialing 25 minutes Canada / US / UK\nThis offer can by subscribed by going ti any nearby retailer, by getting an easy card 600 Scratch card of by dialing code.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Easy Card 800")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("5000 Mins")
                .setOffNet("300 Mins")
                .setSms("5000 Msgs")
                .setInternet("18 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 800/-")
                .setCode("*80%23")
                .setDescription("Internet 9GB + 9GB (1am - 11am)\nThis offer can be subscribed by going to any nearby retailer, by getting any easy card 800 scratch card or by dialing code.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("On Net Bundle 100")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("500 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 100/-")
                .setCode("*345*831%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("On-net Bundle 250")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("1000 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 250/-")
                .setCode("*345*832%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("On Net Bundle 550")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("2500 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 550/-")
                .setCode("*345*833%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Any Network Voice Bundle 50")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("100 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 100/-")
                .setCode("*345*821%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Any Network Voice Bundle 250")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("250 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 250/-")
                .setCode("*345*822%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Any Network Packages 550")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("550 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 550/-")
                .setCode("*345*823%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom 300")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("1000 Mins")
                .setOffNet("150 Mins")
                .setSms("1000 Msgs")
                .setInternet("4 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 400/-")
                .setCode("*345*93%23")
                .setDescription("This offer is valid for postpaid numbers only.\n4GB (2GB  12pm - 5pm)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom 600")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("2000 Mins")
                .setOffNet("300 Mins")
                .setSms("2000 Msgs")
                .setInternet("9 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 800/-")
                .setCode("*345*93%23")
                .setDescription("This offer is valid for postpaid numbers only.\n9GB (2GB  12pm - 5pm)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom 1000")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("500 Mins")
                .setSms("8000 Msgs")
                .setInternet("12 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1350/-")
                .setCode("*345*93%23")
                .setDescription("This offer is valid for postpaid numbers only.\nFree Afternoons: 4GB (12pm - 5pm)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom 1500")
                .setSim("TELENOR")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("800 Mins")
                .setSms("15000 Msgs")
                .setInternet("32 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2000/-")
                .setCode("*345*93%23")
                .setDescription("This offer is valid for postpaid numbers only.\nFree Afternoons: 7GB (12pm - 5pm)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Smart 300")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("300 Mins")
                .setSms("50 Msgs")
                .setInternet("300 MB")
                .setValidity("1 Month")
                .setPrice("Rs. 403/-")
                .setDescription("This offer is valid for postpaid numbers only.\nVisit your nearest retailer for activation.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Smart 600")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("700 Mins")
                .setSms("100 Msgs")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 850/-")
                .setDescription("This offer is valid for postpaid numbers only.\nVisit your nearest retailer for activation.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Smart 1000")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("1200 Mins")
                .setSms("1000 Msgs")
                .setInternet("1.5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1450/-")
                .setDescription("This offer is valid for postpaid numbers only.\nVisit your nearest retailer for activation.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Smart 1500")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("1800 Mins")
                .setSms("1500 Msgs")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2150/-")
                .setDescription("This offer is valid for postpaid numbers only.\nVisit your nearest retailer for activation.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Smart 3000")
                .setSim("TELENOR")
                .setNumber("1")
                .setOffNet("3600 Mins")
                .setSms("3000 Msgs")
                .setInternet("4 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 4200/-")
                .setDescription("This offer is valid for postpaid numbers only.\nVisit your nearest retailer for activation.")
                .build()
        );

        return packageList;
    }

    public List<Package> getSMSTelenorPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Daily SMS Bundle")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("240 Msgs")
                .setValidity("1 Day")
                .setPrice("Rs. 4.78/-")
                .setCode("*345*116%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("5 Days SMS Bundle")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("300 Msgs")
                .setValidity("5 Days")
                .setPrice("Rs. 8.5/-")
                .setCode("*345*015%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Weekly SMS Bundle")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("1200 Msgs")
                .setValidity("7 Days")
                .setPrice("Rs. 15.5/-")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("15 Days Economy SMS Bundle")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("800 Msgs")
                .setValidity("15 Days")
                .setPrice("Rs. 17/-")
                .setCode("*345*112%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Month SMS Bundle")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("10000 Msgs")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 60/-")
                .setCode("*345*363%23")
                .setDescription("SMS 10,000 + 1 GB WhatsApp")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("SMS Bundle 30")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("250 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 30/-")
                .setCode("*345*761%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("SMS Bundle 60")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("600 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 60/-")
                .setCode("*345*762%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("SMS Bundle 200")
                .setSim("TELENOR")
                .setNumber("2")
                .setSms("6000 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 200/-")
                .setCode("*345*763%23")
                .build()
        );

        return packageList;
    }

    public List<Package> getInternetTelenorPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Daily Offpeak Offer")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("1.5 GB")
                .setValidity("12 Hours")
                .setPrice("Rs. 15/-")
                .setCode("*10%23")
                .setDescription("Internet 1500MB 6am - 6pm\nValidity: 12 Hours 6am - 6pm")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Raat Din Offer")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("1.5 GB")
                .setValidity("12 Hours")
                .setPrice("Rs. 18/-")
                .setCode("*150%23")
                .setDescription("12 Hours (12am - 12pm)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Daily Social Pack")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("50 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 1.5/-")
                .setCode("*311%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Daily YouTube Packages")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("500 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 8/-")
                .setCode("*60%23")
                .setDescription("The subscription is valid for 1 day (till midnight)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Daily Bundle")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("250 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 15/-")
                .setCode("*13%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G 3 Day Bundle")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("3 Days")
                .setPrice("Rs. 44/-")
                .setCode("*32%23")
                .setDescription("Internet: 1000MB (incl. 500MB 12am - 8am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Late Night Offer")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 50/-")
                .setCode("*19%23")
                .setDescription("Validity: 7 days (12am - 12pm")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Weekly 6 to 6 Offer")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("4 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 55/-")
                .setCode("*71%23")
                .setDescription("Validity: 7 Days (6am - 6pm)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Weekly YouTube Packages")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 80/-")
                .setCode("*220%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Weekly Super")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("4 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 110/-")
                .setCode("*288%23")
                .setDescription("Internet 4GB (incl 2GB from 1am - 11am)")
                .build()
        );



        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Weekly Ultra")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("8 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 185/-")
                .setCode("*336%23")
                .setDescription("8GB internet + 1 GB Goonj/Gamebox")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Weekly Ultra Plus")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 240/-")
                .setCode("*225%23")
                .setDescription("Volume: Internet: 10GB + 10GB (1am - 11am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Montly WhatsApp Offer")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("1.5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 5/-")
                .setCode("*247%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Social Pack")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("3.1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 45/-")
                .setCode("*911%23")
                .setDescription("Internet 100MB\nFacebook and WhatsApp 3000MB")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Social Pack Plus")
                .setSim("TELENOR")
                .setNumber("3")
                .setSms("10000 Msgs")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 75/-")
                .setCode("*660%23")
                .setDescription("5GB for facebook, WhatsApp and Twitter and 10,000 SMS for the entire month.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Lite")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("3 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 150/-")
                .setCode("*301%23")
                .setDescription("Volume: 2000 MB Internet + 1000 MB WhatsApp/Goonj/Gamebox")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Starter Bundle")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("8 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 300/-")
                .setCode("*302%23")
                .setDescription("Volume: 4,000MB + 4,000MB(1am - 7am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Ultra")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 450/-")
                .setCode("*335%23")
                .setDescription("Internet 10GB + 10GB (12am - 8am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Ultra Plus")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("50 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 700/-")
                .setCode("*303%23")
                .setDescription("Internet 50GB (incl. 25GB 1am - 11am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("5GB YouTube Add-On Bundle")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 186/-")
                .setCode("*345*78%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("10 GB YouTube Add-On Bundle")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 372/-")
                .setCode("*345*72%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom Internet 250")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 250/-")
                .setCode("*345%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom Internet 500")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500/-")
                .setCode("*345%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom Internet 800")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("8 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 800/-")
                .setCode("*345%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom Internet 1200")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("12 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1200/-")
                .setCode("*345%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Freedom Internet 2000")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("25 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2000/-")
                .setCode("*345%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Budget")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("9 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500/-")
                .setCode("*345*2001%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Starter")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("15 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 750/-")
                .setCode("*345*2002%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Lite")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1500/-")
                .setCode("*345*1001%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Smart")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("75 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2500/-")
                .setCode("*345*1002%23")
                .setDescription("Internet: 75GB + 75GB (Free Nights form 1am to 7am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Monthly Value")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 3800/-")
                .setCode("*345*1003%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Lite")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1500/-")
                .setCode("*345*1001%23")
                .setDescription("Internet: 30Gb + 30GB (Free nights from 1am to 7am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Smart")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("75 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2500/-")
                .setCode("*345*1002%23")
                .setDescription("Internet: 75GB + 75GB (Free Nights from 1am - 7am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Value")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 3800/-")
                .setCode("*345*1003%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G Monthly Unlimited")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("275 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 6000/-")
                .setCode("*345*1004%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("4G 3 Month Bundle")
                .setSim("TELENOR")
                .setNumber("3")
                .setInternet("108 GB")
                .setValidity("3 Month")
                .setPrice("Rs. 4000/-")
                .setCode("*345*1005%23")
                .setDescription("Volume: 108GB (36GB/30day)")
                .build()
        );

        return packageList;
    }

    public List<Package> getOtherTelenorPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Sim Lagao Offer")
                .setSim("TELENOR")
                .setNumber("5")
                .setOnNet("3000 Mins")
                .setInternet("10 GB")
                .setValidity("2 Month")
                .setPrice("Rs. Free/-")
                .setCode("2222")
                .setDescription("10GB (from 12am to 7pm)\nDial IVR 2222 to avail this offer\n50 free minutes will be posted on offer validity period. 5GB will be posted on offer subscription and 5GB will be posted again 30 Days.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("EMERGENCY LOAD")
                .setSim("TELENOR")
                .setNumber("5")
                .setPrice("Rs. 5.3/-")
                .setCode("*0%23")
                .setDescription("With Telenor Emergency Load, you can now get a load of Rs. 20.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("Balance Inquiry")
                .setSim("TELENOR")
                .setNumber("5")
                .setPrice("Rs. 0.24/-")
                .setCode("*444%23")
                .setDescription("*444%23 (balance) | *111%23 (SMS) | *222%23 (Minutes) | *999%23 (Internet)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("SMART SHARE")
                .setSim("TELENOR")
                .setNumber("5")
                .setPrice("Rs. 5.98/-")
                .setDescription("*1*1*923xxxxxxxxx*amount%23 and press 1 to confirm the balance transfer\nShare between 20 to 200 Rs.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("SACHA SMS")
                .setSim("TELENOR")
                .setNumber("5")
                .setPrice("Rs. FREE/-")
                .setCode("*1122%23")
                .setDescription("Now receive all details about your balance usage & spending on calls, SMS, Internet, Smart Tune and VAS along with recharge information.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("CALL RASEED")
                .setSim("TELENOR")
                .setNumber("5")
                .setPrice("Rs. FREE/-")
                .setCode("*460%23")
                .setDescription("Un-subscribe: *460%23 then press 1.\nGet free call duration and call cost details after every call in a flash message.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("SMART TUNES")
                .setSim("TELENOR")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.79/-")
                .setCode("*230*000%23")
                .setDescription("De-Activation Code: *230*001%23\nDial 230 (Rs. 1.20 call setup free incl. tax) while listening to any smart tune on a call before it is answered.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("MISSED CALL ALERTS")
                .setSim("TELENOR")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 4.77/-")
                .setCode("*345*622%23")
                .setDescription("De-Activation Code: *345*623%23\nDon't miss a call even when your phone is out of reach or switched off.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("CALL AND SMS BLOCKER")
                .setSim("TELENOR")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 8.96/-")
                .setCode("*420%23")
                .setDescription("Un-subscribe: SMS 'USUB' to 420\nto add a number to blacklist: SMS B<space><Number> to 420\nTo remove number from blacklist: SMS UB<space><number> to 420.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.telenor_logo)
                .setTitle("SMART NUMBER")
                .setSim("TELENOR")
                .setNumber("5")
                .setValidity("7 Days")
                .setPrice("Rs. 10/-")
                .setCode("*345*7700%23")
                .setDescription("De-Activation Code: *345*7701%23\nYou can now have 2 numbers on 1 sim so you do not need to carry two phones with you anymore.")
                .build()
        );


        return packageList;
    }


    /************************** UFONE **************************/
    public List<Package> getCallUFONEPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Power Hour")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("60 Mins")
                .setSms("60 Msgs")
                .setInternet("60 MB")
                .setValidity("1 Hour")
                .setPrice("Rs. 7.17/-")
                .setCode("*99%23")
                .setDescription("Additional call setup charges of Rs. 0.13 + tax will be charged on every call.\n Please dail *707%23 to check remaining minutes, SMS and data volume")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Best Call Offer")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setValidity("2 Hour")
                .setPrice("Rs. 6/-")
                .setCode("*343%23")
                .setDescription("Not available between 5pm - 9pm \n Additional call setup charges of Rs. 0.13 + tax will be charged on every call")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Beyhisaab Offer")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setValidity("1 Day")
                .setPrice("Rs. 14.5/-")
                .setCode("*5700%23")
                .setDescription("Fair Usage Policy of 300 minutes per subscription applies. \n Addition call setup charges of Rs. 0.13/- tax will be charged of every call.")
                .build()

        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Daily Pakistan Offer")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("100 Mins")
                .setInternet("10 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 18/-")
                .setCode("*888%23")
                .setDescription("Offer will be automatically renewed at 12:00 AM (PST)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Super Recharge Offer")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("300 Mins")
                .setOffNet("10 Mins")
                .setSms("700 Msgs")
                .setInternet("100 MB")
                .setValidity("2 Day")
                .setPrice("Rs. 53/-")
                .setCode("*300%23")
                .setDescription("You can also your nearest retailer, or subscribe through My Ufone App")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Weekly Pakistan Offer")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("700 Mins")
                .setInternet("100 MB")
                .setValidity("7 Day")
                .setPrice("Rs. 100/-")
                .setCode("*8888%23")
                .setDescription("Dail to *707%23 to check remaining minutes and data volume, charged at 20 paise+tax")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Asli Chapper Phaar Offer")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("100 Mins")
                .setSms("100 Msgs")
                .setInternet("1 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 120/-")
                .setCode("*5050%23")
                .setDescription("Please dial *707%23to check remaining minutes ,SMS and data volume")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Super Minutes")
                .setSim("UFONE")
                .setNumber("1")
                .setOffNet("100 Mins")
                .setValidity("7 Day")
                .setPrice("Rs. 135/-")
                .setCode("*210%23")
                .setDescription("You can also your nearest retailer, or subscribe through My Ufone App")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Mini Super Card")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("500 Mins")
                .setOffNet("75 Mins")
                .setSms("3500 Msgs")
                .setInternet("600 MB")
                .setValidity("15 Day")
                .setPrice("Rs. 330/-")
                .setCode("*230%23")
                .setDescription("You can also your nearest retailer, or subscribe through My Ufone App")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Monthly Pakistan Offer")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("4000 Mins")
                .setInternet("400 MB")
                .setValidity("1 Month")
                .setPrice("Rs. 418/-")
                .setCode("*8888%23")
                .setDescription("dail *707%23 to check remaining minutes and data volume, charged at 20 paise+tax")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Super Card Plus")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("180 Mins")
                .setSms("4200 Msgs")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 599/-")
                .setCode("*250%23")
                .setDescription("You can also your nearest retailer, or subscribe through My Ufone App\n 2000MB+5000Mb Facebook")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Super Card Gold")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("300 Mins")
                .setSms("Unlimited Msgs")
                .setInternet("5 Gb")
                .setValidity("1 Month")
                .setPrice("Rs. 999/-")
                .setCode("*900%23")
                .setDescription("You can also your nearest retailer, or subscribe through My Ufone App\n 5000MB+7000Mb Facebook")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("PrimeCall 1500(On Net")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("1500 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 200+t/-")
                .setCode("*2525%23")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Prime Call Unlimited(On Net)")
                .setSim("UFONE")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 500+t/-")
                .setCode("*2500%23")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("PrimeTalk 250(off Net")
                .setSim("UFONE")
                .setNumber("1")
                .setOffNet("250 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 250+t/-")
                .setCode("*4848%23")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("PrimeTalk 500(Off Net)")
                .setSim("UFONE")
                .setNumber("1")
                .setOffNet("500 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 500+t/-")
                .setCode("*5656%23")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Prime 400")
                .setSim("UFONE")
                .setNumber("1")
                .setOffNet("400 Mins")
                .setSms("2000 Msgs")
                .setInternet("2 Gb")
                .setValidity("1 Month")
                .setPrice("Rs. 400/-")
                .setCode("")
                .setDescription("You can also your nearest retailer, or subscribe through My Ufone App")
                .build()
        );

        return packageList;
    }

    public List<Package> getSMSUFONEPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Daily Package")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("1600 Msgs")
                .setValidity("1 Day")
                .setPrice("Rs. 4.77+t/-")
                .setCode("605")
                .setDescription("Subscribe: SMS Sub to 605")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Daily CHAT")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("10000 Msgs")
                .setInternet("500 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 6/-")
                .setCode("*3465%23")
                .setDescription("500MB are usable for WhatsApp only\n To check remaining resources dail *706%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("2-in-1 SMS Offer")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("5000+50 Msgs")
                .setValidity("3 Day")
                .setPrice("Rs. 9.99+t/-")
                .setCode("*615%23")
                .setDescription("5000 local SMS\n 50 International SMS")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Weekly SMS Bucket")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("1250 Msgs")
                .setValidity("7 Days")
                .setPrice("Rs. 11.95+t/-")
                .setCode("608")
                .setDescription("Subscribe: SMS Sub to 608\n Only Uth pack Customer can avail this offer")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Fortnightly Package")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("10500 Msgs")
                .setValidity("14 Day")
                .setPrice("Rs. 39.3+t/-")
                .setCode("603")
                .setDescription("Subscription: SMS Sub to 603 ")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Unlimited Package")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("21,000 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 95.6+t/-")
                .setCode("607")
                .setDescription("Subscription: SMS Sub to 607")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("45 Day SMS Bucket" )
                .setSim("UFONE")
                .setNumber("2")
                .setSms("31,000 Msgs")
                .setValidity("1.5 Month")
                .setPrice("Rs. 118+t/-")
                .setCode("614")
                .setDescription("Subscription: SMS Sub to 614")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Yearly SMS Package")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("Unlimited Msgs")
                .setValidity("12 Month")
                .setPrice("Rs. 795+t/-")
                .setCode("601")
                .setDescription("Subscription: SMS Sub to 601\n *fair Usage Policy of 110,000 SMS apply")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Unlimited SMS Package")
                .setSim("UFONE")
                .setNumber("2")
                .setSms("10000 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 150/-")
                .setCode("610")
                .setDescription("Subscription: SMS Sub to 610\n This offer is valid for postpaid number only")
                .build()
        );

        return packageList;
    }

    public List<Package> getInternetUFONEPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("STREAMING OFFER")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("500 MB")
                .setValidity("1 Hour")
                .setPrice("Rs. 10/-")
                .setCode("*78%23")
                .setDescription("500MB are only usable for Youtube and Dailymotion")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("SPECIAL DAILY")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("550 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 6/-")
                .setCode("*3461%23")
                .setDescription("Validity: 1AM-9PM \n 500MB for Facebook WhatsApp Twitter and Line 50MB for all usage\n To check remaining resources dial *706%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("SOCIAL DAILY")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("100 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 6/-")
                .setCode("*4422%23")
                .setDescription("100MB for Facebook Whatsapp Twitter To Check remaining resource dial *706%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Daily CHAT")
                .setSim("UFONE")
                .setNumber("3")
                .setSms("10000 Msgs")
                .setInternet("500 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 6/-")
                .setCode("*3465%23")
                .setDescription("500MB for Facebook Whatsapp Twitter To Check remaining resource dial *706%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Daily Night")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("540 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 12/-")
                .setCode("*2256%23")
                .setDescription("500MB for Facebook Whatsapp Twitter and Line 40MB for all usage To check remaining resource dial *706%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("MEGA Internet")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("2 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 15/-")
                .setCode("*550%23")
                .setDescription("Validity: 1Am_ 8AM\nTo Check remaining resource dial *706%23")
                .build()
        );



        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("DAILY HEAVY")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("575 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 18/-")
                .setCode("*2258%23")
                .setDescription("500MB for Facebook Whatsapp Twitter and Line 40MB for all usage To check remaining resource dial *706%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("3 DAILY BUCKET")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("600 MB")
                .setValidity("3 Day")
                .setPrice("Rs. 30/-")
                .setCode("*3350%23")
                .setDescription("500MB for Facebook Whatsapp Twitter and Line 40MB for all usage To check remaining resource dial *706%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("UFONE TIKTOK OFFER")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("1.5 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 50/-")
                .setCode("*2345%23")
                .setDescription("1500 MB for Tiktok")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("SUPER INTERNET")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("1.2 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 135/-")
                .setCode("*220%23")
                .setDescription("You can also visit your nearest retailer or subscriber through My Ufone App")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("WEEKLY INTERNET PLUS")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("6 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 180/-")
                .setCode("*260%23")
                .setDescription("To Check remaining resources, dial *706%23\n 3GB+3GB(from 1am to 8 am)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("SOCIAL Monthly")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 60/-")
                .setCode("*5858%23")
                .setDescription("100MB for Facebook Whatsapp Twitter and Line To check remaining resource dial *706%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Monthly Light")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("3 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 390/-")
                .setCode("*7807%23")
                .setDescription("2GB for Facebook Whatsapp Twitter and Line\n 1GB to all usage\n To check remaining resource dial *706%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("SUPER INTERNET PLUS")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("13 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 499/-")
                .setCode("*290%23")
                .setDescription("5GB Whatsapp\n 8GB for all usage\n To check remaining resource, dial *706%23")
                .build()
        );



        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Monthly Heavy")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 780/-")
                .setCode("*803%23")
                .setDescription("2GB for Facebook Whatsapp Twitter and Line\n 3GB for all usage\n To check remaining resource dial *706%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("MONTHLY MAX")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("12 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1560/-")
                .setCode("*5100%23")
                .setDescription("100MB for Facebook Whatsapp Twitter and Line\n 10GB for all usage\n To check remaining resource dial *706%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("PrimePly 1000")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 100/-")
                .setCode("*323%23")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("PrimePlay 3000")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("3 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 250/-")
                .setCode("*434%23")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );



        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("PrimePlay 6000")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("6 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500/-")
                .setCode("*656%23")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("PrimePlay 10000")
                .setSim("UFONE")
                .setNumber("3")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 750/-")
                .setCode("*989%23")
                .setDescription("This offer is valid for postpaid number only")
                .build()
        );

        return packageList;
    }

    public List<Package> getOtherUFONEPackages() {

        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("SIM Lagoa Offer")
                .setSim("UFONE")
                .setNumber("5")
                .setOnNet("3000 Mins")
                .setSms("3000 Msgs")
                .setInternet("3 GB")
                .setValidity("1 Month")
                .setCode("*5000%23")
                .setDescription("Ufone customers who have not use their SIM for over 60 days will now get the below mentioned incentive. Please note that customer will be awarded 50 U2U/ PTCl Min, 50 MBs 50 SMS daily for the next 60 days.However on spending Rs.5 per day or more, customers can get an additional 50 U_U/PTCL Min, 50 MBs, 50SMS")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Nayi SIM Offer")
                .setSim("UFONE")
                .setNumber("5")
                .setOnNet("500 Mins")
                .setSms("500 Msgs")
                .setInternet("1 GB")
                .setValidity("5 Days")
                .setCode("*1000%23")
                .setDescription("Buy a new Ufone SIM or switch to Ufone network,dial *1000%23vand get free Whatsapp for 3 Month. MoreEver, on every recharge of Rs. 50 or more with in the next 3 month get free 1GB Internet + 1GB for  Facebook, 500 U_U/ PTCL minutes and SMS for 5 days.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("UAdvance")
                .setSim("UFONE")
                .setNumber("5")
                .setPrice("Rs. 4.40+t/-")
                .setCode("*456%23")
                .setDescription("Rs.20/ advance is available to all Ufone Subscriber, Whose balance drops below Rs. 11.95/.\n UAdvance gives the facility of getting instant balance whenever you are running low. ")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("UShare")
                .setSim("UFONE")
                .setNumber("5")
                .setPrice("Rs. 2.99+t/-")
                .setDescription("Dial *828*Recipient Number*Amount%23 e.g.*828*03330000000*10%23\n Customer will be prompted with: Reply with: 1 to transfer Rs. 10 to 033300000000 ")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("UTunes")
                .setSim("UFONE")
                .setNumber("5")
                .setPrice("Rs. 1.5+t/-")
                .setCode("*6666%23")
                .setDescription("Rs 1.5+t / day (Prepaid & Postpaid)\n To Unsubscribe UTunes write 'UNSUB' and send it to 6666.\n Let your friend and family hear your favorite tunes every time they call U! ")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("My Tunes")
                .setSim("UFONE")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.2+t/-")
                .setCode("666")
                .setDescription("DAil 666 and choose from a list of tunes that you like to set as your MyTune.\n Subscription: Rs.1.2/day\n Call to666: Rs 2.99/minutes\n Never be bored listening to the mainstream dial tone when U make a call again!")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("UNotification")
                .setSim("UFONE")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 0.12+t/-")
                .setCode("3030")
                .setDescription("Subscription: SMS Sub to 3030\n To UnSubscription SMS UnSub to 3030\n You now have the facility of sending a missed call to any local number of any network in Pakistan, even when you have no balance! \n Tired of missing out on important calls? Let UNotification remember and remind you")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Ufone Collect Call")
                .setSim("UFONE")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 0.72+t/-")
                .setCode("*111%23")
                .setDescription("Now make call even if you don't want to pay for it or if you don't have balance.\nTo Unsubscribe the service, SMS Unsub to 902 To add a Ufone number to your collect Call FNF : Dial 901 and press 1 to build your FNF list.\n Just add your Friend and family to your list , so they can call you Whenever they want without Worrying about your balance")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Missed Call Notification")
                .setSim("UFONE")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 0.99+t/-")
                .setCode("180")
                .setDescription("Subscription: SMS Sub to 180 Allows U to be aware of the call you are missing When you cannot be reached or your phone is off.\n Rs.0.99/day-Prepaid\n Rs. 20.00. month - postpaid \n To UnSubscription: SMS  'UnSub' 180")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("Kaun Hai ")
                .setSim("UFONE")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 0.99+t/-")
                .setCode("*406%23")
                .setDescription("Preaid : Rs.0.99/day\n Postpaid: Rs.29.88/month\n With this services, user can now identify the person calling their phone before answering  the incoming call. By subscribing to 'Kaun Hai', users will receive a flash notification message on their screen with the caller's name, preceding the call.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("My Status")
                .setSim("UFONE")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.2+t/-")
                .setCode("*969%23")
                .setDescription("Share your thoughts, ideas, status or any personalized message via Ufone My Status. Once your set up your status, your contacts will start receiving it as a flash SMS any time they call you.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.ufone_logo)
                .setTitle("U Block")
                .setSim("UFONE")
                .setNumber("5")
                .setValidity("7 Day")
                .setPrice("Rs. 4.48+t/-")
                .setCode("*420%23")
                .setDescription("Now enjoy Control over who call and next you.\n Prepaid Charges:Rs.4,48/ week\n Postpaid Charges:Rs.15.00/month\n o add and remove users *420%23")
                .build()
        );

        return packageList;
    }

    /************************ Zong ********************/
    public List<Package> getCallZongPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Super Student Bundle")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setInternet("30 MB")
                .setValidity("2 Hours")
                .setPrice("Rs. 5 + tax/-")
                .setCode("*5555%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily Voice Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("20 Mins")
                .setValidity("1 Day")
                .setPrice("Rs. 5/-")
                .setCode("*45%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Full Gub Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("75 Mins")
                .setSms("100 Msgs")
                .setInternet("30 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 5 + tax/-")
                .setCode("*118*1%23")
                .setDescription("Un-sub: SMS 'Unsub' to 1181\nMB's are usable for WhatsApp")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Sixer Plus Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setSms("500 Msgs")
                .setValidity("1 Day")
                .setPrice("Rs. 8 + tax/-")
                .setCode("*666%23")
                .setDescription("Validity: 6am - 6pm\nTo Unsubscribe: SMS 'Unsub' to 666111")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Non Stop Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setValidity("1 Day")
                .setPrice("Rs. 10 + tax/-")
                .setCode("*777%23")
                .setDescription("Offer Not Applicable: 7pm - 10pm\nUn-subscribe: SMS 'UnSub' to 7141")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily Unlimited Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setInternet("1 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 12 + tax/-")
                .setCode("*522%23")
                .setDescription("Get 1MB mobile internet\nZong Unlimited Offers are auto-renewable\nTo De-Activate SMS 'unsub' to 522")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Flutter Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("120 Mins")
                .setSms("120 Msgs")
                .setInternet("50 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 12 + tax/-")
                .setCode("*369%23")
                .setDescription("To Un-subscribe: SMS 'unsub' to 369")
                .build()
        );



        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Hello 1 Din Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("150 Mins")
                .setSms("150 Msgs")
                .setInternet("50 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 13 + tax/-")
                .setCode("*2200*1%23")
                .setDescription("To Un-subscribe: SMS 'unsub' to 4952")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Shandaar Daily Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setSms("800 Msgs")
                .setInternet("50 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 14 + tax/-")
                .setCode("*999%23")
                .setDescription("Get your hands on unlimited zong calls, 50MB, 800 sms")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Hello 7 Day Bundle")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("100 Mins")
                .setSms("100 Msgs")
                .setInternet("1 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 45 + tax/-")
                .setCode("310")
                .setDescription("Just Dial 310 and select 4 from main menu and follow instructions")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Weekly Unlimited Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setSms("150 Msgs")
                .setValidity("7 Days")
                .setPrice("Rs. 63 + tax/-")
                .setCode("522")
                .setDescription("To subscribe: Send 'PK7' to 522\nTo Un-scribe: SMS 'unsub' to 522")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Shandaar Haftawaar Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("500 Mins")
                .setOffNet("40 Mins")
                .setSms("500 Msgs")
                .setInternet("500 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 120 + tax/-")
                .setCode("*7%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Hello Monthly Day Bundle")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("100 Mins")
                .setSms("100 Msgs")
                .setInternet("1 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 170 + tax/-")
                .setCode("4952")
                .setDescription("Dial 310 and select 4 and follow the instructions")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("All - in - 1 Weekly")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("1000 Mins")
                .setOffNet("40 Mins")
                .setSms("1000 Msgs")
                .setInternet("2.5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 200/-")
                .setCode("6464")
                .setDescription("To Un-subscribe: dial *6464%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Haftawaar Load Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("5000 Mins")
                .setOffNet("80 Mins")
                .setSms("5000 Msgs")
                .setInternet("12 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 270/-")
                .setCode("*70%23")
                .setDescription("6GB + 6GB(1am - 9am)\nTo un-subscribe: dial *6464%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Super Weekly Premium")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("100 Mins")
                .setInternet("30 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 330/-")
                .setCode("*225%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Voice 80 min Bundle")
                .setSim("ZONG")
                .setNumber("1")
                .setOffNet("80 Mins")
                .setSms("100 Msgs")
                .setValidity("15 Days")
                .setPrice("Rs. 120 + tax/-")
                .setCode("310")
                .setDescription("Dial 310 and select 5 and follow the instructions")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Combo Pack")
                .setSim("ZONG")
                .setNumber("1")
                .setOffNet("50 Mins")
                .setInternet("3 GB")
                .setValidity("15 Days")
                .setPrice("Rs. 200 + tax/-")
                .setCode("*15%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("WhatsApp Plus Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("200 Mins")
                .setOffNet("20 Mins")
                .setInternet("4 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 80/-")
                .setCode("*4000%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly Unlimited Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setSms("500 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 255 + tax/-")
                .setCode("522")
                .setDescription("To Subscribe: Send 'PK30' to 522\nTo Un-Subscribe: send SMS 'unsub' to 522.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Shandaar Mahana Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("1000 Mins")
                .setOffNet("100 Mins")
                .setSms("1000 Msgs")
                .setInternet("1 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 300 + tax/-")
                .setCode("*1000%23")
                .setDescription("To Un-Subscribe: 'unsub Mahana' to 7091")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Voice 425 min Bundle")
                .setSim("ZONG")
                .setNumber("1")
                .setOffNet("425 Mins")
                .setSms("500 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 600 + tax/-")
                .setCode("310")
                .setDescription("Dial 310 and select 5 and follow the instructions")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Zong Super Card")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("3000 Mins")
                .setOffNet("180 Mins")
                .setSms("3000 Msgs")
                .setInternet("6 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 650/-")
                .setCode("6464")
                .setDescription("De-Activation: *6464%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Supreme Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("5000 Mins")
                .setOffNet("300 Mins")
                .setSms("5000 Msgs")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1000/-")
                .setCode("*3030%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Voice 900 min Bundle")
                .setSim("ZONG")
                .setNumber("1")
                .setOffNet("900 Mins")
                .setSms("1000 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 1200 + tax/-")
                .setCode("310")
                .setDescription("Dial 310 and select 5 and follow the instructions")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly Super Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("5000 Mins")
                .setOffNet("300 Mins")
                .setSms("5000 Msgs")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1300/-")
                .setCode("*4567%23")
                .setDescription("20GB Internet + 6GB YouTube + 4GB WhatsApp")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Supreme Plus Offer")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("10000 Mins")
                .setOffNet("600 Mins")
                .setSms("10000 Msgs")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1732/-")
                .setCode("*1500%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Work From Home Bundle")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("2500 Mins")
                .setOffNet("300 Mins")
                .setSms("2000 Msgs")
                .setInternet("4 GB")
                .setPrice("Rs. 499 + tax/-")
                .setCode("*567%23")
                .setDescription("This is PostPaid bundle.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("ALL VOICE - 500")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("500 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 550 + tax/-")
                .setCode("*567%23")
                .setDescription("Activation Points: *567%23, 310 Smart IVR, My Zong App *310%23, E-Care, Online Shop.\nDe-Activation Points: *567%23, 310 Smart IVR, My Zong App, E-Care")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("ALL VOICE - 1000")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("1000 Mins")
                .setValidity("1 Month")
                .setPrice("Rs. 1000 + tax/-")
                .setCode("*567%23")
                .setDescription("Activation Points: *567%23, 310 Smart IVR, My Zong App *310%23, E-Care, Online Shop.\nDe-Activation Points: *567%23, 310 Smart IVR, My Zong App, E-Care")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Z500")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("1500 Mins")
                .setOffNet("300 Mins")
                .setSms("1000 Msgs")
                .setInternet("4 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500 + tax/-")
                .setDescription("This offer is only for Zong PostPaid Customers.\nFor Activation and further details please call 310 Helpline or visit nearest customer service center.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Z800")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("500 Mins")
                .setSms("2000 Msgs")
                .setInternet("10 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 800 + tax/-")
                .setDescription("This offer is only for Zong PostPaid Customers.\nFor Activation and further details please call 310 Helpline or visit nearest customer service center.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Z1200")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("800 Mins")
                .setSms("4000 Msgs")
                .setInternet("20 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 1200 + tax/-")
                .setDescription("This offer is only for Zong PostPaid Customers.\nFor Activation and further details please call 310 Helpline or visit nearest customer service center.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Z2500")
                .setSim("ZONG")
                .setNumber("1")
                .setOnNet("Unlimited Mins")
                .setOffNet("1200 Mins")
                .setSms("5000 Msgs")
                .setInternet("45 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 2500 + tax/-")
                .setDescription("This offer is only for Zong PostPaid Customers.\nFor Activation and further details please call 310 Helpline or visit nearest customer service center.")
                .build()
        );

        return packageList;
    }

    public List<Package> getSMSZongPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Zulu SMS Bundle")
                .setSim("ZONG")
                .setNumber("2")
                .setSms("500 Msgs")
                .setInternet("1 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 4 + tax/-")
                .setCode("*704%23")
                .setDescription("To Un-Subscribe: Send 'unsubscribe' or 'unsub' to 704\nData Usage Check: Dial *102%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily SMS + WhatsApp")
                .setSim("ZONG")
                .setNumber("2")
                .setSms("500 Msgs")
                .setInternet("30 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 5 + tax/-")
                .setCode("*700%23")
                .setDescription("Dial *700%23 and reply 1\nTo Un-Subscribe: Send 'unsubscribe' or 'unsub' to 700")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Weekly SMS Bundle")
                .setSim("ZONG")
                .setNumber("2")
                .setSms("1500 Msgs")
                .setInternet("200 MB")
                .setValidity("7 Days")
                .setPrice("Rs. 21 + tax/-")
                .setCode("*702%23")
                .setDescription("To Un-Subscribe: Send 'unsubscribe' or 'unsub' to 700")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("15 Days Unlimited SMS Bundle")
                .setSim("ZONG")
                .setNumber("2")
                .setOnNet("Unlimited Mins")
                .setValidity("15 Days")
                .setPrice("Rs. 149 + tax/-")
                .setCode("701")
                .setDescription("To Un-Subscribe: sms 'unsub' to 701")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly SMS + WhatsApp Bundle")
                .setSim("ZONG")
                .setNumber("2")
                .setSms("15000 Msgs")
                .setInternet("1.5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 50 + tax/-")
                .setCode("*705%23")
                .setDescription("500 SMS / day for 30 days\n30MB/day for each 30 days and are only usable for WhatsApp\nTo Un-Subscribe: Send 'unsub' to 700")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("PostPaid 300")
                .setSim("ZONG")
                .setNumber("2")
                .setSms("300 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 25 + tax/-")
                .setCode("*567%23")
                .setDescription("To Un-Subscribe: send sms 'unsub' to 700")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("PostPaid 700")
                .setSim("ZONG")
                .setNumber("2")
                .setSms("700 Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 50 + tax/-")
                .setCode("*567%23")
                .setDescription("To Un-Subscribe: send sms 'unsub' to 700")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("PostPaid Unlimited")
                .setSim("ZONG")
                .setNumber("2")
                .setSms("Unlimited Msgs")
                .setValidity("1 Month")
                .setPrice("Rs. 90 + tax/-")
                .setCode("*567%23")
                .setDescription("To Un-Subscribe: send 'unsub' to 700")
                .build()
        );


        return packageList;
    }

    public List<Package> getInternetZongPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily Facebook Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("500 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 5/-")
                .setCode("*32%23")
                .setDescription("Now enjoy Facebook on Pakistan No. 1 Data Network.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("CLASSIFIED PACK")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("50 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 5+t/-")
                .setCode("*6464%23")
                .setDescription("Dial *6464%23 and follow the on Screen instructions \n To Check Remaining MBs: Dial *102%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Social Pack")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("100 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 10+t/-")
                .setCode("*6464%23")
                .setDescription("Dial *6464%23 and follow the on Screen instructions \n To Check Remaining MBs: Dial *102%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Good Night Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("2.5 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 16+t/-")
                .setCode("464")
                .setDescription("Subscribe:\n Just SMS 'gno' to 6464 \n Only Applicable from 1am to 9am\n To Check Remaining MBs: Dial *102%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Day Time Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("1.2 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 16+t/-")
                .setCode("*47%23")
                .setDescription("Only Applicable from 4am to 7am \n Offer Duration: Limited Time Offer\n To Check remaining MBs: Dial *102%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily Basic")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("100 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 17+t/-")
                .setCode("*6464%23")
                .setDescription("Dial *6464%23 and follow the on Screen instructions \n To Check Remaining MBs: Dial *102%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily Data Max")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("1 GB")
                .setValidity("1 Day")
                .setPrice("Rs. 38+t/-")
                .setCode("*5%23")
                .setDescription("5000MB + 5000MB YouTube\n To Check remaining: Dial *102%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("WEEKLY TIKTOK OFFER")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("2 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 50/-")
                .setCode("*606%23")
                .setDescription("Now Enjoy fun video on TikTok on Pakistan No.\n 1 Data Network. Watch and create Crazy video on TikTok with 2 GB Data for the whole week @ only Rs. 35 tax")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Mega Data Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("100 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 100/-")
                .setCode("*808%23")
                .setDescription("100GB(1am to 9am) for 7 days.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Weekly YouTube Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("8 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 135/-")
                .setCode("*570%23")
                .setDescription("The Data resources can be utilized only for Youtube contain.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Super Weekly ")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("2.5 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 165/-")
                .setCode("*6464%23")
                .setDescription("Dial *6464%23 and follow the on Screen instructions \n To Check Remaining MBs: Dial *102%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Super Weekly Plus")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("7 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 240/-")
                .setCode("*20%23")
                .setDescription("To Check Remaining MBs: Dial *102%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Super Weekly Max")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("7 Day")
                .setPrice("Rs. 299/-")
                .setCode("*220%23")
                .setDescription("30 GB[15 GB 15 GB Data for YouTube]\n To Check Remaining MBs: Dial *102%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("WhatsApp Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("4 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 50/-")
                .setCode("*247%23")
                .setDescription("Now enjoy Monthly 4GB WhatsApp on Pakistan No.1 Data Network. \n To Check Remaining MBs: Dial *102%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("IMO OFFER")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("2 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 50/-")
                .setCode("*466%23")
                .setDescription("Zong subscribe can enjoy all features of IMO at Rs. 20! Simply Dial *466%23 once\n Data Usage Check: Dial *102%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly Mini 150")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("150 MB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 50+t/-")
                .setCode("*6464%23")
                .setDescription("Dial *6464%23 and follow the on Screen instructions \n To Check Remaining MBs: Dial *102%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("WhatsApp Plus Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("4GB")
                .setValidity("1 Month")
                .setPrice("Rs. 80/-")
                .setCode("*4000%23")
                .setDescription("Now enjoy non-stop voice and video calls for a month on whatsApp Plus Offer.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("MONTHLY FACEBOOK OFFER")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("6 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 100/-")
                .setCode("*250%23")
                .setDescription("Data Resources(To be consumed on Facebook only , include Facebook Messenger)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly Basic 500")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("500 MB")
                .setValidity("1 Month")
                .setPrice("Rs. 150+t/-")
                .setCode("*6464%23")
                .setDescription("Dial *6464%23 and follow the on Screen instructions \n To Check Remaining MBs: Dial *102%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Data Share Bundle 5GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500+t/-")
                .setCode("*6464*5%23")
                .setDescription("With Zong Data Share, you can share your data bundle with upto 10 friend and Family members. Only 1 person has to buy the data share bundle dial *6464*5%23 & follow the following steps.\n Step 1: create group step \n 2: Subscribe to bundle steps\n 3: Add member(s) & start sharing!")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly Premium 15 GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("15 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 600/-")
                .setCode("*6464%23")
                .setDescription("15GB(including 5GB 1 AM to 9 AM)\n Dial *6464%23 and follow the on Screen instructions \n To Check Remaining MBs: Dial *102%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Data Share Bundle 10GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("10 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 900+t/-")
                .setCode("*6464*5%23")
                .setDescription("With Zong Data Share, you can share your data bundle with upto 10 friend and Family members. Only 1 person has to buy the data share bundle dial *6464*5%23 & follow the following steps.\n Step 1: create group step \n 2: Subscribe to bundle steps\n 3: Add member(s) & start sharing!")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Data Share Bundle 40GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("40 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 1000/-")
                .setCode("*6464%23")
                .setDescription("40Gb Data(including 20GB 1 AM to 9 AM)\n Dial *6464%23 and follow the on Screen instruction\n To Check Remaining  MBs: Dial *102%23")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("YouTube 12 GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("12 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 500+t/-")
                .setCode("*567%23")
                .setDescription("Activation Point: *567%23, 310 Smart IVR, My Zong App, *310%23, E-Care, Online Shop.\n Deactivation Point: *567%23, 310 Smart IVR, My zong App, *310%23, E-Care")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("YouTube 25 GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("25 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 800/-")
                .setCode("*567%23")
                .setDescription("Activation Point: *567%23, 310 Smart IVR, My Zong App, *310%23, E-Care, Online Shop.\n Deactivation Point: *567%23, 310 Smart IVR, My zong App, *310%23, E-Care")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("ZDATA 3 GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("3 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 250/-")
                .setCode("*567%23")
                .setDescription("Activation Point: *567%23, 310 Smart IVR, My Zong App, *310%23, E-Care, Online Shop.\n Deactivation Point: *567%23, 310 Smart IVR, My zong App, *310%23, E-Care")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("ZDATA GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("10 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 600/-")
                .setCode("*567%23")
                .setDescription("Activation Point: *567%23, 310 Smart IVR, My Zong App, *310%23, E-Care, Online Shop.\n Deactivation Point: *567%23, 310 Smart IVR, My zong App, *310%23, E-Care")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("ZDATA 20 GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("20 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 1000/-")
                .setCode("*567%23")
                .setDescription("Activation Point: *567%23, 310 Smart IVR, My Zong App, *310%23, E-Care, Online Shop.\n Deactivation Point: *567%23, 310 Smart IVR, My zong App, *310%23, E-Care")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("MBB GOOD NIGHT OFFER")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 230/-")
                .setCode("*6767%23")
                .setDescription(" Dial *6767%23 and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("150GB MBB Exclusive Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 3500/-")
                .setCode("*6767%23")
                .setDescription("Dial *6767%23 and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 60 GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("60 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 2000/-")
                .setCode("*6767%23")
                .setDescription("Dial *6767%23 and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 150GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("150 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 2500/-")
                .setCode("*6767%23")
                .setDescription("150 GB (inc.75GB 4:00 AM to 4:00 PM )\n Dial *6767%23 and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 200GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("200 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 3250/-")
                .setCode("*6767%23")
                .setDescription("200 GB (inc.100GB 4:00 AM to 4:00 PM )\n Dial *6767%23 and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("3 Month Package")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("180 GB")
                .setValidity("3 Monthly")
                .setPrice("Rs. 5500/-")
                .setCode("*6767%23")
                .setDescription("60GB/Month\n Dial *6767%23 and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("6 Month Package")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("600 GB")
                .setValidity("6 Monthly")
                .setPrice("Rs. 12000/-")
                .setCode("*6767%23")
                .setDescription("100 GB (inc.25GB 4:00 AM to 4:00 PM )/Month\n Dial *6767%23 and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("12 Month Package")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("1200 GB")
                .setValidity("12 Monthly")
                .setPrice("Rs. 22000/-")
                .setCode("*6767%23")
                .setDescription("100 GB (inc.25GB 4:00 AM to 4:00 PM )/Month\n Dial *6767%23 and follow the instruction or ask your nearest retailer to activate this offer for you")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Good Night Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 230/-")
                .setCode("*6666%23")
                .setDescription("1GB/Day(1:00AM to 09:00 AM)")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Day Time Offer")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 570/-")
                .setCode("*6666%23")
                .setDescription("1GB/Day(9:00am to 04:00 pm)")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 8GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("8 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 750/-")
                .setCode("*6666%23")
                .setDescription("4GB+4GB(4:00AM to 04:00 AM)\n To Activate Dial *6666%23 from your internet SIM or ask your nearest retailer to activate this offer for you \n Internet SIM cannot be used in zong MBB Devises.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 24GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("24 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 1200/-")
                .setCode("*6666%23")
                .setDescription("12GB+12GB(4:00AM to 04:00 AM)\n To Activate Dial *6666%23 from your internet SIM or ask your nearest retailer to activate this offer for you \n Internet SIM cannot be used in zong MBB Devises.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 30GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("30 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 1800/-")
                .setCode("*6666%23")
                .setDescription("To Activate Dial *6666%23 from your internet SIM or ask your nearest retailer to activate this offer for you \n Internet SIM cannot be used in zong MBB Devises.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 60GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("60 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 2000/-")
                .setCode("*6666%23")
                .setDescription("To Activate Dial *6666%23 from your internet SIM or ask your nearest retailer to activate this offer for you \n Internet SIM cannot be used in zong MBB Devises.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly 75GB")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("75 GB")
                .setValidity("1 Monthly")
                .setPrice("Rs. 3250/-")
                .setCode("*6666%23")
                .setDescription("175GB(Inc.100 GB from 1AM to 9Am), Validity 30 Days\n To Activate Dial *6666%23 from your internet SIM or ask your nearest retailer to activate this offer for you \n Internet SIM cannot be used in zong MBB Devises.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("3 Month Bundles 3GB/Month")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("9 GB")
                .setValidity("3 Monthly")
                .setPrice("Rs. 1150/-")
                .setCode("*6666%23")
                .setDescription("3GB/Month\n To Activate Dial *6666%23 from your internet SIM or ask your nearest retailer to activate this offer for you \n Internet SIM cannot be used in zong MBB Devises.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("3 Month Bundles 12GB/Month")
                .setSim("ZONG")
                .setNumber("3")
                .setInternet("36 GB")
                .setValidity("3 Monthly")
                .setPrice("Rs. 2790/-")
                .setCode("*6666%23")
                .setDescription("12GB/Month\n To Activate Dial *6666%23 from your internet SIM or ask your nearest retailer to activate this offer for you \n Internet SIM cannot be used in zong MBB Devises.")
                .build()
        );

        return packageList;
    }

    public List<Package> getLocationBasedZongPackages() {

        List<Package> packageList = new ArrayList<>();


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Bharpoor Bahawalpur Offer")
                .setSim("ZONG")
                .setInternet("5000")
                .setSms("1000")
                .setNumber("4")
                .setOnNet("1000")
                .setOffNet("30")
                .setValidity("7 Days")
                .setPrice("Rs. 90+t/-")
                .setCode("*9911%23")
                .setDescription("Subscribe now by Dialing ")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("AJK Daily Offer")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("unlimited Mins")
                .setValidity("1 Day")
                .setPrice("Rs. 12+t/-")
                .setCode("522")
                .setDescription("Subscribe now by sending 'AJK' to 522")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily Zong Unlimited Offer")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setValidity("1 Day")
                .setPrice("Rs. 12+t/-")
                .setCode("*522%23")
                .setDescription("Available in selected cities only")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Karachi Daily Offer")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setInternet("125 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 13+t/-")
                .setCode("*544%23")
                .setDescription("Subscribe now by sending 'KHI7' to 522 or dial *544%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Daily Mehran(Sindh)")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("500 Msgs")
                .setInternet("125 MB")
                .setValidity("1 Day")
                .setPrice("Rs. 25/-")
                .setCode("*2345%23")
                .setDescription("Dial *2345%23 and chose the offer of your choice \n These offer are available in entire sindh province except Karachi.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("BOL LAHORE OFFER")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("300 Mins")
                .setOffNet("50 Mins")
                .setSms("500 Msgs")
                .setInternet("75 MB")
                .setValidity("1 Day")
                .setPrice("Rs.25/-")
                .setCode("*2233%23")
                .setDescription("This offer is available in Lahore only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("AJK WEEKLY OFFER")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setValidity("7 Days")
                .setPrice("Rs. 60+t/-")
                .setCode("522")
                .setDescription("Subscribe now Sending 'AJK7' to 522")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("WEEKLY ZONG UNLIMITED OFFER")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setValidity("7 Days")
                .setPrice("Rs. 63+t/-")
                .setCode("522")
                .setDescription("Available in selected cities only.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("KARACHI WEEKLY OFFER")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("1000 Msgs")
                .setValidity("7 Days")
                .setPrice("Rs. 76+t/-")
                .setCode("522")
                .setDescription("Subscribe now by sending 'KHI6' to 522" )
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("WEEKLY BACHAT OFFER\n (PUNJAB)")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("500 Mins")
                .setOffNet("30 Mins")
                .setInternet("2 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 100+t/-")
                .setCode("*4444%23")
                .setDescription("For Punjab only")
                .build()
        );



        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Apna Shehar Offer\n (PUNJAB)")
                .setSim("ZONG")
                .setNumber("4")
                .setOffNet("150 MB")
                .setInternet("6 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 230/-")
                .setCode("*2222%23")
                .setDescription("[Rs. 220 Load]\n Eligibility: Customer in Selected cities of Punjab")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Apna Shehar Offer\n (KARACHI)")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("500 Mins")
                .setOffNet("75 MB")
                .setSms("5000 Msgs")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 250/-")
                .setCode("*54%23")
                .setDescription("[Rs. 250 Load]\n Eligibility: Customer in Selected cities of Punjab")
                .build()
        );



        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Apna Sindh Offer")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("5000 Mins")
                .setOffNet("75 MB")
                .setSms("5000 Msgs")
                .setInternet("5 GB")
                .setValidity("7 Days")
                .setPrice("Rs. 250/-")
                .setCode("*54%23")
                .setDescription("[Rs. 250 Load]\n Customer residing in Sindh can also visit their nearest retailer and request for apna sindh Offer Subscription")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Karachi Monthly Offer")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("1000 Msgs")
                .setValidity("1 Monthly")
                .setPrice("Rs. 238+t/-")
                .setCode("522")
                .setDescription("Subscription now by sending 'KHI' to 522")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly Zong Unlimited Offer")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setValidity("1 Monthly")
                .setPrice("Rs. 255/-")
                .setCode("522")
                .setDescription("available in selected cities only")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("AJK Monthly Offer")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setValidity("1 Monthly")
                .setPrice("Rs. 268/-")
                .setCode("522")
                .setDescription("Subscribe now by sending 'AJK30' 522")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Monthly Mehran (Sindh)")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("Unlimited Mins")
                .setSms("1000 Msgs")
                .setInternet("1.5 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500/-")
                .setCode("*2345%23")
                .setDescription("1000 SMS /Day\n Dail *2345%23 and choose the offer of your choice \n These Offer are available in entire Sindh province except Karachi")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("SUPER STAR OFFER")
                .setSim("ZONG")
                .setNumber("4")
                .setOnNet("300 Mins")
                .setOffNet("400 Mins")
                .setInternet("8 GB")
                .setValidity("1 Month")
                .setPrice("Rs. 500/-")
                .setCode("*7070%23")
                .setDescription("This Offer is available in following cities Vehrari Burewwala Hasilpur Malsi RYK Sadiqabad Khanewal Abdulhakim KabirWala Faisalabad Sargodha.")
                .build()
        );

        return packageList;
    }

    public List<Package> getOtherZongPackages() {
        List<Package> packageList = new ArrayList<>();

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Sim Lagao Offer")
                .setSim("ZONG")
                .setNumber("5")
                .setOnNet("6000 Mins")
                .setSms("6000 Msgs")
                .setInternet("4 GB")
                .setValidity("2 Month")
                .setPrice("Rs. 2244/-")
                .setCode("*2244%23")
                .setDescription("Zong brings to you its SIM Lagao Offer. If you have not used your Zong SIM for 30 days then you can enjoy 6000 Zong Minutes, 6000 SMS and 4GB internet for 60 days.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("New Sim Offer")
                .setSim("ZONG")
                .setNumber("5")
                .setOnNet("1000 Mins")
                .setInternet("4 GB")
                .setValidity("7 Days")
                .setCode("*10%23")
                .setDescription("Subscriber has to dial *10%23 once after activating the Sim to avail this offer")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Zong Advance Loan")
                .setSim("ZONG")
                .setNumber("5")
                .setPrice("Rs. 3.5 + tax/-")
                .setCode("*911%23")
                .setDescription("Advance Loan Standard Amount Rs 25 sevice charges 3.5 ")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Zong Recharge Card Code")
                .setSim("ZONG")
                .setNumber("5")
                .setCode("*101*CardNumber%23")
                .setDescription("Dial *101*CardNumber%23")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("*310%23 USSD Portal")
                .setSim("ZONG")
                .setNumber("5")
                .setCode("*310%23")
                .setDescription("*310%23 is a self-service channel through which you can check usage details, Activate/De-Activate Packages etc")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Zong Dial Tune")
                .setSim("ZONG")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.78 + tax/-")
                .setCode("230")
                .setDescription("To Subscribe: Send 'sub' to 230\nDe-Activate: Send 'unsub' to 230\nZong dial tunes give you a chance to say it all even before you pick up you caller's phone. When your friend call you, they no longer have to hear that boring old 'dial-tone' instead, they can groove to the hottest new tracks on the music scene.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Zong My Status")
                .setSim("ZONG")
                .setNumber("5")
                .setValidity("1 Day")
                .setPrice("Rs. 1.19 + tax/-")
                .setCode("*652%23")
                .setDescription("To De-Activate: send 'unsub' to 6009\nZong My Status: now you can post a status to calling party upon receiving a call from them.")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Call and SMS Block")
                .setSim("ZONG")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 15 + tax/-")
                .setCode("420")
                .setDescription("To Subscribe: Send 'sub' to 420\nTo Un-Subscribe: send 'unsub' to 420\nTotal 50 numbers could be added to the blocklist.")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Doosra Number")
                .setSim("ZONG")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 30 + tax/-")
                .setCode("4600")
                .setDescription("Activate: sms 'sub' to 4600\nDe-Activate: sms 'unsub' to 4600\nGet 2 numbers in 1 sim")
                .build()
        );


        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Missed Call Alerts")
                .setSim("ZONG")
                .setNumber("5")
                .setValidity("1 Month")
                .setPrice("Rs. 20 + tax/-")
                .setCode("6227")
                .setDescription("Activate: send 'sub' to 6227\nDe-Activate: send 'unsub' to 6227")
                .build()
        );

        packageList.add(new Package.Builder()
                .setImageResId(R.drawable.zong_logo)
                .setTitle("Zong Yaari Call")
                .setSim("ZONG")
                .setNumber("5")
                .setPrice("Rs. 2 + tax/-")
                .setCode("*110%23")
                .setDescription("Brings you the opportunity to stay connected to your loved ones even in case of insufficient balance.\nDial 11 followed by the desired Zong number e.g. 1103120333888\nDial *110* followed by the desired zong number e.g. *110*03123333333%23")
                .build()
        );

        return packageList;
    }
}
