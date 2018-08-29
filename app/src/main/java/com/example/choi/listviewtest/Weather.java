package com.example.choi.listviewtest;

public class Weather {

    private String city; // 도시
    private String temp; // 기온
    private String weather; // 날씨(맑음, 비 구름, 눈)

    public Weather(String city, String temp, String weather){
        this.city = city;
        this.temp = temp;
        this.weather = weather;
    }

    public String getCity(){
        return city;
    }

    public String getTemp(){
        return temp;
    }

    public String getWeather(){
        return weather;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setTemp(String temp){
        this.temp = temp;
    }

    public void setWeather(String weather){
        this.weather = weather;
    }


    @Override
    public String toString() {

        final StringBuffer sb = new StringBuffer("Weater{");
        sb.append("city = '").append(city).append('\'');
        sb.append("temp = '").append(temp).append('\'');
        sb.append("weather = '").append(weather).append('\'');

        sb.append('}');
        return sb.toString();
    }
}
