package org.ies.bank.components;

import java.util.Scanner;

public class BankApp {

    public class BankApp {


    }
    public void run() {
        Bank bank = bankReader.read();

        int option;
        do {
            option = chooseOption();
            if (option == 1) {
                bank.showAccounts();
            } else if (option == 2) {
                System.out.println("Introduce el IBAN");
                String iban = scanner.nextLine();
                bank.showAccount(iban);

            }
        }
    }
}
