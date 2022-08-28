package com.basics2;

import java.security.PublicKey;

public class Class23 {
    private String bank = "ICICI";
    int accountNumber = 234567889;
    String branch = "MG Road";
    public String IFSC = "ICIC0001875";

    void branchDetails(){
        System.out.println("The branch of the customer is: " + branch);
    }

    void showAccountNumber(){
        System.out.println("The account number of the customer is: " + accountNumber);
    }

    private void bankName(){
        System.out.println("The name of the user's bank is: " + bank);
    }

    public void accessIFSC(){
        System.out.println("The IFSC code of the bank is: " + IFSC);
    }

    public static void main(String[] args) {
        Class23 obj = new Class23();
        obj.bankName();
    }

}
