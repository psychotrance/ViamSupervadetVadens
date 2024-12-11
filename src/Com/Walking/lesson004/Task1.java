package Com.Walking.lesson004;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        long result = 1;

        for (int i = number; i > 1; i--) {
            result *= i;
            System.out.println(result);
        }
        System.out.printf("Factorial of %d = %d", number, result);
    }
}
