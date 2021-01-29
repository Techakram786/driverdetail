package com.techakram.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("orderdata")

    private List<Orderdatum> orderdata = null;
    @SerializedName("driverDetails")

    private List<DriverDetail> driverDetails = null;

    public List<Orderdatum> getOrderdata() {
        return orderdata;
    }

    public List<DriverDetail> getDriverDetails() {
        return driverDetails;
    }
}
