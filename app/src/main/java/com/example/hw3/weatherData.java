package com.example.hw3;

import org.json.JSONException;
import org.json.JSONObject;

public class weatherData {
    private String mTemperature, micon, mcity, mWeatherType;
    private int mConditions;

    public static weatherData fromJson(JSONObject jsonObject){
        try{
            weatherData weatherD = new weatherData();
            weatherD.mcity=jsonObject.getString("name");
            weatherD.mConditions=jsonObject.getJSONArray("weather").getJSONObject(0).getInt("id");
            weatherD.mWeatherType=jsonObject.getJSONArray("weather").getJSONObject(0).getString("main");
            weatherD.micon=updateWeatherIcon(weatherD.mConditions);
            //-273.15 to convert to kelvin
            double tempResults = jsonObject.getJSONObject("main").getDouble("temp")-273.15;
            int roundedValue=(int)Math.rint(tempResults);
            weatherD.mTemperature=Integer.toString(roundedValue);
            return weatherD;
        }
        catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String updateWeatherIcon(int condition){
        if(condition > 0 && condition <= 300){
            //thunderstorm
            return "thunderstorm";
        }
        else if(condition > 300 && condition <= 500){
            return "lightrain";
        }
        else if(condition > 500 && condition <= 600){
            return "shower";
        }
        else if(condition > 600 && condition <= 700){
            return "snow";
        }
        else if(condition > 700 && condition <= 771){
            return "fog";
        }
        else if(condition > 771 && condition < 800){
            return "overcast";
        }
        else if(condition == 800){
            return "sunny";
        }
        else if(condition > 800 && condition <= 804){
            return "cloudy";
        }
        else if(condition >= 900 && condition <= 902){
            return "thunderstorm";
        }
        else if(condition == 903){
            return "snow";
        }
        else if(condition == 904){
            return "sunny";
        }
        else{
            return "cant find";
        }
    }

    public String getmTemperature() {
        return mTemperature + "°C";
    }

    public String getMicon() {
        return micon;
    }

    public String getMcity() {
        return mcity;
    }

    public String getmWeatherType() {
        return mWeatherType;
    }
}
