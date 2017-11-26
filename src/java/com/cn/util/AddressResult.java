/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.util;

/**
 *
 * @author LFeng
 */
public class AddressResult {
    private String location;
    private String formatted_address;
    private String business;
    private String addressComponent;
    private String pois;
    private String roads;
    private String poiRegions;
    private String sematic_description;
    private int cityCode;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getAddressComponent() {
        return addressComponent;
    }

    public void setAddressComponent(String addressComponent) {
        this.addressComponent = addressComponent;
    }

    public String getPois() {
        return pois;
    }

    public void setPois(String pois) {
        this.pois = pois;
    }

    public String getRoads() {
        return roads;
    }

    public void setRoads(String roads) {
        this.roads = roads;
    }

    public String getPoiRegions() {
        return poiRegions;
    }

    public void setPoiRegions(String poiRegions) {
        this.poiRegions = poiRegions;
    }

    public String getSematic_description() {
        return sematic_description;
    }

    public void setSematic_description(String sematic_description) {
        this.sematic_description = sematic_description;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
    
}
