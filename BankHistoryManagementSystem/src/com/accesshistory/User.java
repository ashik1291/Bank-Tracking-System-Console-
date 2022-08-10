package com.accesshistory;

import java.util.List;

public class User {
    private int userID = 0;
    private String userName = "";
    private String userPassword = "";
    private static boolean hasAccount = false;
    private List<String> userBankList;
    private String userPhone = "";
    private long balance = 0;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isHasAccount() {
        return hasAccount;
    }

    public static void setHasAccount(boolean hasAccount) {
        User.hasAccount = hasAccount;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public List<String> getUserBankList() {
        return userBankList;
    }
    public void setUserBankList(List<String> userBankList) {
        this.userBankList = userBankList;
    }

    public long getBalance() { return balance;}
    public void setBalance(long balance) { this.balance = balance;}


}
