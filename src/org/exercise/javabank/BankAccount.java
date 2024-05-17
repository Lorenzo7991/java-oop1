package org.exercise.javabank;
import java.lang.Math;

public class BankAccount {
    // Attributes
    private int bankAccountNumber;
    private String userName;
    private double bankBalance;

    // Builder
    public BankAccount(String userName){
        this.bankAccountNumber = generateBankAccountNumber();
        this.userName = userName;
        this.bankBalance = 0.0;
    }

    // Private method to generate a random account number
    private int generateBankAccountNumber(){
        // Function math to generates a random number between 1 and 1000
        return (int) (Math.random() * 1000) + 1;
    }

    // Getter methods
    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public double getBankBalance() {
        return bankBalance;
    }
}
