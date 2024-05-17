package org.exercise.javabank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Username input
        System.out.println("Inserisci il tuo nome");
        String userName = scanner.nextLine();

        //Create a user bank account with the username and a random account number
        BankAccount userBankAccount = new BankAccount(userName);

        // Variable to track choice
        int option;
        // User menu
        do {
            System.out.println("Ciao " + userName + ", " + "Cosa vuoi fare?");
            System.out.println("1. Versare una somma di denaro");
            System.out.println("2. Prelevare una somma di denaro");
            System.out.println("3. Uscire");
            System.out.print("Scelta: ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    // Deposit
                    System.out.print("Inserisci la somma da versare: ");
                    double amountPaid = Double.parseDouble(scanner.nextLine());
                    userBankAccount.deposit(amountPaid);
                    System.out.println("Operazione completata. Saldo attuale: " + String.format("%.2f", userBankAccount.getBankBalance()) + "€");
                    break;
                case 2:
                    // Withdrawal
                    System.out.print("Inserisci la somma da prelevare: ");
                    double amountWithdrawn = Double.parseDouble(scanner.nextLine());
                    if(userBankAccount.withdrawal(amountWithdrawn)){
                        System.out.println("Operazione completata. Saldo attuale: " + String.format("%.2f", userBankAccount.getBankBalance()) + "€");
                    } else {
                        System.out.println("Errore: saldo insufficiente.");
                    }
                    break;
                case 3:
                    // Exit
                    System.out.println("Programma terminato... Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprovare...");
            }
        } while (option != 3);
        scanner.close();
    }

}

