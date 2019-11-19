package Chapter10;

import Chapter9.Account;

import java.util.Scanner;

public class ATMmachine {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Account[] account = new Account[10];

        for (int i = 0; i < 10; i++) {
            account[i] = new Account(i, 100.0);
        }

        System.out.print("Enter an id: ");
        int id = input.nextInt();

        if (id < 0 || id > 9) {
            id = incorrectId(id);
        }

        while (true) { //terminal stays on menuDisplay screen
            menuDisplay();
            System.out.print("Enter a choice: ");
            int choice = input.nextInt();

            if (choice == 4) {
                System.out.println("Enter an id: ");
                id = input.nextInt();

                if (id < 0 || id > 9) {
                    id = incorrectId(id);
                }
            }
            performChoice(id, choice, account);
        }
    }

    public static int incorrectId(int id) {
        while (id < 0 || id > 9) {
            System.out.print("Please enter a valid id: ");
            id = input.nextInt();
            System.out.println();
        }
        return id;
    }

    public static void performChoice(int id, int choice, Account[] accounts) {
        switch (choice) {
            case 1:
                System.out.println("The balance is " + accounts[id].getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                accounts[id].withdraw(input.nextDouble());
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                accounts[id].deposit(input.nextDouble());
                break;
            default:
                break;
        }
    }

    public static void menuDisplay() {
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }
}
