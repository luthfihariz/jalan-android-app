
package com.luthfihariz.jalan.model.dao;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Coordinate implements Serializable {

    @SerializedName("latitude")
    private String latitude;
    @SerializedName("longitude")
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}
