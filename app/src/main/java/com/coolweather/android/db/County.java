package com.coolweather.android.db;

public class County extends DataSupport {
    private  int id;
    private String countyName;
    private String weatherld;
    private int cityld;
    private int getld(){
        return id;
    }
    public void setld(int id){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public String getWeatherld(){
        return weatherld;
    }
    public void setWeatherld(String weatherld){
        this.weatherld=weatherld;
    }
    public int getCityld(){
        return cityld;
    }
    public void setCityld(int cityld){
        this.cityld=cityld;
    }
}
