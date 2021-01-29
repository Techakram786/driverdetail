package com.techakram.driver_detail;

public class Model
{
    private String id,master_driver_id,sub_driver_id,shipping_type,vehicle_type,type_of_vehicle
            ,vehicle_reg_no,user_id,fname,lname,email,mobile,login_status,latitude,longitude;
         //create constructor...
    public Model(String id, String master_driver_id, String sub_driver_id,
                 String shipping_type, String vehicle_type, String type_of_vehicle,
                 String vehicle_reg_no, String user_id, String fname, String lname,
                 String email, String mobile, String login_status, String latitude,
                 String longitude) {
        this.id = id;
        this.master_driver_id = master_driver_id;
        this.sub_driver_id = sub_driver_id;
        this.shipping_type = shipping_type;
        this.vehicle_type = vehicle_type;
        this.type_of_vehicle = type_of_vehicle;
        this.vehicle_reg_no = vehicle_reg_no;
        this.user_id = user_id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.mobile = mobile;
        this.login_status = login_status;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaster_driver_id() {
        return master_driver_id;
    }

    public void setMaster_driver_id(String master_driver_id) {
        this.master_driver_id = master_driver_id;
    }

    public String getSub_driver_id() {
        return sub_driver_id;
    }

    public void setSub_driver_id(String sub_driver_id) {
        this.sub_driver_id = sub_driver_id;
    }

    public String getShipping_type() {
        return shipping_type;
    }

    public void setShipping_type(String shipping_type) {
        this.shipping_type = shipping_type;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public String getType_of_vehicle() {
        return type_of_vehicle;
    }

    public void setType_of_vehicle(String type_of_vehicle) {
        this.type_of_vehicle = type_of_vehicle;
    }

    public String getVehicle_reg_no() {
        return vehicle_reg_no;
    }

    public void setVehicle_reg_no(String vehicle_reg_no) {
        this.vehicle_reg_no = vehicle_reg_no;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLogin_status() {
        return login_status;
    }

    public void setLogin_status(String login_status) {
        this.login_status = login_status;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    //create getter and setter...

}

