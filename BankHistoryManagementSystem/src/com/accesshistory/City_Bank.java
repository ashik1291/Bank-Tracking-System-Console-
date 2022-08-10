package com.accesshistory;

import java.util.ArrayList;
import java.util.Arrays;

public class City_Bank extends Bank implements BankInterest{
    private static City_Bank INSTANCE ;
    private City_Bank(){
        super.setRegisteredName("The City Bank Limited");
        super.setLegalStatus("Public Limited Company");
        super.setEstablished(1983);
        super.setType("Private Bank");
        super.setCategory("Commercial Bank");
        super.setCorporateAddress("136 Gulshan Avenue, Circle 2, Gulshan, Dhaka 1212, Bangladesh.");
        super.setEmail("info@thecitybank.com");
        super.setPhone("16234 (any local mobile), +88028813483");
        super.setServices( new ArrayList<>(Arrays.asList("Money Transfer", "Safe Deposit Locker",
                "Internet Banking", "Retail Banking", "Corporate Banking", "SME Banking")));
    }
    public static City_Bank getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new City_Bank();
        }
        return INSTANCE;
    }

    private double interestRate = 7.2;
    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
