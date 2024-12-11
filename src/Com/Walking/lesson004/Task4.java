package Com.Walking.lesson004;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a second number: ");
        int num2 = scanner.nextInt();

        for (int num1 = 1; num1 <= 10; num1++) {
            if (num1 == num2) {
                System.out.println("numbers is equals!");
            } else if (num1 % 2 == 0) {
                System.out.println(num1 + num2);
            } else {
                System.out.println(num1 - num2);
            }
        }
    }
}
