package com.example.pc.nowweather.Model;

/**
 * Created by PC on 11/17/2016.
 */

public class Coord {
    private double lat;
    private double lng;

    public Coord(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
