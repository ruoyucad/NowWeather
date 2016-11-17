package com.example.pc.nowweather.Common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by PC on 11/17/2016.
 */

public class Common {
    public  static  String API_KEY ="0fb83dcdce6f7d1fdd52d88503d7abe2";
    public  static  String API_LINK ="http://api.openweathermap.org/data/2.5/weather";
    public  static String apiRequest(String lat, String lng){
        StringBuffer sb = new StringBuffer(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        return sb.toString();
    }

    public  static  String unixTimeStampToDateTime (double unixTimeStamp) {
        DateFormat dataFormat= new SimpleDateFormat("HH:mm");
        Date date =new Date();
        date.setTime((long)unixTimeStamp*1000);
        return  dataFormat.format(date);
    }

    public  static  String getImage(String icon){
        return String.format("http://openweathernap.org/img/w/%s.png",icon);
    }
    public static String getDateNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
