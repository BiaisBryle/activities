import java.util.Scanner;
import banking.bankingclass;

public class Appsecb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bankingclass bc = new bankingclass();

                int accAttempts = 0;
                boolean accountVerified = false;
                int enteredAccountNo = 0;

              
                while (accAttempts < 3 && !accountVerified) {
                    System.out.print("Enter your Account No: ");
                    enteredAccountNo = sc.nextInt();

                    if (enteredAccountNo == bc.setAccount()) {
                        accountVerified = true;
                    } else {
                        accAttempts++;
                        System.out.println("❌ INVALID ACCOUNT! Attempts left: " + (3 - accAttempts));
                        if (accAttempts == 3) {
                            System.out.println("🚫 Too many failed attempts. System will exit.");
                            System.exit(0);
                        }
                    }
                }

           
                int pinAttempts = 0;
                boolean pinVerified = false;

                while (pinAttempts < 3 && !pinVerified) {
                    System.out.print("Enter your PIN: ");
                    int enteredPin = sc.nextInt();

                    if (bc.verifyAccount(enteredAccountNo, enteredPin)) {
                        pinVerified = true;
                        System.out.println("✅ LOGIN SUCCESS!");
                    } else {
                        pinAttempts++;
                        System.out.println("❌ WRONG PIN! Attempts left: " + (3 - pinAttempts));
                        if (pinAttempts == 3) {
                            System.out.println("🚫 Too many incorrect PIN attempts. System will exit.");
                            System.exit(0);
                        }
                    }
                }

              
                System.out.println("🏦 Accessing your banking dashboard...");
                break;

            case 2:
                System.out.println("🩺 Doctor's appointment feature coming soon...");
                break;

            case 3:
                System.out.println("🛍️ Shopping feature coming soon...");
                break;

            default:
                System.out.println("❗ Invalid Selection!");
        }

        sc.close();
    }
}
