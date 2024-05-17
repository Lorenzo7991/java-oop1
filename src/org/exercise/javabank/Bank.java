package org.exercise.javabank;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Username input
        String userName;
        do {
            System.out.println("Inserisci il tuo nome:");
            userName = scanner.nextLine().trim();
            // Username validation
            if (userName.isEmpty()) {
                System.out.println("Il nome utente non può essere vuoto. Riprova.");
            } else if (!userName.matches("[a-zA-Z]+")) {
                System.out.println("Il nome utente può contenere solo caratteri alfabetici. Riprova.");
            }
            // Keep asking username until the validation is correct
        } while (userName.isEmpty() || !userName.matches("[a-zA-Z]+"));

        //Create a user bank account with the username and a random account number
        BankAccount userBankAccount = new BankAccount(userName);

        // Variable to track choice
        int option;
        // User menu
        do {
            System.out.println("Ciao, cosa vuoi fare?");
            System.out.println("1. Versare una somma di denaro");
            System.out.println("2. Prelevare una somma di denaro");
            System.out.println("3. Uscire");
            System.out.print("Scelta: ");

            // Validate user input
            while (!scanner.hasNextInt()) {
                System.out.println("Errore: devi inserire un numero valido.");
                System.out.print("Scelta: ");
                scanner.next();
            }
            option = scanner.nextInt();

            // Handle user choice
            switch (option) {
                case 1:
                    // Deposit
                    double amountPaid;
                    do {
                        System.out.print("Inserisci la somma da versare: ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Errore: inserisci un importo valido.");
                            System.out.print("Inserisci la somma da versare: ");
                            scanner.next();
                        }
                        amountPaid = scanner.nextDouble();
                        if (amountPaid <= 0) {
                            System.out.println("Errore: inserisci un importo positivo.");
                        }
                    } while (amountPaid <= 0);
                    userBankAccount.deposit(amountPaid);
                    System.out.println("Operazione completata. Saldo attuale: " + String.format("%.2f", userBankAccount.getBankBalance()) + "€");
                    break;
                case 2:
                    // Withdrawal
                    double amountWithdrawn;
                    do {
                        System.out.print("Inserisci la somma da prelevare: ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Errore: inserisci un importo valido.");
                            System.out.print("Inserisci la somma da versare: ");
                            scanner.next();
                        }
                        amountWithdrawn = scanner.nextDouble();
                        if (amountWithdrawn <= 0) {
                            System.out.println("Errore: inserisci un importo positivo.");
                        }
                    } while (amountWithdrawn <= 0);
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
