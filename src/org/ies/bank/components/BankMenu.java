package org.ies.bank.components;

import org.ies.bank.model.Bank;

import java.util.Scanner;

public class BankMenu {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        int option = scanner.nextInt();
        scanner.nextLine();
        do {
            if (option ==1) {

            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 4) {

            } else if (option == 5) {

            } else if (option == 6) {

            } else if (option == 7) {

            } else if (option == 8) {

            }
        } while (option != 9);
    }

    public void transferOption(Bank bank) {
        System.out.println("Introduce el IBAN de la cuenta origen");
        String iban = scanner.nextLine();

        System.out.println("Introduce el IBAN de la cuenta destino");
        String iband = scanner.nextLine();


    }

}
