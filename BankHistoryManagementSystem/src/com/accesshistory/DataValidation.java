package com.accesshistory;

public class DataValidation {
    public static void validateString(String checkString){
        System.out.println(checkString);
        if(checkString.isEmpty() || checkString == null)
            throw new IllegalArgumentException();
    }
    public static void validateInteger(int checkInt){
        if(checkInt < 0 && checkInt > Integer.MAX_VALUE){
            throw new IllegalArgumentException();
        }
    }
}
