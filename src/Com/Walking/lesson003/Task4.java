package Com.Walking.lesson003;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        double result;

        if (num1 % 2 == 0 && num2 % 3 == 0) {
            result = Math.pow((double) num1, (double) num2);

            if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
                System.out.print("Result is too much!");
            else
                System.out.println(result);
        }
        else if (num1 % 2 == 0 || num2 % 3 == 0) {
            System.out.println(num1 == num2);
        }
        else
            System.out.println("something's wrong");
    }
}
