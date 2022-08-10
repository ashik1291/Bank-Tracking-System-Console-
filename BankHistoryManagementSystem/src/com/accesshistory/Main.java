package com.accesshistory;

public class Main {
    public static void main(String[] args) {
        System.out.println("            Welcome to Bank Account Tracker System          ");
        while(true){
           System.out.println("----------------------------------------------------------");
           System.out.println("Please Select to explore the system:");
           System.out.println("Enter 1 to : SignIn");
           System.out.println("Enter 2 to : SignUp");
           System.out.println("Enter 'quit' to exit.");
           System.out.print("Enter: " );
           String select = ConsoleScanner.getConsoleInstance().scanner.next();
           ConsoleScanner.getConsoleInstance().scanner.nextLine();
           if(select.equalsIgnoreCase("quit")){
                System.out.println("Thank you for using the system");
               System.out.println("----------------------------------------------------------");
                break;
           }else{
               System.out.println("----------------------------------------------------------");
               new UserValidation().selectionValidation(select);
           }
       }
    }
}
