package com.accesshistory;

import java.util.ArrayList;
import java.util.Arrays;

public class UserJohn extends User{
    public UserJohn(){
        this.setUserName("John Cena");
        this.setUserID(102);
        this.setUserPassword("bs@23");
        this.setUserPhone("01302000---");
        this.setHasAccount(false);
        this.setUserBankList(new ArrayList<>(Arrays.asList("")));
        this.setBalance(0);
    }

}
