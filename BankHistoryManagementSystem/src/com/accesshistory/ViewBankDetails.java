package com.accesshistory;

public class ViewBankDetails {
    public static void getBankDetails(Bank bank){
        System.out.println("--------------------------------------------------------");
        System.out.println("Registered Name: "+bank.getRegisteredName());
        System.out.println("Legal Status: "+bank.getLegalStatus());
        System.out.println("Established: "+bank.getEstablished());
        System.out.println("Type: "+bank.getType());
        System.out.println("Category: "+bank.getCategory());
        System.out.println("Services: ");
        for (String service: bank.getServices()){
            System.out.println("    # "+service);
        }
        System.out.println("Corporate Address: "+bank.getCorporateAddress());
        System.out.println("Email: "+bank.getEmail());
        System.out.println("Phone: "+bank.getPhone());
    }
}
