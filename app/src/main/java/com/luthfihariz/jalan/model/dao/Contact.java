
package com.luthfihariz.jalan.model.dao;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Contact implements Serializable {

    @SerializedName("phone_number")
    
    private String phoneNumber;
    @SerializedName("extended_address")
    
    private Object extendedAddress;
    @SerializedName("country_name")
    
    private String countryName;
    @SerializedName("street_address")
    
    private String streetAddress;
    @SerializedName("postal_code")
    
    private String postalCode;
    @SerializedName("address_locality")
    
    private String addressLocality;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Object getExtendedAddress() {
        return extendedAddress;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getAddressLocality() {
        return addressLocality;
    }
}
