package com.example.twoeurocoins;


public class Coin {
    String name, country, coinImgURL, countryImgURL, mintage;;
    int year;

    public Coin(String name, String country, String coinImgURL, String countryImgURL, int year, String mintage) {
        this.name = name;
        this.country = country;
        this.coinImgURL = coinImgURL;
        this.countryImgURL = countryImgURL;
        this.year = year;
        this.mintage = mintage;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCoinImgURL() {
        return coinImgURL;
    }

    public String getCountryImgURL() {
        return countryImgURL+".png";
    }

    public int getYear() {
        return year;
    }

    public String getMintage() {
        return mintage;
    }
}


