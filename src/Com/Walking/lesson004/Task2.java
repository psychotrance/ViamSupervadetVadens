package Com.Walking.lesson004;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = number; i > 0; i--) {
            if (i < 0)
                i *= -1;
            sum += i;
        }

        System.out.printf("Digit sum of the number %d = %d", number, sum);
    }
}
