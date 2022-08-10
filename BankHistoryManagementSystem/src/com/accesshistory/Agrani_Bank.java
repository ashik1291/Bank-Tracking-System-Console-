package com.accesshistory;

import java.util.ArrayList;
import java.util.Arrays;

public class Agrani_Bank extends Bank implements BankInterest{
    private static Agrani_Bank INSTANCE ;
    private Agrani_Bank(){
        super.setRegisteredName("Agrani Bank Limited");
        super.setLegalStatus("Public Limited Company");
        super.setEstablished(1972);
        super.setType("Public Bank");
        super.setCategory("Commercial Bank");
        super.setCorporateAddress("9/D Dilkusha Commercial Area, Dhaka 1000, Bangladesh.");
        super.setEmail("agrani@agranibank.org");
        super.setPhone("+8802 9566153-54");
        super.setServices( new ArrayList<>(Arrays.asList("Swift", "ATM Services",
                "Internet Banking", "Locker", "Web based online cheque", "Agency Services",
                "Inland Remittance")));
    }
    public static Agrani_Bank getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new Agrani_Bank();
        }
        return INSTANCE;
    }

    private double interestRate = 4.9;
    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
