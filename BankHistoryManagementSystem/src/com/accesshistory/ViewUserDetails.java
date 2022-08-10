package com.accesshistory;

public class ViewUserDetails {
    public void getUserDetails(User user){
        //System.out.println("----------------------------");
        System.out.println("Your Profile");
        System.out.println("User ID: " + user.getUserID());
        System.out.println("Name: " + user.getUserName());
        System.out.println("Phone: " + user.getUserPhone());
        System.out.println("You have accounts on following banks: ");
        System.out.println(user.getUserBankList());
        if(user.isHasAccount()){
            System.out.println("Tracker Balance: "+user.getBalance());
        }
        //System.out.println("----------------------------");

    }
}
