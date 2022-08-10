package com.accesshistory;

public class UserLandingPage {
    private User user;

    public void showLandingPage(User user){
        this.user = user;

        while(true){
            System.out.println("------------------------------------------------");
            System.out.println("Hey! "+ user.getUserName());
            System.out.println("Choose:");
            System.out.println("1. View available bank list");
            System.out.println("2. View your account holding bank list");
            System.out.println("3. View your profile details");
            System.out.println("4. EMI Calculator");
            System.out.println("5. Remaining Debt");
            System.out.println("6. Go back to Login Page");
            int select = takeInput();
            System.out.println("----------------------------------------------------------");
            boolean isGoBack = controlInput(select);
            if(isGoBack){
                break;
            }else{
                continue;
            }
        }
    }
    public int takeInput(){
        System.out.println("Enter: ");
        int input = ConsoleScanner.getConsoleInstance().scanner.nextInt();
        DataValidation.validateInteger(input);
        return input;
    }

    public boolean controlInput(int select){
        if(select == 1){
            int count = 1;
            System.out.println("Available Bank List: ");
            for (String name: new Bank().getAvailableBanks()){
                System.out.println(count++ + ". " + name);
            }
            System.out.println("Choose a bank to get bank details or 0 for get back");
            int input = takeInput();
            if(input == 0) return false;
            else
                getBankDetails(input);
        }
        else if(select == 2){
            System.out.println("You have accounts in the following banks: ");
            if(user.getUserBankList() == null){
                System.out.println("You have no accounts");
            }else{
                System.out.println(user.getUserBankList());
            }
        }
        else if(select == 3){
                new ViewUserDetails().getUserDetails(user);
        }
        else if(select == 4){
                new ViewLoanReport().showEMI();
        }
        else if(select == 5){
                new ViewLoanReport().showRemainingDebt();
        }
        else if(select == 6){
            return true;

        }else
            System.out.println("Please Enter a Valid number!");
        return false;
    }
    public void getBankDetails(int input){
        //System.out.println("--------------------------------------------");
        if(input == 1){
            ViewBankDetails.getBankDetails(AB_Bank.getINSTANCE());
            System.out.println("Interest Rate: " + AB_Bank.getINSTANCE().getInterestRate());
        }else if(input == 2){
            ViewBankDetails.getBankDetails(Agrani_Bank.getINSTANCE());
            System.out.println("Interest Rate: " + Agrani_Bank.getINSTANCE().getInterestRate());
        }else if(input == 3){
            ViewBankDetails.getBankDetails(City_Bank.getINSTANCE());
            System.out.println("Interest Rate: " + City_Bank.getINSTANCE().getInterestRate());
        }else{
            System.out.println("Bank details not found");
        }
       // System.out.println("--------------------------------------------");
    }
}
