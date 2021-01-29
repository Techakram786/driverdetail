package com.techakram.models;

import com.google.gson.annotations.SerializedName;

public class Orderdatum {
    @SerializedName("order_id")

    private String orderId;
    @SerializedName("driver_id")

    private String driverId;
    @SerializedName("delivery_cost")

    private String deliveryCost;
    @SerializedName("driver_delivery_cost")

    private String driverDeliveryCost;
    @SerializedName("delivery_type")

    private String deliveryType;
    @SerializedName("delivery_status")

    private String deliveryStatus;
    @SerializedName("delivery_distance")

    private String deliveryDistance;
    @SerializedName("delivery_date")

    private String deliveryDate;
    @SerializedName("user_id")

    private String userId;
    @SerializedName("fname")

    private String fname;
    @SerializedName("lname")

    private String lname;

    public String getOrderId() {
        return orderId;
    }

    public String getDriverId() {
        return driverId;
    }

    public String getDeliveryCost() {
        return deliveryCost;
    }

    public String getDriverDeliveryCost() {
        return driverDeliveryCost;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public String getDeliveryDistance() {
        return deliveryDistance;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public String getUserId() {
        return userId;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
}
