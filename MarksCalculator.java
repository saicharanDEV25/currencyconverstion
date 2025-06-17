import java.util.Scanner;

public class MarksCalculator {

    // Method to calculate percentage
    public static double calculatePercentage(int M, int P, int C) {
        return ((M + P + C) / 300.0) * 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter marks in Math: ");
        int M = scanner.nextInt();

        System.out.print("Enter marks in Physics: ");
        int P = scanner.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int C = scanner.nextInt();

        // Calling method to calculate percentage
        double percentage = calculatePercentage(M, P, C);

        // Displaying result
        System.out.printf("Percentage: %.2f%%\n", percentage);
        
        scanner.close();
    }
}