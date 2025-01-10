package org.ies.bank.components;

import org.ies.bank.model.Bank;

import java.util.Scanner;

public class BankApp {
    // Se necesita el Scanner para hacer el menu
    private final Scanner scanner;
    // Se necesita el BankReader para pedir un banco al usuario
    private final BankReader bankReader;

    public BankApp(Scanner scanner, BankReader bankReader) {
        this.scanner = scanner;
        this.bankReader = bankReader;
    }

    public void run() {
        // Siempre empezamos pidiendo los datos con el reader
        Bank bank = bankReader.read();

        int option;
        do {
            option = chooseOption();
            if (option == 1) {
                // Mostrar cuentas
                bank.showAccounts();
            } else if (option == 2) {
                // Mostrar datos cuenta
                System.out.println("Introduce el IBAN:");
                String iban = scanner.nextLine();
                bank.showAccount(iban);
            } else if (option == 5) {
                System.out.println("Introduce el iban");
                String iban = scanner.nextLine();

                System.out.println("¿Cuanta cantidad vas a sacar?");
                double amount = scanner.nextDouble();
                bank.withdraw(iban, amount);
                } // else if (option ==6) {
                //System.out.println("Introduce el NIF");
                //String nif = scanner.nextLine();

                //int customerAccountsNumber = bank.countCustomerAccounts(nif);
                //System.out.println("El cliente tiene " + customerAccountsNumber + "cuentas");
                //} else if (option == 7) {
                //    System.out.println("Introduce el iban");
                //    String iban = scanner.nextLine();

                //    bank.showAccountsCustomer(iban);
            //}
        } while (option != 8);
    }

    private int chooseOption() {
        int option;
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1. Mostrar cuentas");
            System.out.println("2. Mostrar datos cuenta");
            System.out.println("3. Mostrar cuentas de cliente");
            System.out.println("4. Ingresar");
            System.out.println("5. Sacar");
            System.out.println("6. Salir");
            System.out.println("7. ");
            option = scanner.nextInt();
            scanner.nextLine();
        } while (option < 1 || option > 6);
        return option;
    }
}