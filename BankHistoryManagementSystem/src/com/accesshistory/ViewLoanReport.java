package com.accesshistory;

public class ViewLoanReport {
    private static final short MONTHS_IN_A_YEAR = 12;
    LoanCalulator calulator = new LoanCalulator();
    ConsoleScanner consoleScanner = ConsoleScanner.getConsoleInstance();

    public void showRemainingDebt(){
        System.out.println("--------------------------------------------");
        int principleAmount = consoleScanner.scanPrincipalAmount();
        double interestRate = consoleScanner.scanInterestRate();
        short year = consoleScanner.scanYear();
        int numberOfPaymentsMade = consoleScanner.scanNumberOfPayments();
        System.out.println("--------------------------------------------");
        System.out.print("Remaining Debt amount is: ");
        System.out.println(calulator.getRemainingDebt(principleAmount, interestRate, year, numberOfPaymentsMade));
        System.out.println("You have to pay the remaining debt within "+ (year * MONTHS_IN_A_YEAR - numberOfPaymentsMade)+ "months.");
        System.out.println("--------------------------------------------");
    }

    public void showEMI(){
        System.out.println("--------------------------------------------");
        int principleAmount = consoleScanner.scanPrincipalAmount();
        double interestRate = consoleScanner.scanInterestRate();
        short year = consoleScanner.scanYear();
        System.out.println("--------------------------------------------");
        System.out.print("You have to pay : ");
        System.out.print(calulator.getEMICount(principleAmount, interestRate, year));
        System.out.println(" as Equated Monthly Installment (EMI)");
        System.out.println("--------------------------------------------");
    }
}
