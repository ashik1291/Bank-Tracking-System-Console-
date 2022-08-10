package com.accesshistory;

import java.util.Scanner;

public class ConsoleScanner {
    Scanner scanner = new Scanner(System.in);
    private static ConsoleScanner INSTANCE;

    private ConsoleScanner(){
    }
    public static ConsoleScanner getConsoleInstance(){
        if(INSTANCE == null){
            INSTANCE = new ConsoleScanner();
        }
        return INSTANCE;
    }

    public String scanBankName(){
        System.out.println("Bank Name: ");
        return scanner.nextLine().trim().toUpperCase();
    }

    public int scanPrincipalAmount(){
        System.out.print("Principal Amount: ");
        return scanner.nextInt();
    }

    public double scanInterestRate(){
        System.out.print("Interest Rate: ");
        return scanner.nextDouble();
    }

    public short scanYear(){
        System.out.print("Year: ");
        return scanner.nextShort();
    }

    public int scanNumberOfPayments() {
        System.out.print("Number of Payments you have made already: ");
        return scanner.nextInt();
    }

    public String scanPhone(){
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        return phone;
    }
    public String scanPassword(){
        System.out.print("Password: ");
        String pass = scanner.nextLine();
        return pass;
    }
    public String scanName(){
        System.out.print("Name: ");
        String name = scanner.nextLine();
        return name;
    }

}
