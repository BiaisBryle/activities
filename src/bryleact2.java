import java.util.Scanner;

public class bryleact2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();
        checkNumber(number1);
        
      
        System.out.print("Enter a number: ");
        int number2 = scanner.nextInt();
        checkNumber(number2);
        
       
        System.out.print("Enter a number: ");
        int number3 = scanner.nextInt();
        checkNumber(number3);
        
        scanner.close();
    }

    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("Inputted number Zero");
        } else if (number % 2 == 0) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }
    }
}
