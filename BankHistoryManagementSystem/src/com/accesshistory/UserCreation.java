package com.accesshistory;

public class UserCreation extends User{
    private static int ID = 103;

    public void setUserData(String userName, String userPassword, String userPhone) {
        //DataValidation.validateString(userName);
        //DataValidation.validateString(userPassword);
        //DataValidation.validateString(userPhone);
        this.setUserID(++ID);
        this.setUserName(userName);
        this.setUserPassword(userPassword);
        this.setUserPhone(userPhone);
    }
    public void setUserData(String userPhone, String userPassword) {
        DataValidation.validateString(userPassword);
        DataValidation.validateString(userPhone);
        this.setUserID(++ID);
        this.setUserName(userPhone);
        this.setUserPassword(userPassword);
    }


}
