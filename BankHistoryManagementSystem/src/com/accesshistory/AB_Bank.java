package com.accesshistory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AB_Bank extends Bank implements BankInterest{
    private static AB_Bank INSTANCE ;
    private AB_Bank(){
        super.setRegisteredName("AB Bank Limited");
        super.setLegalStatus("Public Limited Company");
        super.setEstablished(1982);
        super.setType("Private Bank");
        super.setCategory("Commercial Bank");
        super.setCorporateAddress("BCIC Bhaban, 30-31 Dilkusha Commercial Area, Dhaka 1000, Bangladesh.");
        super.setEmail("info@abbl.com");
        super.setPhone("16207 (any local mobile), +8809678916207");
        super.setServices( new ArrayList<>(Arrays.asList("Money Transfer", "Safe Deposit Locker",
                "Internet Banking", "Retail Banking", "Corporate Banking", "SME Banking")));
    }
    public static AB_Bank getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new AB_Bank();
        }
        return INSTANCE;
    }

    private double interestRate = 5.5;
    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
