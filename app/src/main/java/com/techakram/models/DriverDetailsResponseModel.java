package com.techakram.models;

import com.google.gson.annotations.SerializedName;

public class DriverDetailsResponseModel {
    @SerializedName("result")
    private String result;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private Data data;

    public String getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public Data getData() {
        return data;
    }
}
