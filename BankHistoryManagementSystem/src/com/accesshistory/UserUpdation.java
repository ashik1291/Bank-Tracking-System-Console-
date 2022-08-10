package com.accesshistory;

public class UserUpdation extends User{

    public void updateName(String name){
        this.setUserName(name);
    }
    public void updatePassword(String password){
        this.setUserPassword(password);
    }
    public void updatePhone(String phone){
        this.setUserPhone(phone);
    }

}
