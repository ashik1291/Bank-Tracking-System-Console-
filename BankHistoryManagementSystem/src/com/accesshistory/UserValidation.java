package com.accesshistory;

public class UserValidation {
    private int userID_1 = 101;
    private int UserID_2 = 102;
    private String phone_1 = "01621169515";
    private String phone_2 = "01302000725";
    private String password = "bs@23";

    public void check_phone_Pass(String phone, String password){

    }
    public void selectionValidation(String select){
        if(select.equalsIgnoreCase("1"))
            signIn();
        else if(select.equalsIgnoreCase("2"))
            signUp();
        else{
            System.out.println("PLEASE TRY AGAIN");
            return;
        }

    }
    public void signIn(){
        System.out.println("----------------------------------------------------------");
        System.out.println("\t\t\tSignIn\t\t\t");
        String phone = ConsoleScanner.getConsoleInstance().scanPhone();
        String password = ConsoleScanner.getConsoleInstance().scanPassword();

        if(phone.equalsIgnoreCase(phone_1) && password.equalsIgnoreCase(this.password)){
                new UserLandingPage().showLandingPage(new UserAshik());
        }
        else if(phone.equalsIgnoreCase(phone_2) && password.equalsIgnoreCase(this.password)){
            new UserLandingPage().showLandingPage(new UserJohn());
        }else {
            System.out.println("Phone or Password is wrong! Please try again");
            return;
        }
    }
    public static void signUp(){

        System.out.println("Please fill up the following query:");
        String userName = ConsoleScanner.getConsoleInstance().scanName().trim();
        String userPhone = ConsoleScanner.getConsoleInstance().scanPhone().trim();
        String userPassword = ConsoleScanner.getConsoleInstance().scanPassword().trim();

        var user = new UserCreation();
        user.setUserData(userName, userPassword, userPhone);

        System.out.println("Your account has been created successfully. Taking you to User Page");
        new UserLandingPage().showLandingPage(user);

    }
}
