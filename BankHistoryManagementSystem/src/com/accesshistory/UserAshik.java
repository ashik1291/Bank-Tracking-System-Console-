package com.accesshistory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserAshik extends User{
    public UserAshik(){
        this.setUserName("Ashikur Rahman Bhuiyan");
        this.setUserID(101);
        this.setUserPassword("bs@23");
        this.setUserPhone("01621169---");
        this.setHasAccount(true);
        this.setUserBankList(new ArrayList<>(Arrays.asList("AB Bank", "Agrani Bank")));
        this.setBalance(50000);
    }

}
