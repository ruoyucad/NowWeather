package com.example.pc.nowweather.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by PC on 11/17/2016.
 */

public class Helper {
    static String stream = null;

    public Helper() {
    }

    public String getHTTPData(String urlString){
        try {
            URL url = new URL(urlString);
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            if (httpURLConnection.getResponseCode() == 200)// it's ok, working
            {
                BufferedReader  r = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuffer sb=  new StringBuffer();
                String line;
                while ((line = r.readLine())!=null)
                {
                    sb.append(line);
                    stream =sb.toString();
                    httpURLConnection.disconnect();
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stream;
    }

}
