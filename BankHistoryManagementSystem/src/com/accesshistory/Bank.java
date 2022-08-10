package com.accesshistory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {

    private String registeredName;
    private String legalStatus;
    private int established;
    private String type;
    private String category;
    private String corporateAddress;
    private String email;
    private String phone;
    private List<String> services;

    public List<String> getAvailableBanks() {
        return availableBanks;
    }

    private List<String> availableBanks = new ArrayList<>(Arrays.asList("AB Bank", "Agrani Bank", "City Bank"));

    public String getRegisteredName() {
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }

    public String getLegalStatus() {
        return legalStatus;
    }

    public void setLegalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
    }

    public int getEstablished() {
        return established;
    }

    public void setEstablished(int established) {
        this.established = established;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCorporateAddress() {
        return corporateAddress;
    }

    public void setCorporateAddress(String corporateAddress) {
        this.corporateAddress = corporateAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }


}
