import java.util.Scanner;

public class NaturalNumberSum {
    int n;

    // Constructor to initialize the value of n
    NaturalNumberSum(int n) {
        this.n = n;
    }

    // Method to calculate the sum
    int calculateSum() {
        return n * (n + 1) / 2;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Create an object of NaturalNumberSum
        NaturalNumberSum sumCalculator = new NaturalNumberSum(num);

        // Call the method and print the result
        int result = sumCalculator.calculateSum();
        System.out.println("The sum of the first " + num + " natural numbers is: " + result);

        scanner.close();
    }
}
