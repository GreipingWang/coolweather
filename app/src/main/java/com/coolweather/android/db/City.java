package com.coolweather.android.db;

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceld;
    public  int getld(){
        return id;
    }
    public void setld(int id){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProvinceld(){
        return provinceld;
    }
    public void setProvinceld(int provinceld){
        this.provinceld=provinceld;
    }
}
