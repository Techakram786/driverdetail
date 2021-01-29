package com.techakram.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DriverDetail {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("master_driver_id")
    @Expose
    private String masterDriverId;
    @SerializedName("sub_driver_id")
    @Expose
    private String subDriverId;
    @SerializedName("shipping_type")
    @Expose
    private String shippingType;
    @SerializedName("vehicle_type")
    @Expose
    private String vehicleType;
    @SerializedName("type_of_vehicle")
    @Expose
    private String typeOfVehicle;
    @SerializedName("vehicle_reg_no")
    @Expose
    private String vehicleRegNo;
    @SerializedName("dot_number")
    @Expose
    private String dotNumber;
    @SerializedName("insurance_exp_date")
    @Expose
    private String insuranceExpDate;
    @SerializedName("vehicle_rc")
    @Expose
    private String vehicleRc;
    @SerializedName("vehicle_image")
    @Expose
    private String vehicleImage;
    @SerializedName("vehicle_license")
    @Expose
    private String vehicleLicense;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("is_assign")
    @Expose
    private String isAssign;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("device_type")
    @Expose
    private String deviceType;
    @SerializedName("device_token")
    @Expose
    private String deviceToken;
    @SerializedName("fname")
    @Expose
    private String fname;
    @SerializedName("lname")
    @Expose
    private String lname;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("mobile")
    @Expose
    private String mobile;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("is_online")
    @Expose
    private String isOnline;
    @SerializedName("is_miscellanea")
    @Expose
    private String isMiscellanea;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("profile_image")
    @Expose
    private String profileImage;
    @SerializedName("login_status")
    @Expose
    private String loginStatus;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("is_assignmeasdriver")
    @Expose
    private String isAssignmeasdriver;
    @SerializedName("is_master_driver")
    @Expose
    private String isMasterDriver;
    @SerializedName("licence_exp_date")
    @Expose
    private Object licenceExpDate;

    public String getId() {
        return id;
    }

    public String getMasterDriverId() {
        return masterDriverId;
    }

    public String getSubDriverId() {
        return subDriverId;
    }

    public String getShippingType() {
        return shippingType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    public String getDotNumber() {
        return dotNumber;
    }

    public String getInsuranceExpDate() {
        return insuranceExpDate;
    }

    public String getVehicleRc() {
        return vehicleRc;
    }

    public String getVehicleImage() {
        return vehicleImage;
    }

    public String getVehicleLicense() {
        return vehicleLicense;
    }

    public String getStatus() {
        return status;
    }

    public String getIsAssign() {
        return isAssign;
    }

    public String getUserId() {
        return userId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getIsOnline() {
        return isOnline;
    }

    public String getIsMiscellanea() {
        return isMiscellanea;
    }

    public String getLicense() {
        return license;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getIsAssignmeasdriver() {
        return isAssignmeasdriver;
    }

    public String getIsMasterDriver() {
        return isMasterDriver;
    }

    public Object getLicenceExpDate() {
        return licenceExpDate;
    }
}
