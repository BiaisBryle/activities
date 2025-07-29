import java.util.Scanner;

public class bryleact3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();
        if (number1 > 0) {
            System.out.println(number1 + " is a positive number");
        } else if (number1 < 0) {
            System.out.println(number1 + " is a negative number");
        } else {
            System.out.println("Inputted number Zero");
        }

      
        System.out.print("Enter a number: ");
        int number2 = scanner.nextInt();
        if (number2 > 0) {
            System.out.println(number2 + " is a positive number");
        } else if (number2 < 0) {
            System.out.println(number2 + " is a negative number");
        } else {
            System.out.println("Inputted number Zero");
        }

      
        System.out.print("Enter a number: ");
        int number3 = scanner.nextInt();
        if (number3 > 0) {
            System.out.println(number3 + " is a positive number");
        } else if (number3 < 0) {
            System.out.println(number3 + " is a negative number");
        } else {
            System.out.println("Inputted number Zero");
        }

        scanner.close();
    }
}