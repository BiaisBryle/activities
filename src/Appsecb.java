import java.util.Scanner;
import banking.bankingclass;

public class Appsecb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankingclass[] bApp = new bankingclass[10];
        int accountIndex = 0;

        System.out.println("WELCOME TO MY SYSTEM");

        boolean running = true;
        while (running) {
            System.out.println("\nWhat do you feel like doing today?");
            System.out.println("1 - Banking");
            System.out.println("2 - Doctor Appointment");
            System.out.println("3 - Shopping");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n1 - Create Account");
                    System.out.println("2 - Login to Account");
                    System.out.println("3 - View All Accounts");
                    System.out.print("Enter your selection: ");
                    int action = sc.nextInt();

                    switch (action) {
                        case 1:
                            if (accountIndex >= bApp.length) {
                                System.out.println("Cannot create more accounts.");
                                break;
                            }

                            System.out.print("Enter Account No.: ");
                            int accNo = sc.nextInt();
                            System.out.print("Enter PIN: ");
                            int pin = sc.nextInt();
                            System.out.print("Confirm PIN: ");
                            int pinConfirm = sc.nextInt();

                            if (pin == pinConfirm) {
                                bankingclass newAccount = new bankingclass();
                                newAccount.setAccNo(accNo);
                                newAccount.setPin(pin);
                                bApp[accountIndex++] = newAccount;
                                System.out.println("Account created successfully!");
                            } else {
                                System.out.println("PINs do not match. Try again.");
                            }
                            break;

                        case 2:
                            int attempts = 0;
                            boolean isAuthenticated = false;
                            bankingclass loggedInAccount = null;

                            while (attempts < 3 && !isAuthenticated) {
                                System.out.print("Enter Account No.: ");
                                int enteredAccNo = sc.nextInt();
                                System.out.print("Enter PIN: ");
                                int enteredPin = sc.nextInt();

                                for (int i = 0; i < accountIndex; i++) {
                                    if (bApp[i].verifyAccount(enteredAccNo, enteredPin)) {
                                        loggedInAccount = bApp[i];
                                        isAuthenticated = true;
                                        break;
                                    }
                                }

                                if (!isAuthenticated) {
                                    attempts++;
                                    if (attempts < 3) {
                                        System.out.println("Invalid credentials. Attempts left: " + (3 - attempts));
                                    } else {
                                        System.out.println("Maximum login attempts reached. Returning to main menu.");
                                    }
                                }
                            }

                            if (isAuthenticated) {
                                System.out.println("Login successful!");
                                System.out.println("1 - Deposit");
                                System.out.println("2 - Withdraw");
                                System.out.println("3 - Check Balance");
                                System.out.print("Enter your choice: ");
                                int option = sc.nextInt();

                                switch (option) {
                                    case 1:
                                        System.out.print("Enter amount to deposit: ");
                                        float depositAmount = sc.nextFloat();
                                        loggedInAccount.deposit(depositAmount);
                                        break;

                                    case 2:
                                        System.out.print("Enter amount to withdraw: ");
                                        float withdrawAmount = sc.nextFloat();
                                        loggedInAccount.withdraw(withdrawAmount);
                                        break;

                                    case 3:
                                        System.out.println("Your current balance is: " + loggedInAccount.getBalance());
                                        break;

                                    default:
                                        System.out.println("Invalid option.");
                                        break;
                                }
                            }
                            break;

                        case 3:
                            if (accountIndex == 0) {
                                System.out.println("No accounts have been created yet.");
                            } else {
                                System.out.println("Existing Accounts:");
                                for (int i = 0; i < accountIndex; i++) {
                                    System.out.println("Account No.: " + bApp[i].getAccNo() +
                                                       ", Balance: " + bApp[i].getBalance());
                                }
                            }
                            break;

                        default:
                            System.out.println("Invalid selection.");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Doctor appointment functionality not implemented yet.");
                    break;

                case 3:
                    System.out.println("Shopping feature not implemented yet.");
                    break;

                default:
                    System.out.println("Invalid selection.");
                    break;
            }

            System.out.print("\nDo you want to continue? (Y/N): ");
            char response = sc.next().charAt(0);
            running = (response == 'Y' || response == 'y');
        }

        System.out.println("Thank you for using the system.");
        sc.close();
    }
}
