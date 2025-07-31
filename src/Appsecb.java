import java.util.Scanner;
import banking.bankingclass;

public class Appsecb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO, WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel like doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Doctor's Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bankingclass bc = new bankingclass();
                boolean isValid = false;

                // Limit to 3 attempts
                for (int attempt = 1; attempt <= 3; attempt++) {
                    System.out.print("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.print("Enter your PIN: ");
                    int pin = sc.nextInt();

                    if (bc.verifyAccount(accountNo, pin)) {
                        System.out.println("LOGIN SUCCESS!");
                        isValid = true;
                        break;
                    } else {
                        System.out.println("❌ INVALID ACCOUNT NUMBER OR PIN!");
                        if (attempt < 3) {
                            System.out.println("⚠️ Attempts remaining: " + (3 - attempt));
                        }
                    }
                }

                if (!isValid) {
                    System.out.println("🚫 Too many failed attempts. System will now exit.");
                    System.exit(0);
                }

                // Proceed with banking services if login is successful
                // Example: bc.showMenu();

                break;

            case 2:
                System.out.println("You chose Doctor's Appointment.");
                // Add code here for doctor's appointment
                break;

            case 3:
                System.out.println("You chose Shopping.");
                // Add code here for shopping
                break;

            default:
                System.out.println("❗ Invalid Selection!");
        }

        sc.close();
    }
}
