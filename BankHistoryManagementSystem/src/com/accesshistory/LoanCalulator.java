package com.accesshistory;

import java.text.NumberFormat;

public class LoanCalulator {
    private double interestRate;
    private double EMI;
    private int totalMonths;
    private final int MONTHS_IN_A_YEAR = 12;

    public String getEMICount(int principleAmount, double interestRate, int years){
        totalMonths = years * MONTHS_IN_A_YEAR;
        double monthlyInterest = interestRate/100/MONTHS_IN_A_YEAR;
        EMI = ((monthlyInterest * Math.pow((1 + monthlyInterest), totalMonths))
                /((Math.pow((1 + monthlyInterest), totalMonths)) - 1)) * principleAmount;

        return NumberFormat.getCurrencyInstance().format(EMI);
    }

    public String getRemainingDebt(int principleAmount, double interestRate, int years, int numberOfPaymentsMade){
        totalMonths = years * MONTHS_IN_A_YEAR;
        double monthlyInterest = interestRate/100/MONTHS_IN_A_YEAR;
        double remainingDebt = principleAmount
                * (Math.pow(1 + monthlyInterest, totalMonths) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, totalMonths) - 1);
        return NumberFormat.getCurrencyInstance().format(remainingDebt);

    }
}
