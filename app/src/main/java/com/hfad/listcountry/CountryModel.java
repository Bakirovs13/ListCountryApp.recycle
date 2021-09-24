package com.hfad.listcountry;

public class CountryModel {

    private final String name; // название
    private final String capital;  // столица
    private final int flagResource; // ресурс флага

    public CountryModel(String name, String capital, int flag){

        this.name=name;
        this.capital=capital;
        this.flagResource=flag;
    }

    public String getName() {
        return this.name;
    }



    public String getCapital() {
        return this.capital;
    }



    public int getFlagResource() {
        return this.flagResource;
    }

}
