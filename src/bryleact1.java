import java.util.Scanner;

public class bryleact1 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
       
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        
        System.out.print("Enter marks in Science: ");
        int science = scanner.nextInt();
        
        System.out.print("Enter marks in History: ");
        int history = scanner.nextInt();
        
        System.out.print("Enter marks in Math: ");
        int math = scanner.nextInt();
        
        System.out.print("Enter marks in Soc: ");
        int soc = scanner.nextInt();
        
        System.out.print("Enter marks in Arts: ");
        int arts = scanner.nextInt();

      
        int totalMarks = science + history + math + soc + arts;
        double percentage = (totalMarks / 5.0);

      
        String remarks;
        if (percentage < 70) {
            remarks = "Fail";
            System.out.println("Try Again.");
        } else if (percentage <= 75) {
            remarks = "Poor";
        } else if (percentage <= 80) {
            remarks = "Fair";
        } else if (percentage <= 85) {
            remarks = "Good";
        } else if (percentage <= 90) {
            remarks = "Very Good";
        } else {
            remarks = "Excellent";
        }

        
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Total percentage: %.2f\n", percentage);
        System.out.println("Remarks: " + remarks);
        
        if (percentage >= 70) {
            System.out.println("Congrats " + name + ", you Passed.");
        }
        
        scanner.close();
    }
}